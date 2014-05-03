package com.iceclimber11.pandora;

import java.io.File;

import com.iceclimber11.pandora.Blocks.PandoraBlock;
import com.iceclimber11.pandora.core.handler.ConfigurationHandeler;
import com.iceclimber11.pandora.core.proxy.CommonProxy;
import com.iceclimber11.pandora.lib.Refercences;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;



@Mod(modid=Refercences.MODID, name=Refercences.MODNAME, version=Refercences.MODID)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class PandoraSpaceMod {


	@SidedProxy//Proxy
	(clientSide = Refercences.ClientProxy_Location, serverSide = Refercences.CommonProxy_Location)
		public static CommonProxy Proxy;
	
    @EventHandler //Pre Initiation Stuffs
    public void preInit(FMLPreInitializationEvent event) {
         //Config File
    	ConfigurationHandeler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Refercences.MODID + ".cfg"));
    	
    }	
    @EventHandler //Initiation Stuffs
    public void Init(FMLInitializationEvent event){
    	PandoraBlock.init();
    }
    @EventHandler //Post initiation Stuffs
    public void postInit(FMLPostInitializationEvent event) {
           
    }
    
}
