package rmiserver;
/**
 *
 * @author Dora Di
 *
 * java.rmi.server.UnicastRemoteObject is one of classes meant for implementation of various distribution schemes
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIInterfaceImplementation extends UnicastRemoteObject implements RMIInterface
{
    public RMIInterfaceImplementation() throws RemoteException
    {
        super();
    }

    // provide the interface methods implementation
    public java.util.Date getDate() throws RemoteException
    {
        return new java.util.Date();
    }

    public double calculate(int a, int b, char c) throws RemoteException
    {
        double result = 0.0;
        switch(c)
        {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = (double)a / b; break;
            case '%': result = a % b;
        }
        return result;
    }
}