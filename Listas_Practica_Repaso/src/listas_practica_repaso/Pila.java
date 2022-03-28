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
public class Pila extends TDA {

    Nodo_Pila Primero;//sera la cabeza o el primer nodo de la lista

    Scanner teclado = new Scanner(System.in);
    int opcionMod;

    public Pila() {

        Primero = null;
    }

    @Override
    public void Insertar() {

        Nodo_Pila NuevoDato = new Nodo_Pila();
        System.out.println("ingrese nombre del estudiante");
        NuevoDato.estudiante.NombreEstudiante = teclado.nextLine();
        System.out.println("ingrese carnet del estudiante");
        NuevoDato.estudiante.carnet = teclado.nextInt();
        teclado.nextLine();
        System.out.println("ingrese correo institucional del estudiante");
        NuevoDato.estudiante.CorreoInstitucional = teclado.nextLine();
        System.out.println("ingrese numero de telefono del estudiante");
        NuevoDato.estudiante.NumeroTelefono = teclado.nextInt();
        teclado.nextLine();
        NuevoDato.Siguiente = Primero;
        Primero = NuevoDato;

    }

    @Override//COMO EN UNA PILA SOLO SE PUEDE SACAR POR ARRIBA OSEA FILOSOFIA LIFO>>ultimo en entrar primero en salir
    //hare que al seleccionar en el menu principal a este metodo se le envie un numero 0 el cual no utilizare solo sera de cajon
    public void Eliminar(int Eliminar) {
      if (Vacio() == true) {//verifica si la pila no esta vacia
            Nodo_Pila NodoAuxiliar = new Nodo_Pila();
            
            //primero muestro el contenido del estudiante que se encuentra en la cima de la pila el cual sera eliminado
            NodoAuxiliar = Primero;
            System.out.println("Nombre: " + NodoAuxiliar.estudiante.NombreEstudiante);
            System.out.println("Carnet: " + NodoAuxiliar.estudiante.carnet);
            System.out.println("Correo: " + NodoAuxiliar.estudiante.CorreoInstitucional);
            System.out.println("Telefono: " + NodoAuxiliar.estudiante.NumeroTelefono);
            System.out.println("--------------ESTUDIANTE--ELIMINADO---------------------");
            //luego lo elimino
            NodoAuxiliar = Primero.Siguiente;
            Primero=NodoAuxiliar;

        }
        else{
            System.out.println("la pila esta vacia");
        }
    }

  

    @Override
    public void Modificar(int ModificarCarnet) {
        Nodo_Pila NodoAuxiliar=new Nodo_Pila();
        
        NodoAuxiliar=Primero;
           
        while (NodoAuxiliar!=null) {            
            
            if (NodoAuxiliar.estudiante.carnet==ModificarCarnet) {
                
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
    public void Buscar(int BuscarCarnet) {

        Nodo_Pila NodoAuxiliar=new Nodo_Pila();
        NodoAuxiliar=Primero;
         char Encontrado='N';
            while (NodoAuxiliar!=null) {
           
            if (NodoAuxiliar.estudiante.carnet==BuscarCarnet) {
                
                System.out.println("El Estudiante Existe");
                System.out.println("Nombre: "+NodoAuxiliar.estudiante.NombreEstudiante);
                System.out.println("Carnet: "+NodoAuxiliar.estudiante.carnet);
                System.out.println("---------------------------------------------------");
                Encontrado='S';
            }
            
            NodoAuxiliar=NodoAuxiliar.Siguiente;
        }
        
        if (Encontrado=='N') {
            System.out.println("estudiante no encontrado");
        }
        
    }

    @Override
    public void Mostrar() {//mostrara los datos de la pila

        Nodo_Pila NodoAuxiliar = new Nodo_Pila();
        NodoAuxiliar = Primero;

        vacioTDA = Vacio();

        if (vacioTDA == true) {
            while (NodoAuxiliar != null) {

                System.out.println("Nombre del Estudiante: " + NodoAuxiliar.estudiante.NombreEstudiante);
                System.out.println("Carnet del Estudiante: " + NodoAuxiliar.estudiante.carnet);
                System.out.println("Correo del Estudiante: " + NodoAuxiliar.estudiante.CorreoInstitucional);
                System.out.println("Numero de telefono del Estudiante: " + NodoAuxiliar.estudiante.NumeroTelefono);
                System.out.println("---------------------------------------------------------------");

                NodoAuxiliar = NodoAuxiliar.Siguiente;
            }
        } else {//SI LA PILA NO TIENE ELEMENTOS ENTONCES IMPRIME EL MENSAJE
            System.out.println("la lista se encuentra vacia");

        }

    }

    @Override
    public boolean Vacio() {

        if (Primero != null) {//si no esta vacio entonces es verdadero

            vacioTDA = true;
        } else {
            vacioTDA = false;
        }

        return vacioTDA;
    }

}
