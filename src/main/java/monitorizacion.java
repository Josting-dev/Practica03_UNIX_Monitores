/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
/**
 *
 * @author evert
 */
public interface monitorizacion extends Remote
{
    
    public String id(String x, String z ) throws RemoteException;
    
    public String iniMonitor(String x) throws RemoteException;
    
    public String loadMonitor(String y) throws RemoteException;
    
    public String iniClient(String r) throws RemoteException;
    
    public String getLoadAvg (String w) throws RemoteException;

}
