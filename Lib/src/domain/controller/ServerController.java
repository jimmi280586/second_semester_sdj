package domain.controller;

import chat.domain.model.AbstractMessage;
import chat.domain.model.PrivateMessage;
import chat.domain.model.PublicMessage;
import domain.mediator.ServerModelManager;
import domain.view.ServerView;

public class ServerController
{
	private ServerModelManager modelManager;
	private ServerView view;
	
	public ServerController(ServerModelManager model, ServerView view)
	{
		this.modelManager = model;
		this.view = view;
		
	}
	
	public void execute(String what)
	{
		modelManager.add(new PublicMessage("server",what));;
		
	}
	
}
