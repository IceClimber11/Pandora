package com.iceclimber11.pandora.Blocks;

import com.iceclimber11.pandora.lib.Name;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PandoraBlockCreator {
	//Declaring Block
	public static Block Pandoradirt;
	
	public static void init(){
		//Declaring Block
		Pandoradirt = new GenericBlock(3000,Material.ground).setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName(Name.PandoraDirt_Name);
		
		
		
		
		
		//Registering Block
		GameRegistry.registerBlock(Pandoradirt, Name.PandoraDirt_Name);
		
	}
}

