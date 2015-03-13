package messagesystem.controler;

import messagesystem.domain.mediator.ClientModelManager;
import messagesystem.view.ClientView;

public class ClientController 
{
	private ClientView view;
	private ClientModelManager model;
	
	public ClientController(ClientModelManager model, ClientView view)
	{
		this.model = new ClientModelManager();
		this.view = new ClientView();
	}
	
	public void execute(String what)
	{
		
	}
}
