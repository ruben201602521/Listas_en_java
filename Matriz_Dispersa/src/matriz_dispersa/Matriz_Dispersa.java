/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz_dispersa;

public class Matriz_Dispersa {

    public static void main(String[] args) {

        Matriz AuxiliarMatriz = new Matriz();
        System.out.println("-----------------------------");
        
        //se crean las filas cabecera nada mas no se borrara nada solo mandar -1 en columna
        AuxiliarMatriz.InsertarNodoEnMatriz(-1, 0, "fila 0");
        AuxiliarMatriz.InsertarNodoEnMatriz(-1, 1, "fila 1");
        AuxiliarMatriz.InsertarNodoEnMatriz(-1, 2, "fila 2");
        AuxiliarMatriz.InsertarNodoEnMatriz(-1, 3, "fila 3");
        AuxiliarMatriz.InsertarNodoEnMatriz(-1, 4, "fila 4");
        AuxiliarMatriz.InsertarNodoEnMatriz(-1, 5, "fila 5");
      
        //se crearan las columnas cabececra nada mas no se borrar nada mandar -1 en fila
        AuxiliarMatriz.InsertarNodoEnMatriz(0, -1, "columna 0");
        AuxiliarMatriz.InsertarNodoEnMatriz(1, -1, "columna 1");
        AuxiliarMatriz.InsertarNodoEnMatriz(2, -1, "columna 2");
        AuxiliarMatriz.InsertarNodoEnMatriz(3, -1, "columna 3");
        AuxiliarMatriz.InsertarNodoEnMatriz(4, -1, "columna 4");
        AuxiliarMatriz.InsertarNodoEnMatriz(5, -1, "columna 5");
       
        
        
        //y supuestamente hay elementos en las siguiente columnas y filas
        
        
        AuxiliarMatriz.InsertarNodoEnMatriz(1, 2, "un color");//en la columna 1 fila 2 hay un color
        AuxiliarMatriz.InsertarNodoEnMatriz(5, 5, "color en la columna 5 y fila 5");//color en la columna 5 y fila 5
        AuxiliarMatriz.InsertarNodoEnMatriz(2, 2, "Asdasdf");
        AuxiliarMatriz.InsertarNodoEnMatriz(5, 1, "asdf");
        AuxiliarMatriz.InsertarNodoEnMatriz(5,0,"asdasf");
        AuxiliarMatriz.InsertarNodoEnMatriz(4, 0, "asdf");
        AuxiliarMatriz.InsertarNodoEnMatriz(3, 4, "asdf");
        AuxiliarMatriz.InsertarNodoEnMatriz(3, 1, "asdf");
        AuxiliarMatriz.InsertarNodoEnMatriz(4, 4, "asdf");
        AuxiliarMatriz.InsertarNodoEnMatriz(4, 3, "asdfsafd");
//        AuxiliarMatriz.InsertarNodoEnMatriz(2, 0, "hola");
//        AuxiliarMatriz.InsertarNodoEnMatriz(3, 0, "hola");
//        AuxiliarMatriz.InsertarNodoEnMatriz(0, 1, "hola");//la tabla tiene al reves los valores de como los verias en una matriz normal
//        AuxiliarMatriz.InsertarNodoEnMatriz(1, 1, "hola");
//        AuxiliarMatriz.InsertarNodoEnMatriz(2, 1, "hola");
//        AuxiliarMatriz.InsertarNodoEnMatriz(3, 1, "hola");
//       AuxiliarMatriz.InsertarNodoEnMatriz(1, 1, "hola");
//       AuxiliarMatriz.InsertarNodoEnMatriz(2, 2, "hola");
//       AuxiliarMatriz.InsertarNodoEnMatriz(3, 3, "hola");
//       AuxiliarMatriz.InsertarNodoEnMatriz(5, 1, "hola");
//       AuxiliarMatriz.InsertarNodoEnMatriz(4, 1, "hola");
//       AuxiliarMatriz.InsertarNodoEnMatriz(0, 1, "hola");
        AuxiliarMatriz.ImprimirMatriz();
        System.out.println("-----------------------------");

    }

}
