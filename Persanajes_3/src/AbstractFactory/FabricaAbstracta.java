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
public interface FabricaAbstracta {
   FabricaAbstracta f = new FabricaAbstracta() {
       @Override
       public Arma CrearArmas() {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }

       @Override
       public Escudo CrearEscudos() {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }
   };
   
public Arma CrearArmas();
public Escudo CrearEscudos();


}
