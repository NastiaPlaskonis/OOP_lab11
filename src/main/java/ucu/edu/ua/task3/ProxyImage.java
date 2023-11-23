package ucu.edu.ua.task3;

import java.util.HashMap;
import java.util.Map;

public class ProxyImage implements MyImage {

    private static Map<String, RealImage> realImageCache = new HashMap<>();

    private String jpegFile;

    public ProxyImage(String jpegFile) {
        this.jpegFile = jpegFile;
    }

    @Override
    public void display() {
        RealImage realImage = getRealImage();

        if (realImage != null) {
            realImage.display();
        }
    }

    private RealImage getRealImage() {
        RealImage realImage = realImageCache.get(jpegFile);

        if (realImage == null) {
            realImage = new RealImage(jpegFile);
            realImageCache.put(jpegFile, realImage);
        }

        return realImage;
    }

    public static void main(String[] args) {
        MyImage firstImage = new ProxyImage("file.jpeg");
        firstImage.display();

        MyImage secondImage = new ProxyImage("file.jpeg");
        secondImage.display();
    }
}

