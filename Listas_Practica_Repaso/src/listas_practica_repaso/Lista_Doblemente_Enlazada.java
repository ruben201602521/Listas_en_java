
package listas_practica_repaso;

import java.util.Scanner;


public class Lista_Doblemente_Enlazada extends TDA{
    
    Nodo_Doble PrimeroDoble;//sera la cabeza o el primer nodo de la lista
    Nodo_Doble UltimoDoble;//sera un apoyo
    Scanner teclado=new Scanner(System.in);
    int opcionMod;
    public Lista_Doblemente_Enlazada() {
    
    PrimeroDoble=null;
    UltimoDoble=null;
    
    }

    @Override
    public void Insertar() {
            
        Nodo_Doble NuevoNodoDoble=new Nodo_Doble();
        System.out.println("ingrese nombre del estudiante");
        NuevoNodoDoble.estudiante.NombreEstudiante=teclado.nextLine();
        System.out.println("ingrese carnet del estudiante");
        NuevoNodoDoble.estudiante.carnet=teclado.nextInt();
        teclado.nextLine();
        System.out.println("ingrese correo institucional del estudiante");
        NuevoNodoDoble.estudiante.CorreoInstitucional=teclado.nextLine();
        System.out.println("ingrese numero de telefono del estudiante");
        NuevoNodoDoble.estudiante.NumeroTelefono=teclado.nextInt();
        teclado.nextLine();
        if (PrimeroDoble==null) {
            
            PrimeroDoble=NuevoNodoDoble;//el nuevo nodo sera el primero
            PrimeroDoble.Siguiente=null;//en su siguiente apuntara a null
            PrimeroDoble.Anterior=null;//en su anterior apuntara a null
            UltimoDoble=PrimeroDoble;//y el ultimoNoble apuntara al primero
            
        }
        
        else {
            
            UltimoDoble.Siguiente=NuevoNodoDoble;//como el ultimo era como un tipo aux entonces apunta en su sig a el nuevo
            NuevoNodoDoble.Anterior=UltimoDoble;//aqui el nuevo en su anterior apuntada a ultimoDoble que es el primero pero ultimoDoble es auxiliar para porder hacer la conexion
            NuevoNodoDoble.Siguiente=null;//ahora nuevo en su siguiente enlace apunta a null puesto que es el ultimo y despues no hay nadie
            UltimoDoble=NuevoNodoDoble;//aqui ahora el ultimo sera el nuevo ingresado y listo.
            
            
        }

            

    }

    @Override
    public void Eliminar(int EliminarCarnet) {
       
        Nodo_Doble NodoAuxiliarDoble=new Nodo_Doble();
        Nodo_Doble NodoAtrasAuxiliarDoble=new Nodo_Doble();
        
        NodoAuxiliarDoble=PrimeroDoble;
        NodoAtrasAuxiliarDoble=null;
        while (NodoAuxiliarDoble!=null) {            
            
            if (NodoAuxiliarDoble.estudiante.carnet==EliminarCarnet) {
                
                if (NodoAuxiliarDoble==PrimeroDoble) {
                System.out.println("Nombre: "+NodoAuxiliarDoble.estudiante.NombreEstudiante);
                System.out.println("Carnet: "+NodoAuxiliarDoble.estudiante.carnet);
                System.out.println("Correo: "+NodoAuxiliarDoble.estudiante.CorreoInstitucional);
                System.out.println("Telefono: "+NodoAuxiliarDoble.estudiante.NumeroTelefono);
                System.out.println("--------------ESTUDIANTE--ELIMINADO---------------------");
                    PrimeroDoble=PrimeroDoble.Siguiente;
                    PrimeroDoble.Anterior=null;
                }
                
                else
                {
                System.out.println("Nombre: "+NodoAuxiliarDoble.estudiante.NombreEstudiante);
                System.out.println("Carnet: "+NodoAuxiliarDoble.estudiante.carnet);
                System.out.println("Correo: "+NodoAuxiliarDoble.estudiante.CorreoInstitucional);
                System.out.println("Telefono: "+NodoAuxiliarDoble.estudiante.NumeroTelefono);
                System.out.println("--------------ESTUDIANTE--ELIMINADO---------------------");
                    NodoAtrasAuxiliarDoble.Siguiente=NodoAuxiliarDoble.Siguiente;
                    //como atras tiene apuntado el de atras de auxiliar que es el actual
                    //entonces el siguienete del atras del actual apuntara al siguiente del actual
                    NodoAuxiliarDoble.Siguiente.Anterior=NodoAtrasAuxiliarDoble.Anterior;
                    //aqui el siguiente de actual en su apuntador anterior va a apuntar al nodoAtrasAuxiliar que es el de atras del que se estara borrando
                }
            }
            
            NodoAtrasAuxiliarDoble=NodoAuxiliarDoble;//osea que el de atras estara siendo el actual antes de cambiar osea uno atra siempre del actual 
            NodoAuxiliarDoble=NodoAuxiliarDoble.Siguiente;//aqui es donde cambia pero se queda el nodoAtrasAuxiliar apuntando al de atras
            
        }
        
    }

