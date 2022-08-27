package net.kong.neky.customPaintings.painting;

import net.kong.neky.customPaintings.customPaintingsMod;
import net.kong.neky.customPaintings.utils.ImageType;
import net.kong.neky.customPaintings.utils.PaintingsModMethods;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.io.IOException;

public class ModPainting {

    static int block = 16;
    String src = "src/main/java/net/kong/neky/customPaintings/testPaintings";
    ImageType[] picture = PaintingsModMethods.getImageFromPath(src);
    PaintingMotive[] motives = new PaintingMotive[picture.length];



    public static final PaintingMotive AZADI_TOWER = registerPainting("azadi_tower", new PaintingMotive(block * 3, block * 2));
    public static final PaintingMotive KUALA_LUMPER = registerPainting("kuala_lumper", new PaintingMotive(block * 3, block * 2));
    public static final PaintingMotive OBSERVATION_DECK = registerPainting("observation_deck", new PaintingMotive(block * 3, block * 2));
    public static final PaintingMotive TOY_PIKACHU = registerPainting("toy_pikachu", new PaintingMotive(block * 3, block * 2));

    public ModPainting() throws IOException {

        for (PaintingMotive mot : motives) {
            mot = registerPainting();
        }

    }


    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive) {
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(customPaintingsMod.MOD_ID, name), paintingMotive);
    }



    public static void registerPaintings() {
        customPaintingsMod.LOGGER.info("Registering Paintings for " + customPaintingsMod.MOD_ID);

    }
}
