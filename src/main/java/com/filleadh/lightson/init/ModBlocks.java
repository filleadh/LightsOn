package com.filleadh.lightson.init;

import com.filleadh.lightson.Reference;
import com.filleadh.lightson.Util;
import com.filleadh.lightson.blocks.BlockCubeLight;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks  {
	
	
	public static Block cubelight;
	
	public static void init() {
		cubelight = new BlockCubeLight("cubelight", "cubelight");
	}
	
	public static void register() {
		registerBlock(cubelight);
	}
	
	public static void registerRenders() {
		registerRender(cubelight);
	}
	
	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);

		Util.getLogger().info("Registered Block: " + block.getUnlocalizedName().substring(5));
	}
	

	
	public static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, block.getUnlocalizedName().substring(5)),"inventory"));
		Util.getLogger().info("Register Render: " + block.getUnlocalizedName().substring(5));
		
	}
}
