/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Jorge Andrés
 */
public class FabricaParaHumanos implements FabricaAbstracta {

    @Override
    public Arma CrearArmas() {
        return new Espada();
    }

    @Override
    public Escudo CrearEscudos() {
       return new EscudoBreaveHeart();
    }
    
}
