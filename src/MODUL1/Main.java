package MODUL1;

import java.util.Scanner;

// Enum untuk jenis barang tipe data khusus untuk konstatan yg telah di tentukan
enum JenisBarang {
    BUKU,
    ALAT_TULIS,
    ALAT_LUKIS
}

// Class Barang dengan dua generics yang berbeda
class Barang<T, U> {
    private T nama;
    private U harga;
    private JenisBarang jenis;

    // Konstruktor Barang dengan dua generics dan satu enum
    public Barang(T nama, U harga, JenisBarang jenis) {
        this.nama = nama;
        this.harga = harga;
        this.jenis = jenis;
    }

    // Method non static
    public T getNama() {
        return nama;
    }


    public U getHarga() {
        return harga;
    }


    public JenisBarang getJenis() {
        return jenis;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Masukkan nama barang: ");
        String namaBarang = scanner.nextLine();


        System.out.print("Masukkan harga barang: ");
        double hargaBarang = scanner.nextDouble();


        System.out.println("Pilih jenis barang: ");
        for (JenisBarang jenis : JenisBarang.values()) {
            System.out.println(jenis.ordinal() + ". " + jenis);
        }
        System.out.print("Masukkan nomor jenis barang: ");
        int pilihanJenis = scanner.nextInt();
        JenisBarang jenisBarang = JenisBarang.values()[pilihanJenis];

        // Membuat objek Barang dengan generics yang telah diinputkan
        Barang<String, Double> barang = new Barang<>(namaBarang, hargaBarang, jenisBarang);
// string itu generics T yaitu nama banrang
// double itu generics U yaitu nama harga

        System.out.println("\nInformasi Barang:");
        System.out.println("Jenis: " + barang.getJenis());
        System.out.println("Nama: " + barang.getNama());
        System.out.println("Harga: " + barang.getHarga());

    }
}
