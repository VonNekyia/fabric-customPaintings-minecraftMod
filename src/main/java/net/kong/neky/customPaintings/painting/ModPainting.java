package net.kong.neky.customPaintings.painting;

import net.kong.neky.customPaintings.customPaintingsMod;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPainting {
    public static final PaintingMotive TEST = registerPainting("test", new PaintingMotive(16, 16));

    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive) {
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(customPaintingsMod.MOD_ID, name), paintingMotive);
    }



    public static void registerPaintings() {
        customPaintingsMod.LOGGER.info("Registering Paintings for " + customPaintingsMod.MOD_ID);

    }
}
