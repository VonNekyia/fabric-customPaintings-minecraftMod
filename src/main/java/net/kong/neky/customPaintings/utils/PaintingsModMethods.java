package net.kong.neky.customPaintings.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class PaintingsModMethods {

    public static void copyFiles() throws IOException {
        String src = "src/main/java/net/kong/neky/customPaintings/testPaintings";
        String dst = "src/main/resources/assets/customPaintings/textures/painting";
        ImageType[] images = getImageFromPath(src);
        int x = 0;

        for (ImageType img : images) {
            ImageIO.write(img.bufferedImage ,img.name,new File(dst));
            x++;
        }
    }

    public static ImageType[] getImageFromPath(String path) throws IOException {
        File directory = new File(path);
        String[] directoryList = directory.list();
        int length = directoryList.length;
        int count = 0;
        BufferedImage[] images = new BufferedImage[length];
        ImageType[] re = new ImageType[length];

        for (File file : directory.listFiles()) {
            re[count] = new ImageType(ImageIO.read(file),path,file.getName(),file.getName(),ImageIO.read(file).getWidth(),ImageIO.read(file).getHeight());
            count++;
        }

        return re;
    }

    public static BufferedImage scale(BufferedImage bufferedImage, int width, int height){
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        int x, y;
        int ww = bufferedImage.getWidth();
        int hh = bufferedImage.getHeight();
        int[] ys = new int[height];
        for (y = 0; y < height; y++)
            ys[y] = y * hh / height;
        for (x = 0; x < width; x++) {
            int newX = x * ww / width;
            for (y = 0; y < height; y++) {
                int col = bufferedImage.getRGB(newX, ys[y]);
                img.setRGB(x, y, col);
            }
        }
        return img;
    }


}
