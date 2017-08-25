package com.filleadh.lightson.proxy;

import com.filleadh.lightson.init.ModBlocks;
import com.filleadh.lightson.init.ModItems;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
