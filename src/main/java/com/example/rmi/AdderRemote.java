package com.example.rmi;

import java.rmi.*;

public interface AdderRemote extends Remote {
	public int add(int x, int y) throws RemoteException;
}