/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz_dispersa;


public class Matriz {
    
    
     Nodo_Matriz Raiz;
    
     public Matriz(){
        
       Raiz=new Nodo_Matriz(-1, -1, "Raiz"); 
        
        
    }
    
    
    //Buscar columna
    
    public Nodo_Matriz BuscarColumna(int posicionEn_X){
        
        Nodo_Matriz Auxiliar=Raiz;
        while (Auxiliar!=null) {            
            
            if (Auxiliar.PosicionX==posicionEn_X) {
                
                return Auxiliar;
                
                
            }
            
          Auxiliar=Auxiliar.Siguiente;
            
        }
     return null;
    }
    
    
    
    //Buscar Fila
    
    public Nodo_Matriz BuscarFila(int posicionEn_Y){
        
        Nodo_Matriz Auxiliar=Raiz;
        while (Auxiliar!=null) {            
            
            if (Auxiliar.PosicionY==posicionEn_Y) {
                
                return Auxiliar;
                
                
            }
            
          Auxiliar=Auxiliar.Abajo;
            
        }
     return null;
    }
    
    
    //insertar cabecera Columna
    
    
    public Nodo_Matriz CrearColumna(int Posicion_X){
        
        
        Nodo_Matriz NodoColumna=Raiz;
        Nodo_Matriz NuevaColumna= new Nodo_Matriz(Posicion_X, -1,"Column");
        
        Nodo_Matriz Columna=Insertar_En_Orden_Columna(NuevaColumna,NodoColumna);
        
        return Columna;
        
    }
    //INSERTAR EN ORDEN LAS COLUMNAS
    public Nodo_Matriz Insertar_En_Orden_Columna(Nodo_Matriz Nuevo,Nodo_Matriz Cabeza_columna){
        
        
        Nodo_Matriz Auxiliar=Cabeza_columna;
        boolean Insertado=false;
        
        
        
        while (true) {            
            
            if (Nuevo.PosicionX==Auxiliar.PosicionX) {//si ya existe solo sobreEscribimos
                
                Auxiliar.PosicionY=Nuevo.PosicionY;
                
                Auxiliar.dato=Nuevo.dato;
                return Auxiliar;
                
            }
            
            else if (Auxiliar.PosicionX>Nuevo.PosicionX) {
                Insertado=true;
                break;
            }
            
            if (Auxiliar.Siguiente!=null) {
                
                Auxiliar=Auxiliar.Siguiente;
                
            }
            
            else{
                
                
              Insertado=false;
              break;
            }
            
            
        }
        
        if (Insertado==true) {
            
            Nuevo.Siguiente=Auxiliar;
            Auxiliar.Anterior.Siguiente=Nuevo;
            Nuevo.Anterior=Auxiliar.Anterior;
            Auxiliar.Anterior=Nuevo;
        }
        
        else{
            
            Auxiliar.Siguiente=Nuevo;
            Nuevo.Anterior=Auxiliar;
            
            
        }
        
        
        return Nuevo;
    }
    
    
    
      //insertar cabecera Fila
    
    
    public Nodo_Matriz CrearFila(int Posicion_Y){
        
        
        Nodo_Matriz NodoFila=Raiz;
        Nodo_Matriz NuevaFila= new Nodo_Matriz(-1,Posicion_Y,"Fila");
        
        Nodo_Matriz Fila=Insertar_En_Orden_Fila(NuevaFila,NodoFila);
        
        return Fila;
        
    }
    
    
    
