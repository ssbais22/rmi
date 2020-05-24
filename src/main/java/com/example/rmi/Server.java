package com.example.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
	 public static void main(String args[]) {
	 
    try {
        AdderRemote obj = new AdderRemoteImpl();
       // AdderRemote stub = (AdderRemote) UnicastRemoteObject.exportObject(obj, 4821);

        // Bind the remote object's stub in the registry
        Registry registry = LocateRegistry.createRegistry(8888);
        registry.bind("Server", obj);

        System.err.println("Server ready");
    } catch (Exception e) {
        System.err.println("Server exception: " + e.toString());
        e.printStackTrace();
    }
}

}
