package com.iceclimber11.pandora.core.creativetab;

import com.iceclimber11.pandora.Blocks.PandoraBlockCreator;
import com.iceclimber11.pandora.lib.Name;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PandoraCreativeTabs {
	public static CreativeTabs tabpandora; 
	
	public static void init(){
		tabpandora = new CreativeTabs(Name.tabpandora){
			public ItemStack getIconItemStack() 
				{return new ItemStack(PandoraBlockCreator.Pandoradirt, 1, 0);}};
	}
	}
