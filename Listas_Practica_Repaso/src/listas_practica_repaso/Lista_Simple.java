
package listas_practica_repaso;

import java.util.Scanner;

public class Lista_Simple extends TDA{
    
    Nodo_Simple Primero;
    Nodo_Simple Ultimo;
    
    
    Scanner teclado=new Scanner(System.in);
   
    public Lista_Simple(){
        
        Primero=null;
        Ultimo=null;
        
        
        
    }
    
    
  
    
   

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
    public void Eliminar(int NumeroCarnet) {
            
          Nodo_Simple NodoAuxiliar=new Nodo_Simple();
          Nodo_Simple NodoAnteriorAuxiliar=new Nodo_Simple();
        
        
        NodoAuxiliar=Primero;
        NodoAnteriorAuxiliar=null;
        while (NodoAuxiliar!=null) {
           
            if (NodoAuxiliar.estudiante.carnet==NumeroCarnet) {
                
                
                if (NodoAuxiliar==Primero) {
                System.out.println("Nombre: "+NodoAuxiliar.estudiante.NombreEstudiante);
                System.out.println("Carnet: "+NodoAuxiliar.estudiante.carnet);
                System.out.println("Correo: "+NodoAuxiliar.estudiante.CorreoInstitucional);
                System.out.println("Telefono: "+NodoAuxiliar.estudiante.NumeroTelefono);
                System.out.println("--------------ESTUDIANTE--ELIMINADO---------------------");
                
                Primero=Primero.Siguiente;
                
                }
               
                else{
                System.out.println("Nombre: "+NodoAuxiliar.estudiante.NombreEstudiante);
                System.out.println("Carnet: "+NodoAuxiliar.estudiante.carnet);
                System.out.println("Correo: "+NodoAuxiliar.estudiante.CorreoInstitucional);
                System.out.println("Telefono: "+NodoAuxiliar.estudiante.NumeroTelefono);
                System.out.println("--------------ESTUDIANTE--ELIMINADO---------------------");
                NodoAnteriorAuxiliar.Siguiente=NodoAuxiliar.Siguiente;
                    
                }
              
            }
            
            
            NodoAnteriorAuxiliar=NodoAuxiliar;
            NodoAuxiliar=NodoAuxiliar.Siguiente;
            
        }

    }

    @Override
    public void Modificar(int NumeroDeCarnetEstudiante) {//va a modificar lo que tenga el nodo en su interior
       int opcionMod;
        Nodo_Simple NodoAuxiliar=new Nodo_Simple();
       
       NodoAuxiliar=Primero;
       
        while (NodoAuxiliar!=null) {            
            
            if (NodoAuxiliar.estudiante.carnet==NumeroDeCarnetEstudiante) {
                
                do {  
                    
                    System.out.println("Que Desea Modificar");
                    System.out.println("[1] modificar nombre");
                    System.out.println("[2] modificar carnet");
                    System.out.println("[3] modificar correo institutcional");
                    System.out.println("[4] modificar numero de telefono");
                    System.out.println("[5] Salir");
                    System.out.println("INGRESE UNA OPCION DEL MENU");
                    opcionMod=Integer.parseInt(teclado.nextLine());
                
                    switch (opcionMod)
                    {
                        case 1:
                            System.out.println("ingrese nuevo nombre");
                            NodoAuxiliar.estudiante.NombreEstudiante=teclado.nextLine();
                            
                            break;
                            
                        case 2:
                            System.out.println("ingrese nuevo carnet");
                            NodoAuxiliar.estudiante.carnet=Integer.parseInt(teclado.nextLine());
                           
                            break;
                        
                        case 3:
                            System.out.println("ingrese nuevo correo");
                            NodoAuxiliar.estudiante.CorreoInstitucional=teclado.nextLine();
                            
                            break;
                            
                        case 4:
                            System.out.println("ingrese nuevo numero de telefono");
                            NodoAuxiliar.estudiante.NumeroTelefono=Integer.parseInt(teclado.nextLine());
                            break;
                            
                        case 5:
                            System.out.println("ha salido del menu de modificacion ");
                            break;
                        
                        default:
                            System.out.println("ingrese una opcion en el rango de 1-5");
                            break;
                            
                    }
                    
                    for (int i = 0; i < 4; i++) {
                        System.out.println("");
                    }
                  
                } while (opcionMod!=5);
                
            }
            
            NodoAuxiliar=NodoAuxiliar.Siguiente;
        }
       
       
    }

    @Override
    public void Buscar(int NumeroDeCarnet) {
        
        Nodo_Simple NodoAuxiliar=new Nodo_Simple();
        
        
        NodoAuxiliar=Primero;
        
        while (NodoAuxiliar!=null) {
           
            if (NodoAuxiliar.estudiante.carnet==NumeroDeCarnet) {
                
                
                System.out.println("El Estudiante Existe");
                System.out.println("Nombre: "+NodoAuxiliar.estudiante.NombreEstudiante);
                System.out.println("Carnet: "+NodoAuxiliar.estudiante.carnet);
                System.out.println("---------------------------------------------------");
                
            }
            
            
            
            NodoAuxiliar=NodoAuxiliar.Siguiente;
            
        }
        
        
        
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
