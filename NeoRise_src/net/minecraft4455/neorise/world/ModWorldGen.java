package net.minecraft4455.neorise.world;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModWorldGen {

	public static void init() {
		
		GameRegistry.registerWorldGenerator(new NeoWorldGen());
		
	}
	
}
