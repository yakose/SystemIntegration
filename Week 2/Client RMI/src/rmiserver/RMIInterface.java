package rmiserver;
/**
 * This interface defines the methods, which will be accessible remotely
 * It has to
 * - extend the java.rmi.Remote interface
 * - all its methods must throw java.rmt.RemoteException, which will be caught by the clients, so they know if a RMI was successful
 *
 * @author Dora Di
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote
{
    // Simple arithmetics
    public double calculate(int a, int b, char c) throws RemoteException;

    // Get current date
    public java.util.Date getDate() throws RemoteException;

}