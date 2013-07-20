package net.minecraft4455.neorise;

import java.util.logging.Logger;

import net.minecraft4455.neorise.config.NeoConfig;
import net.minecraft4455.neorise.core.blocks.ModBlocks;
import net.minecraft4455.neorise.core.items.ModItems;
import net.minecraft4455.neorise.info.lib.Referance;
import net.minecraft4455.neorise.proxys.CommonProxy;
import net.minecraft4455.neorise.world.ModWorldGen;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(name = Referance.NAME, modid = Referance.MODID, version = Referance.VERSION)
@NetworkMod(clientSideRequired = Referance.CLIENT_SIDE_REQUIRED, serverSideRequired = Referance.SERVER_SIDE_REQUIRED)

public class NeoRise {

	@Instance(Referance.MODID)
	public static NeoRise instancee;
	
	@SidedProxy(clientSide = Referance.CLIENTPROXY, serverSide = Referance.COMMONPROXY)
	public static CommonProxy proxy;
	
	public static Logger logger;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		logger = Logger.getLogger(Referance.MODID);
		logger.setParent(FMLLog.getLogger());
		
		final Configuration config = new Configuration(
		        event.getSuggestedConfigurationFile());
		NeoConfig.load(config);
		
		ModBlocks.init();
		ModItems.init();
		ModWorldGen.init();
		
	}
	
}
