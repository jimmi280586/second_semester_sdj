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
		 switch (what.toLowerCase()) {
	      case "send":
	        String message = view.getAndRemoveInput();
	        if (message.length() > 0) 
	        {
	          model.add("Client ", message);
	        
	        }
	        break;
	      case "quit":
	        System.exit(0);
	        break;
	      default:
	        if (what.length() > 0) {
	          model.add("Client ", what);
	        }
		 }
	}
}
