/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.Naming;
import java.rmi.Remote;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author evert
 */
public class Monitor_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try{
            Registry miRegistro=LocateRegistry.getRegistry("localhost", 1099);
            miRegistro.bind("monitorizacion",(Remote) new RMI());
            
            
            
            monitorizacion c= (monitorizacion)Naming.lookup("//localHost/monitorizacion");
            String id="1";
            String estado="conectado";
            
            while(true){
                c.id(id, estado);
                JOptionPane.showMessageDialog(null,
                "Calculadora en RMI made by Evert Meneses and Jeffries Areas\n");
                JOptionPane.showMessageDialog(null, estado);
              
                
            }
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Servidor inalcanzable\nConectese primero al servidor");
        }
        
// TODO code application logic here
    }
    
}
