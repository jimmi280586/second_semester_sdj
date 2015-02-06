package cd.domain.mediator;

import java.io.IOException;

import cd.domain.model.Cd;
import cd.domain.model.CdList;

public class CdModelManager {

	private String TEXT_FILE_NAME;
	private CdPersistence cdpersistence;
	private CdModel cdmodel;
	private CdList cdlist;
	
	public CdModelManager() 
	{
		this.TEXT_FILE_NAME = "src/cds.txt";
		 
	}

	
}
