package com.filleadh.lightson;

import com.filleadh.lightson.Reference;
import com.filleadh.lightson.Util;
import com.filleadh.lightson.init.ModBlocks;
import com.filleadh.lightson.init.ModItems;
import com.filleadh.lightson.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class LightsOn {

	@Mod.Instance(Reference.MOD_ID)	
	public static LightsOn instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY, clientSide = Reference.CLIENT_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
			ModItems.init();
			ModBlocks.init();
			ModItems.register();
			ModBlocks.register();
			
			proxy.registerRenders();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		Util.getLogger().info("Init");
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Util.getLogger().info("postInit");
		
	}

}
