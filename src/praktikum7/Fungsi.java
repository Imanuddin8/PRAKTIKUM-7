
package praktikum7;


   

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.time.*;

public class Fungsi {


    Scanner in = new Scanner(System.in);

    Random random = new Random();

    ArrayList<String> jenisKendaraan;
    ArrayList<Integer> listKode;
    ArrayList<LocalTime> dataTanggal;
    ArrayList<Duration> lamaParkir;

    public Fungsi() {

        LocalTime sekarang = LocalTime.now();
        LocalTime nanti = sekarang.plusHours(3);
        Duration durasi = Duration.between(sekarang,nanti);

        this.dataTanggal = new ArrayList<>();
        this.dataTanggal.add(0,sekarang);
        this.dataTanggal.add(1,nanti);

        this.lamaParkir = new ArrayList<>();
        this.lamaParkir.add(0,durasi);

        this.jenisKendaraan = new ArrayList<>();
        System.out.print("Jenis Kendaraan : ");
        this.jenisKendaraan.add(0, in.nextLine());

        this.listKode = new ArrayList<>();
        this.listKode.add(0, random.nextInt(99999));

        inputDataJenisKendaraan();
    }

    String inputDataJenisKendaraan() {
        System.out.println("Jenis Kendaraan : " + this.jenisKendaraan.get(0));
        if (this.jenisKendaraan.get(0).isBlank()) {
            System.out.println("Harap Isi Jenis Kendaraan dengan Ketentuan Jenis Kendaraan diBawah ini");
            System.out.println("1. Sepeda Motor");
            System.out.println("2. Mobil");
            System.out.println("3. Buss");
            System.out.println("Perhatikan Pemakaian Huruf Kapital");
            System.out.println("\n");
            return(this.jenisKendaraan.get(0));
        }
        inputDataTanggal();
        return null;
    }

    void inputDataTanggal() {
        System.out.println("Waktu Parkir    : " + this.dataTanggal.get(0));

        inputDataKodeParkir();

    }

    void inputDataKodeParkir() {
        System.out.println("Kode Parkir     : " + this.listKode.get(0));

        program2();

    }

    Integer program2() {
        System.out.print("Masukkan Kode   : ");
        int kode = in.nextInt();
        if (kode != this.listKode.get(0)) {
            System.out.println("Error : Tidak Menemukan Kode!!");
            System.out.println("\n");
            return kode;
        }
        System.out.println("Waktu Keluar    : " + this.dataTanggal.get(1));

        lamaParkir();

        return null;
    }

    void lamaParkir() {
        System.out.println("Lama Parkir     : " + this.lamaParkir.get(0) + " jam");

        totalBayar();
    }

    void totalBayar() {
        if (this.jenisKendaraan.get(0).equals("Sepeda Motor")) {
            int totalBayar = (int) this.lamaParkir.get(0).toHours() * 2000;
            System.out.println("Pembayaran Untuk Sepeda Motor : " + totalBayar);
        }
        if (this.jenisKendaraan.get(0).equals(("Mobil"))) {
            int totalBayar = (int) this.lamaParkir.get(0).toHours() * 3000;
            System.out.println("Pembayaran Untuk Mobil        : " + totalBayar);
        }
        if (this.jenisKendaraan.get(0).equals(("Buss"))) {
            int totalBayar = (int) this.lamaParkir.get(0).toHours() * 6000;
            System.out.println("Pembayaran Untuk Buss         : " + totalBayar);
        }
        System.out.println("Salam dari binjai");
        System.out.println("\n");
    }

}

