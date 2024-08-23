
package Logica_Negocio;


public class Perro {
    //parametrizado
   private String Nombre, Raza; 
   //construtor no parametrizado

    public Perro() {
    }
    public Perro(String Nombre, String Raza) {
        this.Nombre = Nombre;
        this.Raza = Raza;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }
   
   
    
}
