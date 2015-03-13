

import messagesystem.controler.ClientController;
import messagesystem.domain.mediator.ClientModelManager;
import messagesystem.view.ClientView;

public class Client 
{

	public static void main(String[] args) 
	{
		try {
			ClientModelManager model = new ClientModelManager();
			ClientView view = new ClientView();
			view.setVisible(true);
			ClientController controller = new ClientController(model, view);
			
			view.start(controller);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
