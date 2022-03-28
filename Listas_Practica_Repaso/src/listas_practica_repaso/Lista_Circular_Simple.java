
package listas_practica_repaso;

import java.util.Scanner;


public class Lista_Circular_Simple extends TDA{

    
    Nodo_Circular_Simple PrimeroSimpleCircular;//sera la cabeza o el primer nodo de la lista
    Nodo_Circular_Simple UltimoSimpleCircular;//sera un apoyo
    Scanner teclado=new Scanner(System.in);
    int opcionMod;
    
    
    
    public Lista_Circular_Simple(){
        
        
        PrimeroSimpleCircular=null;
        UltimoSimpleCircular=null;
        
    }
    
    
    @Override
    public void Insertar() {
        
        Nodo_Circular_Simple NuevoNodo=new Nodo_Circular_Simple();
        System.out.println("ingrese nombre del estudiante");
        NuevoNodo.estudiante.NombreEstudiante=teclado.nextLine();
        System.out.println("ingrese carnet del estudiante");
        NuevoNodo.estudiante.carnet=teclado.nextInt();
        teclado.nextLine();
        System.out.println("ingrese correo institucional del estudiante");
        NuevoNodo.estudiante.CorreoInstitucional=teclado.nextLine();
        System.out.println("ingrese numero de telefono del estudiante");
        NuevoNodo.estudiante.NumeroTelefono=teclado.nextInt();
        teclado.nextLine();
        
        
        if (PrimeroSimpleCircular==null) {
            
            PrimeroSimpleCircular=NuevoNodo;
            UltimoSimpleCircular=PrimeroSimpleCircular;
            PrimeroSimpleCircular.Siguiente=UltimoSimpleCircular;
            
            
        }
        else{
            
            UltimoSimpleCircular.Siguiente=NuevoNodo;
            NuevoNodo.Siguiente=PrimeroSimpleCircular;
            UltimoSimpleCircular=NuevoNodo;
            
            
            
        }
        
        
    }

    @Override
    public void Eliminar(int EliminarCarnet) {
        
        
        Nodo_Circular_Simple NodoAuxiliar1=new Nodo_Circular_Simple();
        Nodo_Circular_Simple NodoAuxiliar2_Anterior=new Nodo_Circular_Simple();
        NodoAuxiliar1=PrimeroSimpleCircular;
        NodoAuxiliar2_Anterior=UltimoSimpleCircular;
        
        //se usa un do while por que el ultimo no sera distinto de null si no que mas bien para salir del bucle debe ser distinto del primero por que es circular
        do{
            
            
            if (NodoAuxiliar1.estudiante.carnet==EliminarCarnet) {
                
                if (NodoAuxiliar1==PrimeroSimpleCircular) {
                System.out.println("Nombre: "+NodoAuxiliar1.estudiante.NombreEstudiante);
                System.out.println("Carnet: "+NodoAuxiliar1.estudiante.carnet);
                System.out.println("Correo: "+NodoAuxiliar1.estudiante.CorreoInstitucional);
                System.out.println("Telefono: "+NodoAuxiliar1.estudiante.NumeroTelefono);
                System.out.println("--------------ESTUDIANTE--ELIMINADO---------------------");
                
                PrimeroSimpleCircular=PrimeroSimpleCircular.Siguiente;
                UltimoSimpleCircular.Siguiente=PrimeroSimpleCircular;
                }
                
                else if(NodoAuxiliar1==UltimoSimpleCircular){
                     System.out.println("Nombre: "+NodoAuxiliar1.estudiante.NombreEstudiante);
                System.out.println("Carnet: "+NodoAuxiliar1.estudiante.carnet);
                System.out.println("Correo: "+NodoAuxiliar1.estudiante.CorreoInstitucional);
                System.out.println("Telefono: "+NodoAuxiliar1.estudiante.NumeroTelefono);
                System.out.println("--------------ESTUDIANTE--ELIMINADO---------------------");
                
                
                NodoAuxiliar2_Anterior.Siguiente=UltimoSimpleCircular.Siguiente;
                UltimoSimpleCircular=NodoAuxiliar2_Anterior;
                
                }
                else{
                    NodoAuxiliar2_Anterior.Siguiente=NodoAuxiliar1.Siguiente;
                }
                
            }
            NodoAuxiliar2_Anterior=NodoAuxiliar1;
            NodoAuxiliar1=NodoAuxiliar1.Siguiente;
            
        }while (NodoAuxiliar1!=PrimeroSimpleCircular);
            
        
        
    }

