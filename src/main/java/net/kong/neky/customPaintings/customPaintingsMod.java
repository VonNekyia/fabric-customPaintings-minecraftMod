package net.kong.neky.customPaintings;

import net.fabricmc.api.ModInitializer;
import net.kong.neky.customPaintings.painting.ModPaintings;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class customPaintingsMod implements ModInitializer {

	public static final String MOD_ID = "custompaintings";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {

		ModPaintings.registerPaintings();
		//ModPaintings.PaintingMotive();




	}
}
