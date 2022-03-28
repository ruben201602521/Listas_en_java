
package listas_practica_repaso;
import java.lang.reflect.*;
import java.util.Scanner;

public class Listas_Practica_Repaso {

    
    public static Scanner tecla=new Scanner(System.in);
    public static int OpcionMenuPrincipal=0;
    public static int OpcionSubMenu=0;
   
   
    //tda listadoble=new listadoble
    //tda listacircular=new listacircular
    //public static int s []=new int[10];
    public static TDA s[]=new TDA[6];//SERVIRA PARA ALMACENAR OBJETOS TIPO TDA QUE SE COMPORTARAN DEL TIPO QUE YO ESPECIFIQUE MAS ABAJO
  
    public static void main(String[] args) {
        //AQUI EN LOS PROXIMOS TDA USTILIZO POLIMORFISMO
       TDA ListaSimple=new Lista_Simple();//creo un objeto de tipo TDA de Contexto lista simple por la clase abstracta QUE ES LA PADRE
   //ASI AQUI EN EL VECTOR ESTA ALMACENANDO TIPOS TDA QUE A SU VEZ SE ESTARA COMPORTANDO COMO EL TIPO DE LISTA O PILA O COLA QUE SE ESPECIFIQUE LUEGO
   
        TDA ListaDoble=new Lista_Doblemente_Enlazada();
        TDA ListaCircular_simple=new Lista_Circular_Simple();
        TDA ListaCircular_doble_enlazada=new Lista_Circular_Doblemente_Enlazada();
        TDA Pila_=new Pila();
        TDA Cola_=new Cola();
           s[0]=ListaSimple;
           s[1]=ListaDoble;//cambiar a lista doble
           s[2]=ListaCircular_simple;//cambiar a lista circular simple
           s[3]=ListaCircular_doble_enlazada;//cambiar a lista circular doble
           s[4]=Pila_;//cambiar a pila
           s[5]=Cola_;//cambiar a cola
           
           
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
            System.out.println("INGRESE UNA OPCION DEL MENU");
            OpcionMenuPrincipal=Integer.parseInt(tecla.nextLine());
      
            switch(OpcionMenuPrincipal){
                
                case 1://cuando se escoge lista simple
                     
                    MenuDeMetodoS(OpcionMenuPrincipal-1);//le pongo aqui menos 1 por que si ingresa la opcion de 1 entonces accederia para la lista doble
                    //osea
                    
                    /*
                    el vector esta asi
                 lugar>   1           2                3                    4           5     6
                    [listaSimple][ListaDoble][ListaCircularSimple][ListaCircularDoble][Pila][Cola]
        index de vector>  0           1                2                    3            4     5
                    
                    
                    */
              break;
                    
                case 2://cuando se escoje lista doblemente enlazada
            
                    MenuDeMetodoS(OpcionMenuPrincipal-1);//asi entra en el indice 1 del vector que es la lista doble y sus metodos 
                    break;
                case 3://cuando se escoje lista circular simple
                      MenuDeMetodoS(OpcionMenuPrincipal-1);//usara la posicion 2 del vector tda
                    
                    break;
                    
                case 4://cuando se escoje lista circular doblemente enlazada
                    MenuDeMetodoS(OpcionMenuPrincipal-1);
                    
                 
                    break;
                    
                    
                case 5://cuando se escoje pila
               
                    MenuDeMetodoS(OpcionMenuPrincipal-1);
                    break;
                    
                case 6://cuando se escoje Cola
                
                    MenuDeMetodoS(OpcionMenuPrincipal-1);
                    break;
                    
                case 7:
                    
                    System.out.println("Ha finalizado el programa");
                    break;
                default:
                   
                    System.out.println("ingrese una opcion en el rango de 1-7");
                    
                    break;
                
                
            }
                    
            for (int i = 0; i < 4; i++) {
                
                System.out.println("");
            }
        } while (OpcionMenuPrincipal!=7);
     
    }
    //teclado.next()solo usa la primera palabra ejemplo ingreso hola mundo SOLO USA HOLA
    //teclado.nextLine() si lee todo lo que ingreso
    
 public static void MenuDeMetodoS(int posicionVectorTDA){
        //con posisicionVectorTDA voy a acceder al vector que tiene los objetos tipo TDA pero con contexto a la lista que se desea ver
        /*
        osea para si mandan numero 1 es para lista simple
        
                 el vector esta asi
                 lugar>   1           2                3                    4           5     6
                    [listaSimple][ListaDoble][ListaCircularSimple][ListaCircularDoble][Pila][Cola]
        index de vector>  0           1                2                    3            4     5
        
        */
        char Es_Pila_O_cola='N';
        
        if (posicionVectorTDA==4||posicionVectorTDA==5) {//si escoge la opcion de pila o cola utilizare el metodo eliminar de otra forma por el tipo de estructuras que son las pilas y colas
     
        Es_Pila_O_cola='S';
        }
      
        
        int DatoBuscar=0;
        do{
            
            System.out.println("menu de opciones de estudiantes");
            System.out.println("[1] ingrese nuevo estudiante");
            System.out.println("[2] buscar estudiante");
            System.out.println("[3] modificar datos de estudiante");
            System.out.println("[4] eliminar estudiante");
            System.out.println("[5] mostrar estudiantes");
            System.out.println("[6] salir");
            System.out.println("INGRESE UNA OPCION DEL MENU");
            OpcionSubMenu=Integer.parseInt(tecla.nextLine());//ES MEJOR HACER UN PARSEO Y LUEGO PONER TRY CACH PARA QUITAR PROBLEMAS DE 
            //SI INGRESA UNA LETRA O UN CARACTER ENTONCES ESTE DIGA EN GENERAL EL ERRO SI HA INGRESADO AL GO QUE NO ES DEL TIPO NUMERICO
            //Y QUE SE REGRESE AL METODO OTRA VEZ CUANDO LO HAGAS
            
            //YA NO USES EL nextInt(); para el scanner por que no funcionan los metodos convencionales para absorber el salto de linea que trae
            //a menos de que lo uses para una sola linea y que esta no se encuentre dentro de un ciclo por que si no se queda perdido y este 
            //estara dando problemas mas adelante
        
        switch (OpcionSubMenu) {
            
             case 1:
         
               s[posicionVectorTDA].Insertar();
               
                break;
                
             case 2:
                    System.out.println("ingrese el numero de carnet del estudiante a buscar");
                    DatoBuscar=Integer.parseInt(tecla.nextLine());
                    s[posicionVectorTDA].Buscar(DatoBuscar);
                  
                 break;
                    
             case 3:
                  System.out.println("ingrese el numero de carnet del estudiante a modificar");
                    DatoBuscar=Integer.parseInt(tecla.nextLine());
                    s[posicionVectorTDA].Modificar(DatoBuscar);
                   
                    break;
                    
             case 4:
                 if (Es_Pila_O_cola=='N') {
                     System.out.println("ingrese el numero de carnet del estudiante a eliminar");
                    DatoBuscar=Integer.parseInt(tecla.nextLine());
                    s[posicionVectorTDA].Eliminar(DatoBuscar);
                 }
                 else if (Es_Pila_O_cola=='S') {
                     //para una pila eliminara el primer elemento de la cima>>>LIFO
                     //para una cola eliminara el primer elemento que haya ingresado durante la carga de datos>>FIFO
                     s[posicionVectorTDA].Eliminar(0);
                 }
              
                    break;
                    
             case 5:
                    s[posicionVectorTDA].Mostrar();
                    break;
                    
             case 6:
                    System.out.println("Ha salido del Submenu de Acciones del TDA");
                    break;
                   
            default:
                System.out.println("ingrese una opcion en el rando de 1-6");
                break;
        }
        
            for (int i = 0; i < 4; i++) {
                System.out.println("");
            }
      
        }while (OpcionSubMenu!=6);
            
        
    }    
    
    
    
}
