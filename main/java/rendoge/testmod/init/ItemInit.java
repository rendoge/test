package rendoge.testmod.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import rendoge.testmod.init.items.CustomIngot;

public class ItemInit 
{
	public static Item test_ingot;
	
	public static void init()
	{
		test_ingot = new CustomIngot("test_ingot");
	}
	
	public static void register()
	{
		registerItem(test_ingot);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
