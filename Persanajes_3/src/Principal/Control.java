/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;


import AbstractFactory.Arma;
import AbstractFactory.Escudo;
import AbstractFactory.FabricaAbstracta;
import AbstractFactory.FabricaParaElfos;
import AbstractFactory.FabricaParaHobbits;
import AbstractFactory.FabricaParaHumanos;
import AbstractFactory.FabricaParaMagos;
import AbstractFactory.FabricaParaOrcos;
import Builder.Director;
import Builder.PersonajesBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import AbstractFactory.*;
import Builder.BuilderElfos;
import Builder.BuilderHobbits;
import Builder.BuilderHumano;
import Builder.BuilderOrco;
import FactoryMethod.CreadorAbstracto;
import FactoryMethod.CreadorDeElfos;
import FactoryMethod.CreadorDeHobbits;
import FactoryMethod.CreadorDeHumanos;
import FactoryMethod.CreadorDeMagos;
import FactoryMethod.CreadorDeOrcos;
import FactoryMethod.Personaje;

/**
 *
 * @author Jorge Andrés
 */
public class Control {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int opcion;
    char validar;
    
    CreadorAbstracto creador;
    FabricaAbstracta fabrica;
    
    Arma a;
    Escudo b;
    Personaje p;
    
    Director d = new Director();
    PersonajesBuilder orco = new BuilderOrco(); 
    PersonajesBuilder humano = new BuilderHumano();
    PersonajesBuilder hobbit = new BuilderHobbits(); 
    PersonajesBuilder elfo = new BuilderElfos();
    PersonajesBuilder mago = new BuilderElfos();
    
   
    
       
    public String operacion() throws IOException  {
        
        do{
              
        System.out.println("Seleccione cual quiere crear");
        System.out.println("1. Crear un Orco");
        System.out.println("2. Crear un Mago");
        System.out.println("3. Crear un Humano");
        System.out.println("4. Crear un Hobbit");
        System.out.println("5. Crear un Elfo");
        
        try{
            opcion = Integer.parseInt(in.readLine());
        }catch (IOException | NumberFormatException e){
            System.out.println("Por favor seleccione un dato correcto");
        }
        

        switch (opcion) {
            case 1:
                
                creador = new CreadorDeOrcos();
                p = creador.crearPersonaje();
                System.out.println(p.crear());
                
                //abstract factory 
                    fabrica = new FabricaParaOrcos();
                    a = fabrica.CrearArmas();
                    b = fabrica.CrearEscudos();
                    
                    System.out.println(a.operacion());
                    System.out.println(b.operacion());
                
                d.setPersonajesBuilder(orco);
              
                
              
                     break;
                

            case 2:
                creador = new CreadorDeMagos();
                p = creador.crearPersonaje();
                System.out.println(p.crear());
                
                
                //abstract factory 
                    fabrica = new FabricaParaMagos();
                    a = fabrica.CrearArmas();
                    b = fabrica.CrearEscudos();
                    System.out.println(a.operacion());
                    System.out.println(b.operacion());
                    
                    
                    d.setPersonajesBuilder(mago);
                     System.out.println(mago.getPersonajes());
                
                break;

            case 3:
                creador = new CreadorDeHumanos();
                p = creador.crearPersonaje();
                System.out.println(p.crear());
                //abstract factory 
                    fabrica = new FabricaParaHumanos();
                    a = fabrica.CrearArmas();
                    b = fabrica.CrearEscudos();
                    
                    System.out.println(a.operacion());
                    System.out.println(b.operacion());
                
                    d.setPersonajesBuilder(humano);
                
                     System.out.println(humano.getPersonajes());
                break;

            case 4:
                creador = new CreadorDeHobbits();
                p = creador.crearPersonaje();
                System.out.println(p.crear());
                //abstract factory 
                    fabrica = new FabricaParaHobbits();
                    a = fabrica.CrearArmas();
                    b = fabrica.CrearEscudos();
                    
                    System.out.println(a.operacion());
                    System.out.println(b.operacion());
                
                    
                    d.setPersonajesBuilder(hobbit);
                 System.out.println(hobbit.getPersonajes());
                
                break;

            case 5:
                creador = new CreadorDeElfos();
                p = creador.crearPersonaje();
                System.out.println(p.crear());
                //abstract factory 
                    fabrica = new FabricaParaElfos();
                    a = fabrica.CrearArmas();
                    b = fabrica.CrearEscudos();
                    
                    System.out.println(a.operacion());
                    System.out.println(b.operacion());
                
                    d.setPersonajesBuilder(elfo);
                    System.out.println(elfo.getPersonajes());
                
                break;
                
            default:
                System.out.println("Dato Incorrecto");
                break;
        }
         
        }while(opcion != 1 && opcion !=2 && opcion != 3 && opcion !=4 && opcion != 5);
              
        
        
        
        return "";
             
    }
   
}
