
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
                
                case 1:
                    
                    TipoLista(OpcionMenuPrincipal);
                    
                    break;
                    
                case 2:
                    
                    
                    break;
                
                default:
                    
                    System.out.println("ingrese una opcion en el rango de 1-6");
                    
                    break;
                
                
            }
                    
            
            
        } while (OpcionMenuPrincipal!=7);
        
        
        
        
    }
    
    
    public static void TipoLista(int num){
        
                    if (num==1) {//lista simple
            
                        TipoList='s';
        }
        
                    do {
                        
                        System.out.println("menu de opciones lista simple estudiantes");
                        System.out.println("[1] ingrese nuevo estudiante");
                        System.out.println("[2] buscar estudiante");
                        System.out.println("[3] modificar datos de estudiante");
                        System.out.println("[4] eliminar estudiante");
                        System.out.println("[5] mostrar estudiantes");
                        System.out.println("[6] salir");
                        OpcionSubMenu=tecla.nextInt();
                        switch (OpcionSubMenu) {
                            case 1:
                                  if (TipoList=='s') {//lista simple seria
                                   
                                    listaSimpleEstudiante.MenuDeMetodo(OpcionSubMenu);
                                }
                                    
                                  else if (TipoList=='d') {//lista doble seria
                                    
                                }
                                 
                                    else if (TipoList=='c') {//lista circular simple
                                    
                                }//seguir con las demas
                               
                                break;
                                
                            case 2:
                                
                                   if (TipoList=='s') {//lista simple seria
                                    
                                    listaSimpleEstudiante.MenuDeMetodo(OpcionSubMenu);
                                }
                                      else if (TipoList=='d') {//lista doble seria
                                    
                                }
                                 
                                    else if (TipoList=='c') {//lista circular simple
                                    
                                }//seguir con las demas
                                   
                                break;
                            default:
                                System.out.println("ingrese una opcion en el rango de 1-6");
                               break;
                        }
                        
                    } while (OpcionSubMenu!=6);
        
    }
    
    
    
    
}
