package Modul1;

import java.io.*;

public class LuasPermukaanBola {

    public static void main(String[] args) {
        
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Faradila Rahmandasari");
        System.out.println("X RPL 6 / 22");
        System.out.println(" ");
        
        DataInputStream show = new DataInputStream(System.in);
        try {
            final float phi = 3.14f;
            String rad;
            float rads, luasPermukaan;
            System.out.print("Masukkan r (Jari-jari) :");
            rad = show.readLine();
            rads = Float.parseFloat(rad);

            luasPermukaan = 4 * phi * rads * rads;

            System.out.println("Hasil");
            System.out.println("Luas Permukaan:" + luasPermukaan);
        } catch (IOException ioe) {
            System.out.println("Error");
        }
    }
}
