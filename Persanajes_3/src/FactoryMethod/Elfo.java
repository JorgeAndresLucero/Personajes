/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author Jorge Andrés
 */
public class Elfo implements Personaje {

    @Override
    public String crear() {
       return "Elfo";
    }
    
}
