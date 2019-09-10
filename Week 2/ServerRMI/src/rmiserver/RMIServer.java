package rmiserver;
/**
 *
 * @author Dora Di
 */
import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer
{
    /**
     * @param args the command line arguments
     */
    public static Registry registry;

    public RMIServer() throws RemoteException { }

    public static void main(String[] args)
    {
        try
        {
            System.out.println("RMI server localhost starts");

            // Create a server registry at default port 1099
            registry = LocateRegistry.createRegistry(1099);
            System.out.println("RMI registry created ");

            // Create engine of remote services, running on the server
            RMIInterfaceImplementation remoteEngine = new RMIInterfaceImplementation();

            // Give a name to this engine
            String engineName = "Compute";

            // Register the engine by the name, which later will be given to the clients
            Naming.rebind("//localhost/" + engineName, remoteEngine);
            System.out.println("Engine " + engineName + " bound in registry");
        }
        catch (Exception e)
        {
            System.err.println("Exception:" + e);
        }
    }
}


