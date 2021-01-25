package bus_binaria;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Bus_binaria {

    public static void main(String[] args) {

        int op, aux;
        do {
            int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Defina el tamaño del arreglo"));

            int arreglo[] = new int[tamaño];
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ".Digite un elemento: "));

            }

            // metodo de ordenamiento burbuja 
            for (int i = 0; i < (tamaño - 1); i++) {
                for (int j = 0; j < (tamaño - 1); j++) {
                    if (arreglo[j] > arreglo[j + 1]) {//  si numero actual es mayor al numero siguiente
                        aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;

                    }
                }
            }

            //mostrar elementos del arreglo
            JOptionPane.showMessageDialog(null, "Datos del arreglo");
            for (int i = 0; i < arreglo.length; i++) {
                JOptionPane.showMessageDialog(null, "arreglo en la posicion [" + i + "] = " + arreglo[i]);
            }

            int num_buscado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un elemento que desea buscar"));
            int inferior = 0;
            int centro;
            int superior = tamaño - 1;

            while (inferior <= superior) {
                centro = ((superior + inferior) / 2);
                if (arreglo[centro] == num_buscado) {
                    JOptionPane.showMessageDialog(null, "el numero se encuentra en la posición:  " + centro);
                    break;
                } else if (num_buscado < arreglo[centro]) {
                    superior = centro - 1;
                } else {
                    inferior = centro + 1;
                }

            }

            //busqueda secuencial
            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i] == num_buscado) {
                    JOptionPane.showMessageDialog(null, "el numero se encuentra en la posición:  " + i);
                }
            }
            op = Integer.parseInt(JOptionPane.showInputDialog("Desea volver a realizar otra operacion? 1:si 2:no"));
            JOptionPane.showMessageDialog(null, "¡Programa Finalizada! ");
        } while (op < 2);
    }

}
