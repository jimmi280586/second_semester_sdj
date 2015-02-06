package cd.domain.mediator;

import java.io.IOException;

import cd.domain.model.Cd;
import cd.domain.model.CdList;

public class CdModelManager implements CdModel{

	private String TEXT_FILE_NAME;
	private CdPersistence cdpersistence;
	private CdList cdlist;
	
	public CdModelManager() throws IOException 
	{
		this.TEXT_FILE_NAME = "src/cds.txt";
		this.cdpersistence = new CdTextFile("src/cds.txt");
	    this.cdlist = cdpersistence.load(); 
	}

	@Override
	public CdList getAll() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCD(Cd cd) 
	{
		this.cdlist.addCd(cd);
		
	}

	@Override
	public Cd removeCD(String title)
	{
		
		return cdlist.removeFirstCdByTitle(title);
	}

	@Override
	public Cd getCD(int index)
	{
		
		return cdlist.getCD(index);
	}

	@Override
	public Cd getCD(String title)
	{
		
		return cdlist.getCdsByTitle(title).getCD(0);
	}

	@Override
	public int getNumberOfCds()
	{
		
		return cdlist.getNumberOfCds();
	}

	
}
