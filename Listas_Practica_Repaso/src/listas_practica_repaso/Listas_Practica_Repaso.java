
package listas_practica_repaso;
import java.lang.reflect.*;
import java.util.Scanner;

public class Listas_Practica_Repaso {

    
    public static Scanner tecla=new Scanner(System.in);
    public static int OpcionMenuPrincipal=0;
    public static int OpcionSubMenu=0;
    public static char TipoList;
    
    //tda listadoble=new listadoble
    //tda listacircular=new listacircular
    //public static int s []=new int[10];
    public static TDA s[]=new TDA[6];
    public static Lista_Simple listaSimpleEstudiante=new Lista_Simple();
    public static void main(String[] args) {
        //AQUI EN LOS PROXIMOS TDA USTILIZO POLIMORFISMO
       TDA ListaSimple=new Lista_Simple();//creo un objeto de tipo TDA de Contexto lista simple por la clase abstracta
   //ASI AQUI EN EL VECTOR PUEDE ALMACENAR TIPO TDA QUE A SU VEZ SE ESTARA COMPORTANDO COMO EL TIPO DE LISTA O PILA O COLA QUE SE ESPECIFIQUE LUEGO
           s[0]=ListaSimple;
           s[1]=ListaSimple;//cambiar a lista doble
           s[2]=ListaSimple;//cambiar a lista circular simple
           s[3]=ListaSimple;//cambiar a lista circular doble
           s[4]=ListaSimple;//cambiar a pila
           s[5]=ListaSimple;//cambiar a cola
           
           
           //crear los demas objetos tipo TDA con ello tendras en este vector S objetos de tipo TDA que estan adoptando la forma de otro 
           //TDA osea de tipo lista simple,doblemente,cicular simple,circular doble
        
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
                     
                    MenuDeMetodoS(OpcionMenuPrincipal);
                    
              break;
                    
                case 2://cuando se escoje lista doblemente enlazada
            
                    
                    break;
                case 3://cuando se escoje lista circular simple
                 
                    
                    break;
                    
                case 4://cuando se escoje lista circular doblemente enlazada
                 
                    break;
                    
                    
                case 5://cuando se escoje pila
               
                    
                    break;
                    
                case 6://cuando se escoje Cola
                
                    
                    break;
                default:
                   
                    System.out.println("ingrese una opcion en el rango de 1-6");
                    
                    break;
                
                
            }
                    
            
            
        } while (OpcionMenuPrincipal!=7);
        
    }
    
    
 public static void MenuDeMetodoS(int posicionTDA){
        
        do{
            
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
            //     listaSimpleEstudiante.Insertar();
               s[posicionTDA].Insertar();
               
                break;
                
                case 2://cambiar a buscar estudiante
                 s[posicionTDA].Mostrar();
                 break;
                    
                     case 3:
                 
                    break;
                    
                     case 4:
                 
                    break;
                    
                     case 5:
                 
                    break;
                    
                     case 6:
                 
                    break;
                   
            default:
               
                break;
        }
        
        }while (OpcionSubMenu!=6);
            
        
    }    
    
    
    
}
