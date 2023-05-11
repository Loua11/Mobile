/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compaby.myapp.gui;

import com.codename1.io.Preferences;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class SessionManager {
   
    public static Preferences pref;
    
    
    
    private static int id;
    private static String titre;
    private static Date date;
    private static String lieu;
    private static String image;
    private static Date updated_at;

    public static Preferences getPref() {
        return pref;
    }

    public static void setPref(Preferences pref) {
        SessionManager.pref = pref;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        SessionManager.id = id;
    }

    public static String getTitre() {
        return titre;
    }

    public static void setTitre(String titre) {
        SessionManager.titre = titre;
    }

    public static Date getDate() {
        return date;
    }

    public static void setDate(Date date) {
        SessionManager.date = date;
    }

    public static String getLieu() {
        return lieu;
    }

    public static void setLieu(String lieu) {
        SessionManager.lieu = lieu;
    }

    public static String getImage() {
        return image;
    }

    public static void setImage(String image) {
        SessionManager.image = image;
    }

    public static Date getUpdated_at() {
        return updated_at;
    }

    public static void setUpdated_at(Date updated_at) {
        SessionManager.updated_at = updated_at;
    }
    
    
    
    
}
