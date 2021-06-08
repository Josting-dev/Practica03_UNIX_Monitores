/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author evert
 */
public class CLIENTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try{
            Registry miRegistro=LocateRegistry.getRegistry("localhost", 1099);
            monitorizacion c= (monitorizacion)Naming.lookup("//localHost/monitorizacion");
            String id="1";
            String estado="conectado";
            
            while(true){
                c.id(id, estado);
                JOptionPane.showMessageDialog(null,
                "Calculadora en RMI made by Evert Meneses and Jeffries Areas\n");
                JOptionPane.showMessageDialog(null, estado);
              /**  switch(opcion){
                    case "1": {
                        int p=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                        int q=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
                        JOptionPane.showInputDialog(null, "El totla es: \n",c.sumar(p,q));
                        break;
                    }
                    case "2"
                        : {
                        int p=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                        int q=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
                        JOptionPane.showInputDialog(null, "El totla es: \n",c.restar(p,q));
                        break;
                    }
                    case "3": {
                        int p=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                        int q=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
                        JOptionPane.showInputDialog(null, "El totla es: \n",c.multiplicar(p,q));
                        break;
                    }
                    case "4": {
                        int p=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                        
                        int q=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
                        while(q==0)
                            q=Integer.parseInt(JOptionPane.showInputDialog("valor invalido. \nIngrese otro valor"));
                        
                        JOptionPane.showInputDialog(null, "El totla es: \n",c.dividir(p,q));
                        break;
                    }
                }*/
                
            }
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Servidor inalcanzable\nConectese primero al servidor");
        }
        
// TODO code application logic here
    }
    
}
