package com.example.rmi;

import java.rmi.*;
import java.rmi.server.*;

public class AdderRemoteImpl extends UnicastRemoteObject implements AdderRemote {
	/**
	 * 
	 */
	private static final long serialVersionUID = 241930672693997210L;

	public AdderRemoteImpl() throws RemoteException {
		super();
	}

	public int add(int x, int y) {
		return x + y;
	}
}