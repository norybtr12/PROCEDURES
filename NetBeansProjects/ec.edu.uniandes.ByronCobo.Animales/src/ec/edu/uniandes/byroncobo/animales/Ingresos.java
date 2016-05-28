/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.uniandes.byroncobo.animales;

import java.util.ArrayList;

/**
 *
 * @author BYRON
 */
public class Ingresos {

    /**
     * @param args the command line arguments
     */
      
    
    
    public static void main(String[] args) {
        // TODO code application logic here
             ArrayList<clsAnimales> animal = new ArrayList<clsAnimales>();
            clsAnimales p0 = new clsAnimales(001, "Elefante", (java.sql.Date.valueOf("1993-01-30"))  , (Float.parseFloat("100.79")),clsAnimales.Tipos.Vertebrados, clsAnimales.Clasif.Mamiferos);
            clsAnimales p1 = new clsAnimales(002, "Ardilla", (java.sql.Date.valueOf("2000-02-22"))   , (Float.parseFloat("50.78")),clsAnimales.Tipos.Vertebrados, clsAnimales.Clasif.Mamiferos);
            clsAnimales p2 = new clsAnimales(003, "Caballo", (java.sql.Date.valueOf("2001-03-15"))   , (Float.parseFloat("89.1")),clsAnimales.Tipos.Vertebrados, clsAnimales.Clasif.Mamiferos);
            clsAnimales p3 = new clsAnimales(004, "Oso", (java.sql.Date.valueOf("2002-04-17"))       , (Float.parseFloat("83.3")),clsAnimales.Tipos.Vertebrados, clsAnimales.Clasif.Mamiferos);
            clsAnimales p4 = new clsAnimales(005, "Jirafa", (java.sql.Date.valueOf("2003-05-20"))    , (Float.parseFloat("90.10")),clsAnimales.Tipos.Vertebrados, clsAnimales.Clasif.Mamiferos);
            clsAnimales p5 = new clsAnimales(006, "Cangrejo", (java.sql.Date.valueOf("2004-06-12"))  , (Float.parseFloat("1.79")),clsAnimales.Tipos.invertebrados, clsAnimales.Clasif.Oviparos);
            clsAnimales p6 = new clsAnimales(007, "Escorpion", (java.sql.Date.valueOf("2005-07-16")) , (Float.parseFloat("2.2")),clsAnimales.Tipos.invertebrados, clsAnimales.Clasif.Oviparos);
            clsAnimales p7 = new clsAnimales(123, "Mariposas", (java.sql.Date.valueOf("2006-08-11")) , (Float.parseFloat("7.23")),clsAnimales.Tipos.invertebrados, clsAnimales.Clasif.Oviparos);
            clsAnimales p8 = new clsAnimales(456, "Cienpies", (java.sql.Date.valueOf("2007-09-12"))  , (Float.parseFloat("1.79")),clsAnimales.Tipos.invertebrados, clsAnimales.Clasif.Oviparos);
            clsAnimales p9 = new clsAnimales(789, "Arañas", (java.sql.Date.valueOf("2008-10-13"))    , (Float.parseFloat("2.29")),clsAnimales.Tipos.invertebrados, clsAnimales.Clasif.Oviparos);

            
            animal.add(p0);
             animal.add(p1);
              animal.add(p2);
               animal.add(p3);
                animal.add(p4);
                 animal.add(p5);
                  animal.add(p6);
                   animal.add(p7);
                    animal.add(p8);
                     animal.add(p9);
                       imprimir(animal);


        
    }

    private static void imprimir(ArrayList<clsAnimales> anima) {
        for (clsAnimales anim : anima) 
        {
            System.out.println("------------------------");
            System.out.println("Id: " + anim.Id());
            System.out.println("Nombre: " + anim.Nombre());
            System.out.println("Fecha: " + anim.Apareamiento());
            System.out.println("Peso : " + anim.Peso());
            System.out.println("Tipo : " + anim.Tipos());
            System.out.println("Clasificacion : " + anim.Clasificacion());
            System.out.println("");             
                      
        }
    }      
            
            
}
    

