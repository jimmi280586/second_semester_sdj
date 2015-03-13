package messagesystem.controler;

import messagesystem.domain.mediator.ServerModelManager;
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
		
	}
	
}
