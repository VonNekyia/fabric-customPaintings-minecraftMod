package net.kong.neky.customPaintings;

import net.fabricmc.api.ModInitializer;
import net.kong.neky.customPaintings.painting.ModPaintings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class customPaintingsMod implements ModInitializer {

	public static final String MOD_ID = "custompaintings";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
/*
		try {
			PaintingsModMethods.copyFiles();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}


 */
		ModPaintings.registerPaintings();

	}
}
