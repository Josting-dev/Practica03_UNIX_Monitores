/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author evert
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface objetomonitor extends Remote {

    void pingMonitor() throws RemoteException;
}