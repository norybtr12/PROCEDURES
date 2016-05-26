/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.uniandes.byroncobo;

/**
 *
 * @author BYRON
 */
public class clsProducto {

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

    public float Valor() {
        return _valor;
    }

    public void Valor(float _valor) {
        this._valor = _valor;
    }

    public unidad Unidad() {
        return _unidad;
    }

    public void Unidad(unidad _unidad) {
        this._unidad = _unidad;
    }

   
    public enum unidad{litro, metro, libras};
    
private int _id;
private String _nombre;
private float _valor;
private unidad _unidad;

    public clsProducto() {
    }

    public clsProducto(int _id, String _nombre, float _valor, unidad _unidad) {
        this._id = _id;
        this._nombre = _nombre;
        this._valor = _valor;
        this._unidad = _unidad;
    }


  
  
}
