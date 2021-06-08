/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;
/**
 *
 * @author evert
 */
public class Coordinador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            
            
            monitorizacion c= (monitorizacion)Naming.lookup("//localHost/monitorizacion");
            
            
            
            Registry r=java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("monitorizacion", (Remote) new RMI());
            JOptionPane.showMessageDialog(null, "Servidor conectados correctamente");
            
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"No es posible conectar con el servidor"+ e);
        }

// TODO code application logic here
    }
    
}
