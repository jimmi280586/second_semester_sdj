package messagesystem.domain.mediator;

import java.util.Observable;

import messagesystem.domain.model.AbstractMessage;
import messagesystem.domain.model.MessageList;

public class ServerModelManager extends Observable
{
	private MessageList list = new MessageList();
	public void add(String from, String message)
	{
		AbstractMessage msg = new AbstractMessage(from, message)
		{
		
		}; 
		
		list.add(msg);
		
	}
	public void add(AbstractMessage pl) 
	{
		list.add(pl);
		
	}
	
}
