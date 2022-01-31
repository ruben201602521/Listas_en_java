
package listas_practica_repaso;

import java.util.Scanner;

public class Lista_Simple extends TDA{
    
    Nodo_Simple Primero;
    Nodo_Simple Ultimo;
    
    
    Scanner teclado=new Scanner(System.in);
    public int menuMetodoss;
    public Lista_Simple(){
        
        Primero=null;
        Ultimo=null;
        
        
        
    }
    
    
    public void InsertarNodosSimples(){
        
        
    }//ELIMINAR
    
    
    public void BuscarElementoLista(){
        
        Nodo_Simple NodoAuxiliar=new Nodo_Simple();
        
        NodoAuxiliar=Primero;
        
        
        
        
        
    }//ELIMINAR
            
    
    
    public void MostrarListaSimpleEstudiantes(){
     
    
        
    }//ELIMINAR
    
   

    @Override
    public void Insertar() {
        
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

    @Override
    public void Eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Buscar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Mostrar() {
    
       Nodo_Simple NodoAuxiliar=new Nodo_Simple();
       NodoAuxiliar=Primero;
       
       vacioTDA=Vacio();
       
        if (vacioTDA==true) {//SI LA LISTA TIENE ELEMENTOS LOS IMPRIME
              while (NodoAuxiliar!=null) {
            System.out.println("Nombre del Estudiante: "+NodoAuxiliar.estudiante.NombreEstudiante);
            System.out.println("Carnet del Estudiante: "+NodoAuxiliar.estudiante.carnet);
            System.out.println("Correo del Estudiante: "+NodoAuxiliar.estudiante.CorreoInstitucional);
            System.out.println("Numero de telefono del Estudiante: "+NodoAuxiliar.estudiante.NumeroTelefono);
            System.out.println("---------------------------------------------------------------");
            NodoAuxiliar=NodoAuxiliar.Siguiente;
        }
              
      
            
        }
        else{//SI LA LISTA NO TIENE ELEMENTOS ENTONCES IMPRIME EL MENSAJE
            System.out.println("NO HAY ELEMENTOS EN LA LISTA");
        }
    
    }
    

    @Override
    public boolean Vacio() {//VERIFICA SI LA LISTA CONTIENE ELMENTOS
        if (Primero!=null) {
           
            vacioTDA=true;
        }
        
        else{
            
            vacioTDA=false;
        }
        return vacioTDA;
    }
    
    
    
}
