/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Utils.DBConnexion;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


import services.gererdemande;

/**
 *
 * @author hamza
 */
public class Test {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DBConnexion.connecterDB();
        //Date aujourdhui = SystemClockFactory.getDatetime();
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
Date now = new Date();
        DateFormat dateFormatYMD = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        String vDateYMD = dateFormatYMD.format(now);
       // gererdemande.ajouterdemande(5, "hhh",  vDateYMD, 4, 45);
        gererdemande.modifierdemande(6, "hhh", vDateYMD, 20, 35);
    
        //gererdemande.supprimerdemande(5, "hhh",  vDateYMD, 4, 45);
    }
    
    
    
}