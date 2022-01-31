
package listas_practica_repaso;

public abstract class TDA {//aqui puede esta clase puede comportarse como una interfaz por esto
    //ya que no le puse como interface class sino que le puse abstract class y por ello en cualquier momento podria dejar de ser una clase abstracta
    //por la definicion de abajo
    
    /* 
    El concepto de Interface(UNA INTERFACE NO ES UNA CLASE ABSTRACTA) lleva un paso más alla el concepto de una clase abstracta en la que vimos que una clase abstracta es una clase que no se puede 
    instanciar (crear un objeto de esa clase) pero si se pueden definir atributos e implementar métodos en ella para que sus clases hijas los puedan 
    utilizar. Pues bien una Interface es una clase abstracta pura en la que todos sus métodos son abstractos y por tanto no se pueden implementar en 
    la clase Interface. Mucho podreis pensar para que vale una clase abstracta pura en la que no se permiten implementar métodos y que encima 
    en las clases hijas de esa interface tengan que tener "si o si" implementados estos métodos; pues bien, las Interfaces sirven para establecer la 
    forma que debe de tener una clase. Un ejemplo que hay en Java sobre Interace es la Interface Map. En la entrada "Map en Java, con ejemplos", 
    vimos que habia diferentes tipos de Map; en concreto los HashMap, TreeMap y LinkedHashMap, lo que quiere decir que todas las clases Map deben de 
    tener implementadas a su manera los mismo métodos como el "put()", "get()", "remove()", etc. y asi lo vimos en esta entrada en la que un HashMap 
    inserta los datos de manera diferente a un TreeMap y al LinkedHashMap. Por tanto vemos como se ha establecido una forma común que deben de respetar 
    todos los Maps de Java.
    Por otro lado se ha de decir que una Interface no se pueden definir atributos salvo que estos sean estaticos o constantes; es decir, "static" o "final".
    
    NOTA A TOMAR EN CUENTA
    una interfaz no es una clase 

    Hemos puesto «clase» para que se pudiera entender fácilmente el concepto desde la asociación de la clase, 
    pues es lo primero que se suele aprender cuando se trata con objetos. Consideramos que para entender el 
    concepto de interfaz de una manera sencilla hay que desmenuzar lo que se entendía anteriormente como clase, pasar por la calse abstracta 
    y llegar a lo que es una interfaz como tal (ir viendo que hace cada cosa gradualmente). 
    Esto no quita lo que nos comentas: una interfaz efectivamente no es una clase.
    
    */
    
    
    
    
    
    /*
    
    Un método abstracto es un método declarado pero no implementado, es decir, es un método del que solo se escribe su nombre, parámetros 
    y tipo devuelto pero no su código.

Los métodos abstractos se escriben sin llaves {} y con ; al final de la declaración.
Por ejemplo:
public abstract double area();
Un método se declara como abstracto porque en ese momento (en esa clase) no se conoce cómo va a ser su implementación.
Por ejemplo: A partir de una clase Polígono se pueden derivar las clases Rectángulo y Triángulo. Ambas clases derivadas usarán un método área. Podemos declararlo en la clase Polígono como método abstracto y dejar que cada clase lo implemente según sus necesidades.
Al incluir el método abstracto en la clase base se obliga a que todas las clases derivadas lo sobrescriban con el mismo formato utilizado en la declaración. Si la clase derivada no implementa el método abstracto que ha heredado, deberá ser declarada como abstracta.
Si una clase contiene un método abstracto se convierte en clase abstracta y debe ser declarada como tal.

La forma general de declarar un método abstracto en Java es:
[modificador] abstract tipoDevuelto nombreMetodo([parámetros]);
    
    */

    public boolean vacioTDA;
    public abstract void Insertar();//servira para definir la insercion de UN NODO,APILAR,ENCOLAR
    
    public abstract void Eliminar();//servira para defirnr la eleminacion de UN NODO,DESAPILAR,ENCOLAR
    
    public abstract void Modificar();//servira para definir la modifcaion  de UN NODO,EN UNA PILA,EN UNA COLA
    
    public abstract void Buscar();//servira para definir la busqueda de algun dato dentro de un NODO,UNA PILA ,UNA COLA
    
    public abstract void Mostrar();//servira para definir la impresion en consola de los datos de UNA LISTA,UNA PILA, UNA COLA
    
    public abstract boolean Vacio();
    
    
            
    
    
}
