
IF DB_ID(N'Info') IS NULL
    CREATE DATABASE [Info];
GO

USE [Info];
GO

IF OBJECT_ID(N'dbo.Usuario', N'U') IS NULL
BEGIN
    CREATE TABLE dbo.Usuario (
        Cedula       INT            NOT NULL,
        Nombre       NVARCHAR(80)   NOT NULL,
        Apellido     NVARCHAR(80)   NOT NULL,
        Ubicaccion   NVARCHAR(200)  NOT NULL,
        Correo       NVARCHAR(254)  NOT NULL,
        Contraseña   NVARCHAR(255)  NOT NULL,
        CONSTRAINT PK_Usuario PRIMARY KEY (Cedula),
        CONSTRAINT UQ_Usuario_Correo UNIQUE (Correo)
    );
END;
GO

IF OBJECT_ID(N'dbo.PRODUCTOS', N'U') IS NULL
BEGIN
    CREATE TABLE dbo.PRODUCTOS (
        Producto_ID     INT IDENTITY(1,1) NOT NULL,
        Nombre_Producto NVARCHAR(150)     NOT NULL,
        Precio          DECIMAL(10,2)     NOT NULL,
        CONSTRAINT PK_PRODUCTOS PRIMARY KEY (Producto_ID),
        CONSTRAINT CK_PRODUCTOS_Precio CHECK (Precio >= 0)
    );
END;
GO

IF OBJECT_ID(N'dbo.CARRO', N'U') IS NULL
BEGIN
    CREATE TABLE dbo.CARRO (
        Carro_ID  INT IDENTITY(1,1) NOT NULL,
        Usuario_Id INT               NOT NULL,
        Estado    VARCHAR(12)         NOT NULL CONSTRAINT DF_CARRO_Estado DEFAULT ('ACTIVO'),
        CONSTRAINT PK_CARRO PRIMARY KEY (Carro_ID),
        CONSTRAINT FK_CARRO_Usuario FOREIGN KEY (Usuario_Id)
            REFERENCES dbo.Usuario (Cedula),
        CONSTRAINT CK_CARRO_Estado CHECK (Estado IN ('ACTIVO', 'PAGADO', 'CANCELADO'))
    );
END;
GO

IF OBJECT_ID(N'dbo.DETALLE_CARRO', N'U') IS NULL
BEGIN
    CREATE TABLE dbo.DETALLE_CARRO (
        Detalle_ID     INT IDENTITY(1,1) NOT NULL,
        Carro_ID       INT               NOT NULL,
        Producto_ID    INT               NOT NULL,
        Precio         DECIMAL(10,2)     NOT NULL,
        Nombre_Producto NVARCHAR(150)    NOT NULL,
        Cantidad       INT               NOT NULL,
        Subtotal       DECIMAL(12,2)     NOT NULL,
        CONSTRAINT PK_DETALLE_CARRO PRIMARY KEY (Detalle_ID),
        CONSTRAINT FK_DETALLE_CARRO_Carro FOREIGN KEY (Carro_ID)
            REFERENCES dbo.CARRO (Carro_ID),
        CONSTRAINT FK_DETALLE_CARRO_Producto FOREIGN KEY (Producto_ID)
            REFERENCES dbo.PRODUCTOS (Producto_ID),
        CONSTRAINT UQ_DETALLE_CARRO_Carro_Producto UNIQUE (Carro_ID, Producto_ID),
        CONSTRAINT CK_DETALLE_CARRO_Cantidad CHECK (Cantidad > 0),
        CONSTRAINT CK_DETALLE_CARRO_Precio CHECK (Precio >= 0),
        CONSTRAINT CK_DETALLE_CARRO_Subtotal CHECK (Subtotal >= 0)
    );
END;
GO

/* Una cuenta solo puede tener un carrito activo. */
IF NOT EXISTS (
    SELECT 1 FROM sys.indexes
    WHERE object_id = OBJECT_ID(N'dbo.CARRO')
      AND name = N'UX_CARRO_UnActivoPorUsuario'
)
    CREATE UNIQUE INDEX UX_CARRO_UnActivoPorUsuario
        ON dbo.CARRO (Usuario_Id) WHERE Estado = 'ACTIVO';
GO

IF NOT EXISTS (SELECT 1 FROM sys.indexes WHERE object_id = OBJECT_ID(N'dbo.DETALLE_CARRO') AND name = N'IX_DETALLE_CARRO_Carro')
    CREATE INDEX IX_DETALLE_CARRO_Carro ON dbo.DETALLE_CARRO (Carro_ID);
GO

