package org.proteus1121.structure.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Изображение загружается и отображается
        image1.display();
        System.out.println();

        // Изображение загружается только при первом запросе
        image1.display();
        System.out.println();

        // Второе изображение загружается и отображается
        image2.display();
    }
}