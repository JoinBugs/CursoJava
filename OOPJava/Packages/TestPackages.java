package mvc.test;

import mvc.vista.View;
import mvc.controlador.Controller;

public class TestPackages
{
	public static void main(String[] args)
	{
		View objView = new View();
		Controller objCont = new Controller();
		
		objView.helloName();
		objCont.helloName();
	}
}