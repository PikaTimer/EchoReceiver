/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pikatimer.echoreceiver;

/**
 *
 * @author john
 */

// This is a hack to get around the JavaFX launcher stuff for jar distributions
// See https://stackoverflow.com/questions/52653836/maven-shade-javafx-runtime-components-are-missing/52654791#52654791
public class EchoReceiver {
    
    public static void main(String[] args) {
        Receiver.main(args);
    }
    
}
