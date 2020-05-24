package com.example.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	public static void main(String args[]) {

		try {

			// Bind the remote object's stub in the registry
			Registry registry = LocateRegistry.getRegistry(8888);
			AdderRemote remoate = (AdderRemote) registry.lookup("Server");
			remoate.add(220, 330);

			System.err.println(remoate.add(220, 330));
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}

}
