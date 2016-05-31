/*
 UNIVERSIDAD REGIONAL AUTONOMA DE LOS ANDES "UNIANDES"
BYRON COBO
30-05-2016
 */

package ec.edu.uniandes.funciones;
import ec.edu.uniandes.entidades.*;
import ec.edu.uniandes.acceso.*;
import java.util.ArrayList;
/**
 *
 * @author BYRON
 */
public class FTrabajador {
    public static boolean insTrabajador(clsTrabajador trabajador){
        boolean respuesta=false;
    
        String sql="INSERT INTO trabajador "
                +"values(?,?,?,?,?,?)";
        ArrayList<Parametro>lstParametro=new ArrayList<>();
        lstParametro.add(new Parametro(1, trabajador.getCod_Trabajador()));
        lstParametro.add(new Parametro(2, trabajador.getNom_Trabajador()));
        lstParametro.add(new Parametro(3, trabajador.getApell_Trabajador()));
        lstParametro.add(new Parametro(4, trabajador.getDir_Trabajador()));
        lstParametro.add(new Parametro(5, trabajador.getTelf_Trabajador()));
        lstParametro.add(new Parametro(6, trabajador.getEmail_Trabajador()));
        try {
            respuesta=AccesoDatos.ejecutaComando(sql, lstParametro);
        } catch (Exception ex) {
            System.out.println("error:  "+ ex.getMessage());
        }
        

        
        return respuesta;
    }
    
    
    
    
    public static boolean actualizarcli(clsTrabajador trabajador){
        boolean respuesta=false;
     
      String sql=  "UPDATE trabajador "
  + "SET codigo=?, nombre=?, apellido=?, direccion=?, telefono=?, email=?"
 +"WHERE codigo="+trabajador.getCod_Trabajador();
        
         ArrayList<Parametro>lstParametro=new ArrayList<>();
        
             
      lstParametro.add(new Parametro(1, trabajador.getCod_Trabajador()));
        lstParametro.add(new Parametro(2, trabajador.getNom_Trabajador()));
        lstParametro.add(new Parametro(3, trabajador.getApell_Trabajador()));
        lstParametro.add(new Parametro(4, trabajador.getDir_Trabajador()));
        lstParametro.add(new Parametro(5, trabajador.getTelf_Trabajador()));
        lstParametro.add(new Parametro(6, trabajador.getEmail_Trabajador()));
        try {
            respuesta=AccesoDatos.ejecutaComando(sql, lstParametro);
        } catch (Exception ex) {
            System.out.println("error:  "+ ex.getMessage());
        }
               
        return respuesta;
    }
    
    public static boolean eliminarcli(clsTrabajador trabajador){
        boolean respuesta=false;

        String sql="DELETE FROM trabajador "
                +" WHERE codigo=?";
                
        ArrayList<Parametro>lstParametro=new ArrayList<>();
        lstParametro.add(new Parametro(1, trabajador.getCod_Trabajador()));
        
        try {
            respuesta=AccesoDatos.ejecutaComando(sql, lstParametro);
        } catch (Exception ex) {
            System.out.println("error:  "+ ex.getMessage());
        }
        
        
        
        return respuesta;
    }
    
    public static ArrayList<clsTrabajador> getpersonas(){
           ArrayList<clsTrabajador>lstPersona=new ArrayList<>();
                 String sql="SELECT * from trabajador";
                 
               ArrayList<Parametro> lstParametro=new ArrayList<>();
              try{
               ConjuntoResultado respuesta= AccesoDatos.ejecutaQuery(sql, lstParametro);
               clsTrabajador pers=null;
          while(respuesta.next()){
                pers=new clsTrabajador(respuesta.getInt(0),respuesta.getString(1), respuesta.getString(2),respuesta.getString(3),respuesta.getString(4),respuesta.getString(5));
          lstPersona.add(pers);
          }
              }catch (Exception ex) {
            System.out.println("error:  "+ ex.getMessage());
        }
        return lstPersona;
    
    
   } 
}
