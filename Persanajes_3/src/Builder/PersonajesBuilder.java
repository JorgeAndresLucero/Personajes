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
public abstract class PersonajesBuilder  {
    protected Personajes per;
    
    public Personajes getPersonajes() {
        return per;
    }
    // Se creó un método para instanciar el objeto p 
    public void CrearNuevoPersonaje(){
        per = new Personajes();
    }
    
    public abstract void construiraArma();
    public abstract void construirEscudo();
}
