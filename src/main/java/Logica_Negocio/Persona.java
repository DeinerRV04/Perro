
package Logica_Negocio;

import java.util.ArrayList;


public class Persona {
    //Atrivutos
    private String Identificacion;
    private String Nombre;
    private ArrayList<Perro> lsperros; //aqui se realiza la asociacion
    //constructor parametrizado

    public Persona() {
        
    }
    //constructor no parametrizado

    public Persona(String Identificacion, String Nombre, ArrayList<Perro> lsperros) {
        this.Identificacion = Identificacion;
        this.Nombre = Nombre;
        this.lsperros = lsperros;
    }
    //setter

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Perro> getLsperros() {
        return lsperros;
    }

    public void setLsperros(ArrayList<Perro> Lsperro) {
        this.lsperros = Lsperro;
    }

  
    
    
}
