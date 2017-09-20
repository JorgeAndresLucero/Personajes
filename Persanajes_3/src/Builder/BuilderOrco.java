/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;



/**
 *
 * @author Jorge Andrés
 */
public class BuilderOrco extends PersonajesBuilder{

    @Override
    public void construiraArma() {
          per.setArma("arma de orcos");
    }

    @Override
    public void construirEscudo() {
        per.setEscudo("escudo de orcos");
    }
}
