package cd.controller;

import cd.domain.mediator.CdModel;
import cd.domain.model.Cd;
import cd.domain.model.CdList;
import cd.view.CdView;


public class Controller 
{
	private CdModel model;
	private CdView view;
	
	public Controller(CdModel model, CdView view)
	{
		this.model = model;
		this.view = view;
	}

	public void execute(String what)
	{
		switch (what)
		{
			case "List":
				this.view.show("" + this.model.getAll());
				break;
			case "Add":
				this.view.show("Add method - not implemented");
				break;
			case "Remove":
				String input = this.view.get("Title");
				if (input.length() == 0)
					return;
				String msg = "";
				Cd cd = this.model.removeCD(input);
				if (cd != null)
				{
					msg = "REMOVED: \n" + cd.toString();
				}
				else
				{
					msg = "No CD with title: \"" + input + "\" found";
				}
				this.view.show(msg);
				break;
			case "Search":
				input = this.view.get("Title");
				if (input == null)
					return;
				msg = "";
				CdList list = this.model.getCD(input);
				for (int i = 0; i < list.getNumberOfCds(); i++)
				{
					msg += list.getCD(i) + "\n";
				}
				if (list.getNumberOfCds() == 0)
				{
					msg = "No CD with title: \"" + input + "\" found";
				}
				this.view.show(msg);
				break;
			case "Quit":
				System.out.println("Quit");
				break;
			default:
				this.view.show("Wrong input");
				break;
		}
	}

	
}
