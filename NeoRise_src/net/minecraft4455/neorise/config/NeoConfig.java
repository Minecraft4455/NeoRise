package net.minecraft4455.neorise.config;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

import net.minecraftforge.common.Configuration;

public class NeoConfig {
	@Retention(RetentionPolicy.RUNTIME)
	private static @interface CfgBool {
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	private static @interface CfgID {
		public boolean block() default false;
	}
	
	// public static @CfgId int itemId = 12000;
	// public static @CfgId(block=true) int blockId = 350;
	// public static @CfgBool boolean booleanConfig = false;
	
	/** Booleans **/
	
	
	
	/** Block ID **/
		
	
		
	/** Item ID **/
	
	
	
	public static void load(final Configuration config) {
		try {
			config.load();
			final Field[] fields = NeoConfig.class.getFields();
			for (final Field field : fields) {
				final CfgID annotation = field.getAnnotation(CfgID.class);
				if (annotation != null) {
					int id = field.getInt(null);
					if (annotation.block()) id = config.getBlock(
					        field.getName(), id).getInt();
					else id = config.getItem(field.getName(), id).getInt();
					field.setInt(null, id);
				} else if (field.isAnnotationPresent(CfgBool.class)) {
					boolean bool = field.getBoolean(null);
					bool = config.get(Configuration.CATEGORY_GENERAL,
					        field.getName(), bool).getBoolean(bool);
					field.setBoolean(null, bool);
				}
			}
		} catch (final Exception e) {
			// failed to load configs log
		} finally {
			config.save();
		}
	}
	
}