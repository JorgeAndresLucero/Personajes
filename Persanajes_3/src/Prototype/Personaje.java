/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /* @author Jorge Andrés
 */
package Prototype;


public class Personaje implements Cloneable {
    
    private String arma;
    private String escudo;

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }
    
     @Override
    public Personaje clone() {
        Personaje personajeClonado = null;
        try {
            personajeClonado = (Personaje) super.clone();
            personajeClonado.setArma(arma);
            personajeClonado.setEscudo(escudo);
            
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } // catch	
        return personajeClonado;
    } // method clone

    public String personaje() {
        return "TIPO: " +"ARMA:"+ getArma() + "ESCUDO:  " + getEscudo();
    }
    
}
