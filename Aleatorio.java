//Martínez Vera Josué Aldair
//Solis Contreras Darian Giselle
package Miniproyecto;
//De la libreria de java "util" importamos la clase "Random" que nos permite generar números aleatorios
import java.util.Random;

public class Aleatorio {
    public int aleatorio(){
        //Declaramos una variable entera que va a almacenar el numero aleatorio
        int num_aleatorio;
        //Instanciamos el objeto "aleatorio" de la clase Random
        Random aleatorio = new Random();
        num_aleatorio = aleatorio.nextInt(100)+1;
        return num_aleatorio;
    }
}
