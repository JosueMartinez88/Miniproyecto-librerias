//Martínez Vera Josué Aldair
//Solis Contreras Darian Giselle
package Miniproyecto;
//usamos la libreria swing y la clase "JOptionPane" para que me salga un panel emergente
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Interfaz {
    public int menu(){
        //Instanciamos el objeto "panelito" de la clase JOptionPane
        JOptionPane panelito = new JOptionPane();
        //Instanciamos la clase "aleatorio" de la clase que creamos anteriormente
        Aleatorio aleatorio = new Aleatorio();
        Scanner leer = new Scanner(System.in);
        //Declaramos la variable "opc" haciendo referencia a opción que ingrese el usuario
        int opc;
        //creamos un do while para hacer uso del menú las veces que el usuario quiera
        do{
            //Integer.paseInt nos permite convertir cadenas a números siempre que haya un número entero en esa
            //cadena, dentro de este método, solicitamos ingreso de los datos, en este caso opción
            opc = Integer.parseInt(panelito.showInputDialog("Menú\n"
                    + "1. Crear número del 1 al 100 \n"
                    + "2. Salir\n"
                    + "Elija una opción: "));
            //usamos un switch para comparar cada cso
            switch(opc){
                case 1:
                    //en caso de que ponga un 1 entonces genera el número aleatorio y lo muestra en pantalla
                    panelito.showMessageDialog(null, aleatorio.aleatorio());
                    break;
                case 2:
                    //en caso de que quiera salir solo ponemos "saliendo" y rompemos el caso
                    panelito.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    //en caso de que scriba algo que no está en las opciones muestra este mensaje
                    panelito.showMessageDialog(null, "No existe esa opción, intenta de nuevo:");
            }
        //Utilizamos != para seguir ejecutando el Do While mienteras opc sea diferente de 2
        }while(opc != 2);
        
        return 0;
    }
}
