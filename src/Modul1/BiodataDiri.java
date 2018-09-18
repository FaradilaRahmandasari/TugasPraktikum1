package Modul1;

public class BiodataDiri {

    public static void main(String[] args) {
        // membuat variabel
        String nama, nis2, alamat, bulan, tempat, jenis_kelamin, motto;
        double nis3;
        int nis1,tanggal,tahun;

        //mengisi variabel
        nama = "Faradila Rahmandasari";
        nis1 = 5902;
        nis2 = "/";
        nis3 = 2159.70;
        tempat = "Malang";
        tanggal = 19;
        bulan = " Januari ";
        tahun = 2003;
        jenis_kelamin = "Perempuan";
        alamat = "Jl.Tangkilisan A9 Lanud Abd. Saleh, Pakis - Malang";
        motto = "Kemauan untuk berhasil harus lebih besar dari ketakutan akan kegagalan nanti";

        // mencetak ke layar isi variabel|
        System.out.println("");
        System.out.println("Nama             : " + nama);
        System.out.println("NIS              : " + nis1 + nis2 + nis3);
        System.out.println("Tempat lahir     : " + tempat);
        System.out.println("Tanggal lahir    : " + tanggal + bulan + tahun);
        System.out.println("Jenis Kelamin    : " + jenis_kelamin);
        System.out.println("Alamat di Malang : " + alamat);
        System.out.println("Motto hidup      : " + motto);
        System.out.println("");

    }

}
