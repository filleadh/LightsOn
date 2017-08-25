package com.filleadh.lightson.init;

import com.filleadh.lightson.Reference;
import com.filleadh.lightson.Util;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModItems {

	
	public static void init() {
	}
	
	public static void register() {
/*		registerItem(itemname);
*/		
	}
	
	public static void registerRenders() {
/*		registerRender(itemname);
*/
	}
	
	public static void registerItem(Item item) {
		GameRegistry.register(item);
		Util.getLogger().info("RegisterItem for" + item.getRegistryName());
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, item.getUnlocalizedName().substring(5)),"inventory"));
		Util.getLogger().info("registerRender for " + item.getUnlocalizedName().substring(5));
	}
}
