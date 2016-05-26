/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.uniandes.byroncobo;

import java.util.ArrayList;
import ec.edu.uniandes.byroncobo.clsProducto;
/**
 *
 * @author BYRON
 */
public class Metod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          ArrayList<clsProducto> producto = new ArrayList<clsProducto>();
        clsProducto p0 = new clsProducto(0, "Clavo", 20,clsProducto.unidad.litro);
        clsProducto p1 = new clsProducto(1, "Aceite", 10,clsProducto.unidad.litro);
        clsProducto p2 = new clsProducto(2, "Pollo", 20,clsProducto.unidad.libras);
        clsProducto p3 = new clsProducto(3, "Queso", 16,clsProducto.unidad.libras);
        clsProducto p4 = new clsProducto(4, "Leche", 83,clsProducto.unidad.libras);

producto.add(p0);
producto.add(p1);
producto.add(p2);
producto.add(p3);
producto.add(p4);
imprimir(producto);


        
    }

    private static void imprimir(ArrayList<clsProducto> producto) {
        for (clsProducto product : producto) 
        {
            System.out.println("*******************");
            System.out.println("Id: " + product.Id());
                System.out.println("Nombre: " + product.Nombre());
                    System.out.println("Valor : " + product.Valor());
                        System.out.println("Unidad: " + product.Unidad());
                        System.out.println("");
            
            
        }
    }
    
}
