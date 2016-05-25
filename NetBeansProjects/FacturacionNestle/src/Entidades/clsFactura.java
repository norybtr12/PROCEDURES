/*
Uniandes - Puyo
Sistema de Facturacion 2016
Octavo Semestre
Byron Cobo
23/05/2016
 */

package Entidades;
import java.util.Date;

/**
 *
 * @author BYRON
 */
public class clsFactura {
     private int _id;
    private String _cliente;
    private Date _fecha;
    private float _subtotal;
    private float _iva;
    private float _total;

    public clsFactura() {
    }

    public clsFactura(int _id, String _cliente, Date _fecha, float _subtotal, float _iva, float _total) {
        this._id = _id;
        this._cliente = _cliente;
        this._fecha = _fecha;
        this._subtotal = _subtotal;
        this._iva = _iva;
        this._total = _total;
    }

    public int Id() {
        return _id;
    }

    public void Id(int _id) {
        this._id = _id;
    }

    public String Cliente() {
        return _cliente;
    }

    public void Cliente(String _cliente) {
        this._cliente = _cliente;
    }

    public Date Fecha() {
        return _fecha;
    }

    public void Fecha(Date _fecha) {
        this._fecha = _fecha;
    }

    public float Subtotal() {
        return _subtotal;
    }

    public void Subtotal(float _subtotal) {
        this._subtotal = _subtotal;
    }

    public float Iva() {
        return _iva;
    }

    public void Iva(float _iva) {
        this._iva = _iva;
    }

    public float Total() {
        return _total;
    }

    public void Total(float _total) {
        this._total = _total;
    }

    
    
    
    
    
    
    
    
    
}
