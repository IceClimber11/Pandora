package com.iceclimber11.pandora.Blocks;

import com.iceclimber11.pandora.core.creativetab.PandoraCreativeTabs;
import com.iceclimber11.pandora.lib.Name;
import com.iceclimber11.pandora.lib.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class GenericBlock extends Block {

	public GenericBlock(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(PandoraCreativeTabs.tabpandora);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		blockIcon = iconRegister.registerIcon(String.format("%s:%s", References.MODID.toLowerCase(), References.PANDORA_NAME + getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}

	protected String getUnwrappedUnlocalizedName(String name) {
		
		return name.substring(name.indexOf(".") + 1);
	}
	
}