      //INSERTAR EN ORDEN LAS FILAS
    public Nodo_Matriz Insertar_En_Orden_Fila(Nodo_Matriz Nuevo,Nodo_Matriz Cabeza_Fila){
        
        
        Nodo_Matriz Auxiliar=Cabeza_Fila;
        boolean Insertado=false;
        
        
        
        while (true) {            
            
            if (Nuevo.PosicionY==Auxiliar.PosicionY) {//si ya existe solo sobreEscribimos
                
                Auxiliar.PosicionX=Nuevo.PosicionX;
                
                Auxiliar.dato=Nuevo.dato;
                return Auxiliar;
                
            }
            
            else if (Auxiliar.PosicionY>Nuevo.PosicionY) {
                Insertado=true;
                break;
            }
            
            if (Auxiliar.Abajo!=null) {
                
                Auxiliar=Auxiliar.Abajo;
                
            }
            
            else{
                
                
              Insertado=false;
              break;
            }
            
            
        }
        
        if (Insertado==true) {
            
            Nuevo.Abajo=Auxiliar;
            Auxiliar.Arriba.Abajo=Nuevo;
            Nuevo.Arriba=Auxiliar.Arriba;
            Auxiliar.Arriba=Nuevo;
        }
        
        else{
            
            Auxiliar.Abajo=Nuevo;
            Nuevo.Arriba=Auxiliar;
            
            
        }
        
        
        return Nuevo;
    }
  
    
    
    public void InsertarNodoEnMatriz(int PosicionX,int PosicionY,String Dato){
        
        Nodo_Matriz Nuevo=new Nodo_Matriz(PosicionX, PosicionY, Dato);
        
        Nodo_Matriz Columna=BuscarColumna(PosicionX);
        Nodo_Matriz Fila=BuscarFila(PosicionY);
        //=========================================================================================================

        //CASO 1 NO EXISTEN LA FILA NI LA COLUMNA
        
        if (Fila==null&&Columna==null) {
            
            System.out.println("no exite la fila ni la columna se creara CASO 1");
            
            //creando la fila y columna osea las cabeceras
            
            Columna=CrearColumna(PosicionX);
            Fila=CrearFila(PosicionY);
            //se inserta el contenido del nodo 
            Nuevo=Insertar_En_Orden_Columna(Nuevo, Fila);
            Nuevo=Insertar_En_Orden_Fila(Nuevo, Columna);
            
            
        }
        //=========================================================================================================
        //caso 2 no existe la fila pero si la columna
        else if (Fila==null&&Columna!=null) {
            
            System.out.println("se creara la fila por que la columna ya existe CASO 2");
            //creamos la fila
            Fila=CrearFila(PosicionY);
            //insertamos el contenido de ese nodo
            
            
            Nuevo=Insertar_En_Orden_Columna(Nuevo, Fila);
            Nuevo=Insertar_En_Orden_Fila(Nuevo, Columna);
            
            
        }
        //caso 3 no existe la columna pero si la fila
        else if (Fila!=null && Columna==null) {
            System.out.println("se creara la columna por que la fila ya existe CASO 3");
            //creamos la columna
            Columna=CrearColumna(PosicionX);
            //insertamos el contenido de ese nodo
            
            Nuevo=Insertar_En_Orden_Columna(Nuevo, Fila);
            Nuevo=Insertar_En_Orden_Fila(Nuevo, Columna);
            
        }
        
        //caso 4 donde si exite la fila y tambien exite la columna
        
        else if (Fila!=null&&Columna!=null) {
            
            
            System.out.println("se insertara en una fila y columna ya exitentes CASO 4");
            
            Nuevo=Insertar_En_Orden_Columna(Nuevo, Fila);
            Nuevo=Insertar_En_Orden_Fila(Nuevo, Columna);
            
        }
        
    }
    
    
    public void ImprimirMatriz(){
        
        Nodo_Matriz Auxiliar=Raiz;
        
        while (Auxiliar!=null) {            
            
            String Text="";
            Nodo_Matriz Auxiliar2=Auxiliar;
            while (Auxiliar2!=null) {                
                
                
                Text+="["+String.valueOf(Auxiliar2.PosicionX)+String.valueOf(Auxiliar2.PosicionY)+"]";
                Auxiliar2=Auxiliar2.Siguiente;
                System.out.print(Text);
                Text="";
            }
             System.out.println("");
            Auxiliar=Auxiliar.Abajo;
            
        }
        
      
    }
   
}
