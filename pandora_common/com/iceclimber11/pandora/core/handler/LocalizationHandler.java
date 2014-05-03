package com.iceclimber11.pandora.core.handler;

import com.iceclimber11.pandora.core.helper.LocalizationHelper;
import com.iceclimber11.pandora.lib.Localizations;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHandler {

	
	public static void init(){
		for(String LocalizationFile : Localizations.localFiles){
			
			LanguageRegistry.instance().loadLocalization(LocalizationFile, LocalizationHelper.getLocalFromFileName(LocalizationFile), LocalizationHelper.isXMLFile(LocalizationFile));
			
		}
	}
}
