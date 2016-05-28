/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.uniandes.byroncobo.animales;

import java.util.Date;


/**
 *
 * @author BYRON
 */
public class clsAnimales {

    public int Id() {
        return _id;
    }

    public void Id(int _id) {
        this._id = _id;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public Date Apareamiento() {
        return _apareamiento;
    }

    public void Apareamiento(Date _apareamiento) {
        this._apareamiento = _apareamiento;
    }

    public float Peso() {
        return _peso;
    }

    public void Peso(float _peso) {
        this._peso = _peso;
    }

    public Tipos Tipos() {
        return _tipos;
    }

    public void Tipos(Tipos _tipos) {
        this._tipos = _tipos;
    }

    public Clasif Clasificacion() {
        return _clasificacion;
    }

    public void Clasificacion(Clasif _clasificacion) {
        this._clasificacion = _clasificacion;
    }
     public enum Tipos {Vertebrados, invertebrados};
     public enum Clasif{Oviparos, Mamiferos};
     
     private int _id;
     private String _nombre;
     private Date _apareamiento;
     private float _peso;
     private Tipos _tipos;
     private Clasif _clasificacion;

    public clsAnimales() {
    }

    public clsAnimales(int _id, String _nombre, Date _apareamiento, float _peso, Tipos _tipos, Clasif _clasificacion) {
        this._id = _id;
        this._nombre = _nombre;
        this._apareamiento = _apareamiento;
        this._peso = _peso;
        this._tipos = _tipos;
        this._clasificacion = _clasificacion;
    }

    
     
     
     
     
     
     
     
     
}
