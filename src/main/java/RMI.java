/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author evert
 */
public class RMI extends UnicastRemoteObject implements monitorizacion{
    public RMI() throws RemoteException{String x,y;}
    
    public String id(String x, String y) throws RemoteException{
        
        String estado=x.concat("-");
        estado=estado.concat(y);
        
        
        
        return estado;
    }
    
   
}
    

