import messagesystem.controler.ServerController;
import messagesystem.domain.mediator.ServerModelManager;
import messagesystem.view.ServerView;


public class Server
{

	public static void main(String[] args)
	{
		try {
			ServerModelManager model = new ServerModelManager();
			ServerView view = new ServerView();
			view.setVisible(true);
			ServerController controller = new ServerController(model, view);
			
			view.start(controller);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
