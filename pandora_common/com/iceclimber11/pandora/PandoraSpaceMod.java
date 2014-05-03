package com.iceclimber11.pandora;

import java.io.File;

import com.iceclimber11.pandora.Blocks.PandoraBlockCreator;
import com.iceclimber11.pandora.core.creativetab.PandoraCreativeTabs;
import com.iceclimber11.pandora.core.handler.ConfigurationHandeler;
import com.iceclimber11.pandora.core.handler.LocalizationHandler;
import com.iceclimber11.pandora.core.proxy.CommonProxy;
import com.iceclimber11.pandora.lib.References;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;



@Mod(modid=References.MODID, name=References.MODNAME, version=References.MODID)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class PandoraSpaceMod {


	@SidedProxy//Proxy
	(clientSide = References.ClientProxy_Location, serverSide = References.CommonProxy_Location)
		public static CommonProxy Proxy;
	
    @EventHandler //Pre Initiation Stuffs
    public void preInit(FMLPreInitializationEvent event) {
    	
         /*				Config				*/
    	ConfigurationHandeler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + References.MODID + ".cfg"));
    	/*				Language			*/
    	LocalizationHandler.init();
    	/*				Creative Tab		*/
    	PandoraCreativeTabs.init();
    	/*				Blocks				*/
    	PandoraBlockCreator.init();
    }	
    @EventHandler //Initiation Stuffs
    public void Init(FMLInitializationEvent event){

    }
    @EventHandler //Post initiation Stuffs
    public void postInit(FMLPostInitializationEvent event) {
           
    }
    
}
