/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;


import gui.Interfaz;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jorge Andrés
 */
public class Principal {
    
    public static void main (String args[]) throws IOException{
        
       
          Control co = new Control();
          System.out.println(co.operacion());
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
          
          
    
    }

   
}
