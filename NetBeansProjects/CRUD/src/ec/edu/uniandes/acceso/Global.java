/*
 UNIVERSIDAD REGIONAL AUTONOMA DE LOS ANDES "UNIANDES"
BYRON COBO
30-05-2016
 */
package ec.edu.uniandes.acceso;

public final  class Global
{    
    public final static String URL;
    public final static String DRIVER;
    public final static String USER;
    public final static String PASS;
    static
    {
        
// PARA GUARDAR EN BASE DE DATOS POSTGRESS
        URL = getValor("url");
        DRIVER = getValor("driver");
        USER = getValor("usuario");
        PASS = getValor("clave");   
// PARA GUARDAR EN BASE DE DATOS MYSQL

//        URL = getValor1("url");
//        DRIVER = getValor1("driver");
//        USER = getValor1("usuario");
//        PASS = getValor1("clave");      
    }    
    
//PARA GUARDAR EN BASE DE DATOS POSTGRESS
    
     public static String getValor(String clave)
     {       
        java.util.ResourceBundle Configuracion = java.util.ResourceBundle.getBundle("ec.edu.uniandes.acceso.database");
        return  Configuracion.getString(clave);
     }
          
//PARA GUARDAR EN BASE DE DATOS MYSQL
//public static String getValor1(String clave)
//     {
//         // CARGO DATOS DESDE ARCHIVO DE CONFIGURACION
//        java.util.ResourceBundle Configuracion = java.util.ResourceBundle.getBundle("ec.edu.uniandes.acceso.database_1");
//        return  Configuracion.getString(clave);
//       
//     }     
}