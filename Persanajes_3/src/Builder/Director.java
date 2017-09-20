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
public class Director {
    
    private PersonajesBuilder personajesbuilder;
    
    public void setPersonajesBuilder(PersonajesBuilder per ){
        personajesbuilder = per;
        
        
    }
    
     Personajes getPersonajes(){
        return personajesbuilder.getPersonajes();
    }
    
    public void construirPersonaje(){
        personajesbuilder.CrearNuevoPersonaje();
        personajesbuilder.construiraArma();
        personajesbuilder.construirEscudo();
        
    }
}
