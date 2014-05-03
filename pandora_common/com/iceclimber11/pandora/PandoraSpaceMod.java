package com.iceclimber11.pandora;

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
         
    }	
    @EventHandler //Initiation Stuffs
    public void Init(FMLInitializationEvent event){
    	
    }
    @EventHandler //Post initiation Stuffs
    public void postInit(FMLPostInitializationEvent event) {
           
    }
    
}
