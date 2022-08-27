package net.kong.neky.customPaintings.painting;

import net.kong.neky.customPaintings.customPaintingsMod;
import net.kong.neky.customPaintings.utils.ImageType;
import net.kong.neky.customPaintings.utils.PaintingsModMethods;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.io.IOException;

public class ModPaintings {

    static int block = 16;
    static String src = "src/main/java/net/kong/neky/customPaintings/testPaintings";
    static ImageType[] img = PaintingsModMethods.getImagesFromPath(src);





    public ModPaintings(){

    }

    private static void PaintingMotive() {
        for (ImageType imgt : img) {
            registerPainting(imgt.name, new PaintingMotive(block * 3, block * 2));

        }
    }


/*
    public static void PaintingMotive() {

        registerPainting("azadi_tower", new PaintingMotive(block * 3, block * 2));
        registerPainting("kuala_lumpur", new PaintingMotive(block * 3, block * 2));
        registerPainting("observation_deck", new PaintingMotive(block * 3, block * 2));
        registerPainting("toy_pikachu", new PaintingMotive(block * 3, block * 2));

    }
 */

    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive) {
       return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(customPaintingsMod.MOD_ID, name), paintingMotive);

   }

    public static void registerPaintings() {
        customPaintingsMod.LOGGER.info("Registering Paintings for " + customPaintingsMod.MOD_ID);

    }
}