    @Override
    public void Modificar(int ModificarCarnet) {

       Nodo_Doble NodoAuxiliarDoble=new Nodo_Doble();
       
       NodoAuxiliarDoble=PrimeroDoble;
       
        while (NodoAuxiliarDoble!=null) {            
            
            if (NodoAuxiliarDoble.estudiante.carnet==ModificarCarnet) {
                
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
                            NodoAuxiliarDoble.estudiante.NombreEstudiante=teclado.nextLine();
                            
                            break;
                            
                        case 2:
                            System.out.println("ingrese nuevo carnet");
                            NodoAuxiliarDoble.estudiante.carnet=Integer.parseInt(teclado.nextLine());
                           
                            break;
                        
                        case 3:
                            System.out.println("ingrese nuevo correo");
                            NodoAuxiliarDoble.estudiante.CorreoInstitucional=teclado.nextLine();
                            
                            break;
                            
                        case 4:
                            System.out.println("ingrese nuevo numero de telefono");
                            NodoAuxiliarDoble.estudiante.NumeroTelefono=Integer.parseInt(teclado.nextLine());
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
            
            NodoAuxiliarDoble=NodoAuxiliarDoble.Siguiente;
        }

    }

    @Override
    public void Buscar(int BuscarCarnet) {
        Nodo_Doble NodoAuxiliarDoble=new Nodo_Doble();
        NodoAuxiliarDoble=PrimeroDoble;
         char Encontrado='N';
        while (NodoAuxiliarDoble!=null) {
           
            if (NodoAuxiliarDoble.estudiante.carnet==BuscarCarnet) {
                
                System.out.println("El Estudiante Existe");
                System.out.println("Nombre: "+NodoAuxiliarDoble.estudiante.NombreEstudiante);
                System.out.println("Carnet: "+NodoAuxiliarDoble.estudiante.carnet);
                System.out.println("---------------------------------------------------");
                Encontrado='S';
            }
            
            NodoAuxiliarDoble=NodoAuxiliarDoble.Siguiente;
        }
        if (Encontrado=='N') {
            System.out.println("estudiante no encontrado");
        }
    }

    @Override
    public void Mostrar() {
        
        Nodo_Doble NodoAuxiliarDoble=new Nodo_Doble();
        NodoAuxiliarDoble=PrimeroDoble;
        
            
             
       vacioTDA=Vacio();
       
        if (vacioTDA==true) {//SI LA LISTA TIENE ELEMENTOS LOS IMPRIME
            while (NodoAuxiliarDoble!=null) {
            System.out.println("Nombre del Estudiante: "+NodoAuxiliarDoble.estudiante.NombreEstudiante);
            System.out.println("Carnet del Estudiante: "+NodoAuxiliarDoble.estudiante.carnet);
            System.out.println("Correo del Estudiante: "+NodoAuxiliarDoble.estudiante.CorreoInstitucional);
            System.out.println("Numero de telefono del Estudiante: "+NodoAuxiliarDoble.estudiante.NumeroTelefono);
            System.out.println("---------------------------------------------------------------");
            NodoAuxiliarDoble=NodoAuxiliarDoble.Siguiente;
        }
            
        }
        else{//SI LA LISTA NO TIENE ELEMENTOS ENTONCES IMPRIME EL MENSAJE
            System.out.println("NO HAY ELEMENTOS EN LA LISTA");
        }
            
            
           
    }
        


    

    @Override
    public boolean Vacio() {
 if (PrimeroDoble!=null) {
           
            vacioTDA=true;
        }
        
        else{
            
            vacioTDA=false;
        }
        return vacioTDA;

    }
    
    
    
    
    
}