    @Override
    public void Modificar(int ModificarCarnet) {
        Nodo_Circular_Simple NodoAuxiliar=new Nodo_Circular_Simple();
       
       NodoAuxiliar=PrimeroSimpleCircular;
       
       do{       
            
            if (NodoAuxiliar.estudiante.carnet==ModificarCarnet) {
                
                  do {  
                    
                    System.out.println("Que Desea Modificar");
                    System.out.println("[1] modificar nombre");
                    System.out.println("[2] modificar carnet");
                    System.out.println("[3] modificar correo institutcional");
                    System.out.println("[4] modificar numero de telefono");
                    System.out.println("[5] Salir");
                    System.out.println("INGRESE UNA OPCION DEL MENU");
                    opcionMod=Integer.parseInt(teclado.nextLine());//es mejor castear para on tener inconvenientes con el next int ya que en consola da problemas por el \n que deba al final
                
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
        }while (NodoAuxiliar!=PrimeroSimpleCircular);           
            
        
    }

    @Override
    public void Buscar(int BuscarCarnet) {
        
        Nodo_Circular_Simple NodoAuxiliar=new Nodo_Circular_Simple();
        NodoAuxiliar=PrimeroSimpleCircular;
        char Encontrado='N';
        
        
        do {
        
            
            if (NodoAuxiliar.estudiante.carnet==BuscarCarnet) {
                
                System.out.println("El Estudiante Existe");
                System.out.println("Nombre: "+NodoAuxiliar.estudiante.NombreEstudiante);
                System.out.println("Carnet: "+NodoAuxiliar.estudiante.carnet);
                System.out.println("---------------------------------------------------");
                Encontrado='S';
            }
            
            NodoAuxiliar=NodoAuxiliar.Siguiente;
        } while (NodoAuxiliar!=PrimeroSimpleCircular);
        
        if (Encontrado=='N') {
            System.out.println("estudiante no encontrado");
        }
        
    }

    @Override
    public void Mostrar() {
        
        Nodo_Circular_Simple NodoAuxiliar=new Nodo_Circular_Simple();
        NodoAuxiliar=PrimeroSimpleCircular;
        
        
        vacioTDA=Vacio();
        
        if (vacioTDA==true) {//si contiene elementos entonces los imprimira
             do {
            
            
            System.out.println("Nombre del Estudiante: "+NodoAuxiliar.estudiante.NombreEstudiante);
            System.out.println("Carnet del Estudiante: "+NodoAuxiliar.estudiante.carnet);
            System.out.println("Correo del Estudiante: "+NodoAuxiliar.estudiante.CorreoInstitucional);
            System.out.println("Numero de telefono del Estudiante: "+NodoAuxiliar.estudiante.NumeroTelefono);
            System.out.println("---------------------------------------------------------------");
            NodoAuxiliar=NodoAuxiliar.Siguiente;
        } while (NodoAuxiliar!=PrimeroSimpleCircular);
        
        }
        else{//SI LA LISTA NO TIENE ELEMENTOS ENTONCES IMPRIME EL MENSAJE
            System.out.println("la lista se encuentra vacia");
            
        }
        
    }

    @Override
    public boolean Vacio() {
       
        if (PrimeroSimpleCircular!=null) {
            vacioTDA=true;
        }
        
        else{
            vacioTDA=false;
        }
        return vacioTDA;
        
    }
    
    
    
    
}
