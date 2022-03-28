/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_practica_repaso;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Lista_Circular_Doblemente_Enlazada extends TDA {

    Nodo_Circular_Doble PrimeroDobleCircular;//sera la cabeza o el primer nodo de la lista
    Nodo_Circular_Doble UltimoDobleCircular;//sera un apoyo
    Scanner teclado = new Scanner(System.in);
    int opcionMod;

    public Lista_Circular_Doblemente_Enlazada() {

        PrimeroDobleCircular = null;
        UltimoDobleCircular = null;

    }

    @Override
    public void Insertar() {

        Nodo_Circular_Doble NuevoNodo = new Nodo_Circular_Doble();
        System.out.println("ingrese nombre del estudiante");
        NuevoNodo.estudiante.NombreEstudiante = teclado.nextLine();
        System.out.println("ingrese carnet del estudiante");
        NuevoNodo.estudiante.carnet = teclado.nextInt();
        teclado.nextLine();
        System.out.println("ingrese correo institucional del estudiante");
        NuevoNodo.estudiante.CorreoInstitucional = teclado.nextLine();
        System.out.println("ingrese numero de telefono del estudiante");
        NuevoNodo.estudiante.NumeroTelefono = teclado.nextInt();
        teclado.nextLine();

        if (PrimeroDobleCircular == null) {

            PrimeroDobleCircular = NuevoNodo;
            PrimeroDobleCircular.Siguiente = PrimeroDobleCircular;
            NuevoNodo.Anterior = UltimoDobleCircular;
            UltimoDobleCircular = NuevoNodo;

        } else {
            UltimoDobleCircular.Siguiente = NuevoNodo;
            NuevoNodo.Siguiente = PrimeroDobleCircular;
            NuevoNodo.Anterior = UltimoDobleCircular;
            UltimoDobleCircular = NuevoNodo;
            PrimeroDobleCircular.Anterior = UltimoDobleCircular;
        }

    }

    @Override
    public void Eliminar(int Eliminar_Carnet) {

        Nodo_Circular_Doble NodoAuxiliarCircularDoble = new Nodo_Circular_Doble();
        Nodo_Circular_Doble NodoAnteriorCircularDoble = new Nodo_Circular_Doble();
        NodoAuxiliarCircularDoble = PrimeroDobleCircular;
        NodoAnteriorCircularDoble = UltimoDobleCircular;

        //se usa un do while por que el ultimo no sera distinto de null si no que mas bien para salir del bucle debe ser distinto del primero por que es circular
        do {

            if (NodoAuxiliarCircularDoble.estudiante.carnet == Eliminar_Carnet) {
                if (NodoAuxiliarCircularDoble == PrimeroDobleCircular) {
                    System.out.println("Nombre: " + NodoAuxiliarCircularDoble.estudiante.NombreEstudiante);
                    System.out.println("Carnet: " + NodoAuxiliarCircularDoble.estudiante.carnet);
                    System.out.println("Correo: " + NodoAuxiliarCircularDoble.estudiante.CorreoInstitucional);
                    System.out.println("Telefono: " + NodoAuxiliarCircularDoble.estudiante.NumeroTelefono);
                    System.out.println("--------------ESTUDIANTE--ELIMINADO---------------------");

                    PrimeroDobleCircular = PrimeroDobleCircular.Siguiente;
                    UltimoDobleCircular.Siguiente = PrimeroDobleCircular;
                    PrimeroDobleCircular.Anterior = UltimoDobleCircular;
                } else if (NodoAuxiliarCircularDoble == UltimoDobleCircular) {
                    
                    
                     System.out.println("Nombre: " + NodoAuxiliarCircularDoble.estudiante.NombreEstudiante);
                    System.out.println("Carnet: " + NodoAuxiliarCircularDoble.estudiante.carnet);
                    System.out.println("Correo: " + NodoAuxiliarCircularDoble.estudiante.CorreoInstitucional);
                    System.out.println("Telefono: " + NodoAuxiliarCircularDoble.estudiante.NumeroTelefono);
                    System.out.println("--------------ESTUDIANTE--ELIMINADO---------------------");

                    UltimoDobleCircular = NodoAnteriorCircularDoble;
                    PrimeroDobleCircular.Anterior = UltimoDobleCircular;
                    UltimoDobleCircular.Siguiente = PrimeroDobleCircular;
                } else {
                    NodoAnteriorCircularDoble.Siguiente = NodoAuxiliarCircularDoble.Siguiente;
                    NodoAuxiliarCircularDoble.Siguiente.Anterior = NodoAnteriorCircularDoble;
                }
            }
            NodoAnteriorCircularDoble = NodoAuxiliarCircularDoble;
            NodoAuxiliarCircularDoble = NodoAuxiliarCircularDoble.Siguiente;

        } while (NodoAuxiliarCircularDoble != PrimeroDobleCircular);

    }

    @Override
    public void Modificar(int ModificarCarnet) {
       Nodo_Circular_Doble NodoAuxiliar=new Nodo_Circular_Doble();
       
       NodoAuxiliar=PrimeroDobleCircular;
       
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
        }while (NodoAuxiliar!=PrimeroDobleCircular);           
            
    }

    @Override
    public void Buscar(int Buscar_Carnet) {
       
        Nodo_Circular_Doble NodoAuxiliar=new Nodo_Circular_Doble();
        NodoAuxiliar=PrimeroDobleCircular;
        char Encontrado='N';
        
        do {
            
            if (NodoAuxiliar.estudiante.carnet==Buscar_Carnet) {
                
                System.out.println("El Estudiante Existe");
                System.out.println("Nombre: "+NodoAuxiliar.estudiante.NombreEstudiante);
                System.out.println("Carnet: "+NodoAuxiliar.estudiante.carnet);
                System.out.println("---------------------------------------------------");
                Encontrado='S';
            }
            
             NodoAuxiliar=NodoAuxiliar.Siguiente;
            
        } while (NodoAuxiliar!=PrimeroDobleCircular);
        
          if (Encontrado=='N') {
            System.out.println("estudiante no encontrado");
        }
        
        
    }

    @Override
    public void Mostrar() {

        Nodo_Circular_Doble NodoAuxiliar = new Nodo_Circular_Doble();
        NodoAuxiliar = PrimeroDobleCircular;
        vacioTDA = Vacio();

        if (vacioTDA == true) {//si no esta vacio entonces lo imprime
            do {
                System.out.println("Nombre del Estudiante: " + NodoAuxiliar.estudiante.NombreEstudiante);
                System.out.println("Carnet del Estudiante: " + NodoAuxiliar.estudiante.carnet);
                System.out.println("Correo del Estudiante: " + NodoAuxiliar.estudiante.CorreoInstitucional);
                System.out.println("Numero de telefono del Estudiante: " + NodoAuxiliar.estudiante.NumeroTelefono);
                System.out.println("---------------------------------------------------------------");
                NodoAuxiliar = NodoAuxiliar.Siguiente;

            } while (NodoAuxiliar != PrimeroDobleCircular);
        } else {//SI LA LISTA NO TIENE ELEMENTOS ENTONCES IMPRIME EL MENSAJE
            System.out.println("la lista se encuentra vacia");

        }

    }

    @Override
    public boolean Vacio() {
        if (PrimeroDobleCircular != null) {
            vacioTDA = true;
        } else {
            vacioTDA = false;
        }
        return vacioTDA;
    }

}
