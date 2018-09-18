package Modul1;

import java.io.*;

class Suhu {

    public static void main(String[] args) throws Exception {
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Faradila Rahmandasari");
        System.out.println("X RPL 6 / 22");
        System.out.println(" ");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // DEKLARASI VARIABLE
        double celcius, hasilfahrenheit, hasilkelvin, hasilreamur;

        // PENGINPUTAN SUHU OLEH USER
        System.out.print("Masukan Suhu Dalam Celcius  : ");
        celcius = Integer.parseInt(input.readLine());
        System.out.println("");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.println("3. Reamur");
        System.out.print("Masukan Pilihan :");
        int pilih = Integer.parseInt(input.readLine());
        System.out.println("");

        // KETERANGAN PERINTAH DAN OUTPUT HASIL
        switch (pilih) {
            case 1:
                hasilfahrenheit = (celcius * 9 / 5) + 32;
                System.out.println(celcius + " Celcius = " + hasilfahrenheit + " Fahrenheit");
                break;
            case 2:
                hasilkelvin = celcius + 273.15;
                System.out.println(celcius + " Celcius = " + hasilkelvin + " Kelvin");
                break;
            case 3:
                hasilreamur = celcius * 4 / 5;
                System.out.println(celcius + " Celcius = " + hasilreamur + " Reamur");
                break;
            default:
                System.out.println("Pilihan yg anda masukan salah");
                break;
        }
    }
}
