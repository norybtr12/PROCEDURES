/*
 UNIVERSIDAD REGIONAL AUTONOMA DE LOS ANDES "UNIANDES"
BYRON COBO
30-05-2016
 */

package ec.edu.uniandes.entidades;

/**
 *
 * @author BYRON
 */
public class clsTrabajador {
    private int cod_Trabajador;
    private String nom_Trabajador;
    private String apell_Trabajador;
    private String dir_Trabajador;
    private String Telf_Trabajador;
    private String email_Trabajador;

    public clsTrabajador() {
    }

    public clsTrabajador(int cod_Trabajador, String nom_Trabajador, String apell_Trabajador, String dir_Trabajador, String Telf_Trabajador, String email_Trabajador) {
        this.cod_Trabajador = cod_Trabajador;
        this.nom_Trabajador = nom_Trabajador;
        this.apell_Trabajador = apell_Trabajador;
        this.dir_Trabajador = dir_Trabajador;
        this.Telf_Trabajador = Telf_Trabajador;
        this.email_Trabajador = email_Trabajador;
    }

    public int getCod_Trabajador() {
        return cod_Trabajador;
    }

    public void setCod_Trabajador(int cod_Trabajador) {
        this.cod_Trabajador = cod_Trabajador;
    }

    public String getNom_Trabajador() {
        return nom_Trabajador;
    }

    public void setNom_Trabajador(String nom_Trabajador) {
        this.nom_Trabajador = nom_Trabajador;
    }

    public String getApell_Trabajador() {
        return apell_Trabajador;
    }

    public void setApell_Trabajador(String apell_Trabajador) {
        this.apell_Trabajador = apell_Trabajador;
    }

    public String getDir_Trabajador() {
        return dir_Trabajador;
    }

    public void setDir_Trabajador(String dir_Trabajador) {
        this.dir_Trabajador = dir_Trabajador;
    }

    public String getTelf_Trabajador() {
        return Telf_Trabajador;
    }

    public void setTelf_Trabajador(String Telf_Trabajador) {
        this.Telf_Trabajador = Telf_Trabajador;
    }

    public String getEmail_Trabajador() {
        return email_Trabajador;
    }

    public void setEmail_Trabajador(String email_Trabajador) {
        this.email_Trabajador = email_Trabajador;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
}
