
package listas_practica_repaso;

import java.util.Scanner;

public class Lista_Simple {
    
    Nodo_Simple Primero;
    Nodo_Simple Ultimo;
    Scanner teclado=new Scanner(System.in);
    
    public Lista_Simple(){
        
        Primero=null;
        Ultimo=null;
        
        
        
    }
    
    
    public void InsertarNodosSimples(){
        
        Nodo_Simple Nuevo=new Nodo_Simple();
        System.out.println("ingrese nombre del estudiante");
        Nuevo.estudiante.NombreEstudiante=teclado.nextLine();
        System.out.println("ingrese carnet del estudiante");
        Nuevo.estudiante.carnet=teclado.nextInt();
        teclado.nextLine();
        System.out.println("ingrese correo institucional del estudiante");
        Nuevo.estudiante.CorreoInstitucional=teclado.nextLine();
        System.out.println("ingrese numero de telefono del estudiante");
        Nuevo.estudiante.NumeroTelefono=teclado.nextInt();
        teclado.nextLine();
        
       
        
        if (Primero==null) {
            Primero=Nuevo;//primero apunta a nuevo nodo
            Primero.Siguiente=null;//luego aqui el siguiente de primero es null osea que nuevo nodo apunta a null
            Ultimo=Primero;//ultimo apunta a primero y primero es nuevo nodo y este apunta a null
            
        }
        else   {//cuando ya se encuentra la lista con un nodo o mas entoces
            Ultimo.Siguiente=Nuevo;//aqui ultimo antes apuntaba a primero ahora el apuntador de ultimo osea siguiente ahora apunta al nuevo nodo ingresado
            Nuevo.Siguiente=null;//nuevo nodo apunta a null
            Ultimo=Nuevo;//ultimo es igual a nuevo nodo y este apunta a null osea el nuevo nodo apunta a null y es ahora el ultimo
            
        }
        
        
    }
    
    public void MostrarListaSimpleEstudiantes(){
     
       Nodo_Simple NodoAuxiliar=new Nodo_Simple();
       NodoAuxiliar=Primero;
        while (NodoAuxiliar!=null) {
            System.out.println("Nombre del Estudiante: "+NodoAuxiliar.estudiante.NombreEstudiante);
            System.out.println("Carnet del Estudiante: "+NodoAuxiliar.estudiante.carnet);
            System.out.println("Correo del Estudiante: "+NodoAuxiliar.estudiante.CorreoInstitucional);
            System.out.println("Numero de telefono del Estudiante: "+NodoAuxiliar.estudiante.NumeroTelefono);
            System.out.println("---------------------------------------------------------------");
            NodoAuxiliar=NodoAuxiliar.Siguiente;
            
        }
        
    }
    
    public void MenuDeMetodo(int metodo){
        
        switch (metodo) {
            case 1:
                InsertarNodosSimples();
                break;
                
                case 2://cambiar a buscar estudiante
                    MostrarListaSimpleEstudiantes();
                    break;
            default:
                throw new AssertionError();
        }
        
        
    }
    
    
    
}
