package messagesystem.domain.mediator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import messagesystem.domain.model.AbstractMessage;

public class Proxy implements ModelInterface

{
	private final int PORT = 2112;
	private final String HOST = "localhost";
	
	private Socket clientSocket;
	private ObjectOutputStream outToServer;
	private BufferedReader inFromServer;
	
	public Proxy(ClientModelManager model)
	{
		try
		{
			clientSocket = new Socket(HOST, PORT);
			
			outToServer = new ObjectOutputStream(clientSocket.getOutputStream());
			inFromServer = new BufferedReader(inFromServer);
			
			ClientRecieverThread recieverThread = new ClientRecieverThread(inFromServer, model);
			
			recieverThread.setDaemon(true);
			recieverThread.start();
		}
		catch ( Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void login()
	{
		
	}
	
	public void logout()
	{
		
	}

	@Override
	public void add(AbstractMessage message) 
	{		
		try
		{
			System.out.println(message);
			outToServer.writeObject(message);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void add(String from, String message) {
		// TODO Auto-generated method stub
		
	}
}
