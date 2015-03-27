package messagesystem.controler;

import messagesystem.domain.mediator.ServerModelManager;
import messagesystem.domain.model.AbstractMessage;
import messagesystem.view.ServerView;

public class ServerController 
{
	private ServerView view;
	private ServerModelManager model;
	
	public ServerController(ServerModelManager model, ServerView view)
	{
		this.model = new ServerModelManager();
		this.view = new ServerView();
	}
	
	public void execute(String what)
	{	
	
		 switch (what.toLowerCase()) {
	      case "send":
	        String message = view.getAndRemoveInput();
	        if (message.length() > 0) 
	        {
	          model.add("server ", message);
	        
	        }
	        break;
	      case "quit":
	        System.exit(0);
	        break;
	      default:
	        if (what.length() > 0) {
	          model.add("server ", what);
	        }
		 }
	}
	
}
