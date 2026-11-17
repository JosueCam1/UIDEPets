
package com.mycompany.uidepets;

public class SessionManager {
    private static Integer userId = null;
    
    public static void saveSession(int id) {
        userId = id;
    }
    
    public static Integer getCurrentUserId() {
        return userId;
    }
    
    public static boolean isLoggedIn() {
        return userId != null;
    }
    
    public static void logout() {
        userId = null;
    }
}