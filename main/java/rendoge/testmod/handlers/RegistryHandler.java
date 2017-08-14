package rendoge.testmod.handlers;

import rendoge.testmod.init.BlockInit;
import rendoge.testmod.init.ItemInit;

public class RegistryHandler 
{
	public static void Client()
	{
		
	}
	public static void Common()
	{
		ItemInit.init();
		ItemInit.register();
		
		BlockInit.init();
		BlockInit.register();
	}
}
