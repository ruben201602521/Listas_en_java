
package listas_practica_repaso;
import java.lang.reflect.*;
import java.util.Scanner;

public class Listas_Practica_Repaso {

    
    public static Scanner tecla=new Scanner(System.in);
    public static int OpcionMenuPrincipal=0;
    public static int OpcionSubMenu=0;
    public static char TipoList;
    public static Lista_Simple listaSimpleEstudiante=new Lista_Simple();
    public static void main(String[] args) {
       
   
    
        
        do {            
            
            System.out.println("menu de opciones");    
            System.out.println("[1] Para utilizar lista simple de estudiantes");
            System.out.println("[2] Para utilizar lista doblemente enlazada de estudiantes");
            System.out.println("[3] Para utilizar lista circular simple de estudiantes");
            System.out.println("[4] Para utilizar lista circular doblemente enlazada de estudiantes");
            System.out.println("[5] Para utilizar una pila de almacenamiento de estudiantes");
            System.out.println("[6] Para utilizar una cola de almacenamiento de estudiantes");
            System.out.println("[7] Salida");
            OpcionMenuPrincipal=tecla.nextInt();
            
            switch(OpcionMenuPrincipal){
                
                case 1://cuando se escoge lista simple
                    TipoList='s';
                    listaSimpleEstudiante.MenuDeMetodo(OpcionSubMenu);
                    
                    break;
                    
                case 2://cuando se escoje lista doblemente enlazada
                    TipoList='d';
                    
                    break;
                case 3://cuando se escoje lista circular simple
                    TipoList='a';
                    
                    break;
                    
                case 4://cuando se escoje lista circular doblemente enlazada
                    TipoList='b';
                    
                    break;
                    
                    
                case 5://cuando se escoje pila
                    TipoList='p';
                    
                    break;
                    
                case 6://cuando se escoje Cola
                    TipoList='c';
                    
                    break;
                default:
                    
                    System.out.println("ingrese una opcion en el rango de 1-6");
                    
                    break;
                
                
            }
                    
            
            
        } while (OpcionMenuPrincipal!=7);
        
        
        
        
    }
    
    
//    public static void TipoLista(){//este es el submenu que llama el menu principal para realizar las operaciones con la lista que se 
//        //haya seleccionando
//        
//        
//                    do {
//                        
//                        System.out.println("menu de opciones lista simple estudiantes");
//                        System.out.println("[1] ingrese nuevo estudiante");
//                        System.out.println("[2] buscar estudiante");
//                        System.out.println("[3] modificar datos de estudiante");
//                        System.out.println("[4] eliminar estudiante");
//                        System.out.println("[5] mostrar estudiantes");
//                        System.out.println("[6] salir");
//                        OpcionSubMenu=tecla.nextInt();
//                        switch (OpcionSubMenu) {
//                            case 1:
//                        switch (TipoList) {
//                            case 's':
//                                //lista simple seria
//                                
//                                listaSimpleEstudiante.MenuDeMetodo(OpcionSubMenu);
//                                break;
//                        //lista doblemente enlazada seria
//                            case 'd':
//                                break;
//                        //lista circular simple
//                            case 'a':
//                                break;
//                        //lista circular doblemnete enlazada
//                            case 'b':
//                                break;
//                        //pila
//                            case 'p':
//                                break;
//                        //cola
//                            case 'c':
//                                break;
//                            default:
//                                break;
//                        }
//                                break;
//                                
//                            case 2:
//                                
//                                   if (TipoList=='s') {//lista simple seria
//                                    
//                                    listaSimpleEstudiante.MenuDeMetodo(OpcionSubMenu);
//                                }
//                                      else if (TipoList=='d') {//lista doble seria
//                                    
//                                }
//                                 
//                                    else if (TipoList=='c') {//lista circular simple
//                                    
//                                }//seguir con las demas
//                                   
//                                break;
//                                
//                            case 6:
//                                TipoList='f';
//                                break;
//                                
//                            default:
//                                System.out.println("ingrese una opcion en el rango de 1-6");
//                               break;
//                        }
//                        
//                    } while (OpcionSubMenu!=6);
//        
//    }
    
    
    
    
}
