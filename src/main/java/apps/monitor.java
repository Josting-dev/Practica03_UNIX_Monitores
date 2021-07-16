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
import interfaces.objCoordinador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class monitor {

    public static void main(String[] args) {

        int segundos;
        String id;
        String loadavg;

        try {

            //leemos el valor del hostname del monitor.
            BufferedReader br2 = new BufferedReader(new FileReader(new File("/etc/hostname")));
            id = br2.readLine();
            System.out.println("Monitor: " + id + " - en ejecucion");

            //REGISTRO DE LAS FUNCIONES
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            objCoordinador miCoordinador = (objCoordinador) registry.lookup("miCoordinador");

            //OBTENGO LOS SEGUNDOS
            segundos = miCoordinador.iniMonitor(id);

            while (true) {
                
                //se obtiene el valor de loadavg
                BufferedReader br = new BufferedReader(new FileReader(new File("/proc/loadavg")));
                loadavg = br.readLine();

                //INSERTAR DATO DEL FICHERO LOADAVG
                miCoordinador.loadMonitor(id + " " + loadavg);

                //ESPERAMOS X SEGUNDOS
                Thread.sleep(segundos * 1000);
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }

    }

}