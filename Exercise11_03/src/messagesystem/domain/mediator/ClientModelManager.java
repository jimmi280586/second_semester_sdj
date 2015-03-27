package messagesystem.domain.mediator;

import java.util.Observable;
import java.util.Observer;

import messagesystem.domain.model.AbstractMessage;
import messagesystem.domain.model.PublicMessage;
import messagesystem.domain.model.SimpleDate;

public class ClientModelManager extends Observable
{
	private ClientModelManager model;
	private Proxy proxy = new Proxy(model);
	private String server;

	public void add(String from, String msge)
	{
		AbstractMessage msg = new AbstractMessage(from, msge)
		{
		};
		proxy.add(msg);
	}
	
	 public void update(Observable arg0, Object arg1)
	   {
	      try
	      {
	         AbstractMessage message = (AbstractMessage) arg1;
	         send(message);
	      }
	      catch (Exception e)
	      {
	         // no client connection
	         System.out.println("Exception for client broadcast to " + server
	               + " - " + e.getMessage());
	         model.deleteObserver((Observer) this);
	         AbstractMessage pl = new PublicMessage(server, "client> " + server
	               + " disconnected " + new SimpleDate().getTime());
	         System.out.println(pl);
	         model.add(pl);
	      }
	   }

	private void send(AbstractMessage message) {
		// TODO Auto-generated method stub
		
	}

	private void add(AbstractMessage pl) 
	{
		proxy.add(pl);
		
	}
}
