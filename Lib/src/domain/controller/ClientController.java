package domain.controller;


import javax.swing.text.View;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import domain.mediator.ClientModelManager;
import domain.view.ClientView;

public class ClientController
{
	private ClientModelManager model; // Instance of modeManager
	private ClientView view;
		
	public ClientController(ClientModelManager model, ClientView view)
	{
		this.model = model;
		this.view = view;
		
	}
	
	public void execute(String what, String command, int type) throws TransformerException, ParserConfigurationException
	{
		switch (what)
		{
		case "Send":
       
         case "Quit":
            System.exit(0);
		}
	}
}