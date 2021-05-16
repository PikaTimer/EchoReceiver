/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pikatimer.echoreceiver;

import java.io.File;
import java.util.prefs.Preferences;

/**
 *
 * @author john
 */
public class RelayPrefs {
    private static final Preferences prefs = Preferences.userRoot().node("RelayReceiver");
    private File outputDir = null;
    private String echoEndpoint = "";

    /**
    * SingletonHolder is loaded on the first execution of Singleton.getInstance() 
    * or the first access to SingletonHolder.INSTANCE, not before.
    */
    
    private static class SingletonHolder { 
            private static final RelayPrefs INSTANCE = new RelayPrefs();
    }

    public static RelayPrefs getInstance() {
        
            return SingletonHolder.INSTANCE;
    }
    
    public Preferences getPreferences(){
        return prefs;
    }
    
    public File getOutputDir(){
        return outputDir;
    }
    
    public void setOutputDir(File d){
        outputDir = d;
    }
    
    public String getEchoEndpoint(){
        return echoEndpoint;
    }
    
    public void setEchoEndpoint(String e){
        echoEndpoint = e;
    }
    
}
