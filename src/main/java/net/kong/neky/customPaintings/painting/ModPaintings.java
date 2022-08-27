package net.kong.neky.customPaintings.painting;

import net.kong.neky.customPaintings.customPaintingsMod;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {

    static int block = 16;
    String src = "src/main/java/net/kong/neky/customPaintings/testPaintings";
    //ImageType[] picture = PaintingsModMethods.getImageFromPath(src);
    //PaintingMotive[] motives = new PaintingMotive[picture.length];
    int count = 0;


    public static final PaintingMotive AZADITOWER = registerPainting("azadi_tower", new PaintingMotive(block * 3, block * 2));
    public static final PaintingMotive KUALALUMPER = registerPainting("kuala_lumpur", new PaintingMotive(block * 3, block * 2));
    public static final PaintingMotive OBSERVATIONDECK = registerPainting("observation_deck", new PaintingMotive(block * 3, block * 2));
    public static final PaintingMotive TOYPIKACHU = registerPainting("toy_pikachu", new PaintingMotive(block * 3, block * 2));
    /*
    public ModPainting() throws IOException {
        int block = 16;
        int block0 = 16;
        for (ImageType img : picture) {
            motives[count] = registerPainting(img.name, new PaintingMotive(block, block0));
            count++;
        }

    }
    */


    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive) {
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(customPaintingsMod.MOD_ID, name), paintingMotive);
    }



    public static void registerPaintings() {
        customPaintingsMod.LOGGER.info("Registering Paintings for " + customPaintingsMod.MOD_ID);

    }
}
