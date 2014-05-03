package com.iceclimber11.pandora.core.handler;

import java.io.File;
import java.util.logging.Level;

import com.iceclimber11.pandora.lib.Refercences;

import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.common.Configuration;

public class ConfigurationHandeler {

	static Configuration config = new Configuration();
	public static void init(File file){
		config = new Configuration(file);
		
		try{
			config.load();
		}catch(Exception e){
			FMLLog.log(Level.SEVERE, e, Refercences.MODID + " has trobble loading the config");
		}
		finally{
			config.save();
		}
	}
}
