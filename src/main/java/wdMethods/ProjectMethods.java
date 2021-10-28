package wdMethods;

import org.testng.annotations.BeforeSuite;

public class ProjectMethods extends GenericMethods {
	@BeforeSuite
	public void init()
	{
		start();
	}

}
