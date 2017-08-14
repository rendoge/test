package rendoge.testmod.init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import rendoge.testmod.init.blocks.CustomOre;

public class BlockInit 
{
	public static Block test_ore; 
	
	public static void init()
	{
		test_ore = new CustomOre("test_ore", 1.0F, 4.0F, 2);
	}
	
	public static void register()
	{
		registerBlock(test_ore);
	}
	
	public static void registerBlock(Block block)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		ModelLoader.setCustomModelResourceLocation(item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
