/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import static AbstractFactory.Arma.a;
import static AbstractFactory.Escudo.e;

/**
 *
 * @author Jorge Andrés
 */
public class BuilderMagos extends PersonajesBuilder {

   @Override
    public void construiraArma() {
          per.setArma("arma de magos");
    }

    @Override
    public void construirEscudo() {
        per.setEscudo("escudo de magos");
    }
    
}
