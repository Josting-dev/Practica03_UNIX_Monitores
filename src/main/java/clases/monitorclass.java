/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author evert
 */
import interfaces.objetomonitor;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class monitorclass extends UnicastRemoteObject implements objetomonitor {

    public monitorclass() throws RemoteException {
        super();
    }

    
    public void pingMonitor() throws RemoteException {
        //QUE VOY HACER?
        
    }
}