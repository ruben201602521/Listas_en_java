/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz_dispersa;


public class Nodo_Matriz {
    
    Nodo_Matriz Siguiente;
    Nodo_Matriz Anterior;
    Nodo_Matriz Abajo;
    Nodo_Matriz Arriba;
    
    int PosicionX;
    int PosicionY;
    // aqui podes tener cualquier objeto o dato que desees guardar para este ejemplo tendremos un dato numerico
    String dato;

    public Nodo_Matriz(int PosicionX, int PosicionY, String dato) {
        this.Siguiente = null;
        this.Anterior = null;
        this.Abajo = null;
        this.Arriba = null;
        this.PosicionX = PosicionX;
        this.PosicionY = PosicionY;
        this.dato = dato;
    }
    
    
   
    
    
    
    
    
    
}
