/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apps;

/**
 *
 * @author evert
 */
import javax.swing.JOptionPane;
import interfaces.objCoordinador;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class cliente {
    public static void main(String[] args) throws RemoteException, NotBoundException {

        int segundos;
        

        try {
            //REGISTRO DE LAS FUNCIONES
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            objCoordinador miCoordinador = (objCoordinador) registry.lookup("miCoordinador");

            //VERIFICAR CUANTOS MONITORES HAY FUNCIONANDO
            if (miCoordinador.iniClient() > 0) {
                //OBTENER EL INTERVALO DE MEDICION
                
                System.out.print("Segundos: ");
                Scanner leer = new Scanner(System.in);
                segundos = leer.nextInt();

                //DEVUELVE LA CANTIDAD DE MONITORES ACTIVOS
                while (true) {
                    System.out.println("loadavg: " + miCoordinador.getLoadAvg());

                    //ESPERAMOS PARA VOLVER A HACER LA CONSULTA
                    Thread.sleep(segundos * 1000);
                }
            } else {
                System.out.println("No hay monitores registrados...");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}