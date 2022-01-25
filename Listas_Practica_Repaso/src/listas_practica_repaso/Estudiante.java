
package listas_practica_repaso;


public class Estudiante {
    
    String NombreEstudiante;
    int carnet;
    String CorreoInstitucional;
    int NumeroTelefono;
    
    
            
    public Estudiante()
    {
        NombreEstudiante="";
        carnet=0;
        CorreoInstitucional="";
        NumeroTelefono=0;
        
    }

    public String getNombreEstudiante() {
        return NombreEstudiante;
    }

    public void setNombreEstudiante(String NombreEstudiante) {
        this.NombreEstudiante = NombreEstudiante;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getCorreoInstitucional() {
        return CorreoInstitucional;
    }

    public void setCorreoInstitucional(String CorreoInstitucional) {
        this.CorreoInstitucional = CorreoInstitucional;
    }

    public int getNumeroTelefono() {
        return NumeroTelefono;
    }

    public void setNumeroTelefono(int NumeroTelefono) {
        this.NumeroTelefono = NumeroTelefono;
    }
            
    
    
}
