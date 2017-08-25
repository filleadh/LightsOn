package com.filleadh.lightson.blocks;

import com.filleadh.lightson.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class BlockCubeLight extends Block {
	public BlockCubeLight(String unlocalizedName, String registryName) {
		super(Material.GLASS);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, registryName));
		this.setLightLevel(1.0f);
		this.setCreativeTab(CreativeTabs.DECORATIONS);
	}
}
