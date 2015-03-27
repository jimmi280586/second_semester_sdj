package messagesystem.domain.mediator;

import messagesystem.domain.model.AbstractMessage;

public interface ModelInterface 
{
	public void add(String from, String message);

	public void add(AbstractMessage message);
}
