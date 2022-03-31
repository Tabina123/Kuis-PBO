package com.company;
import java.util.Scanner;

//Class dan Objek
class Pembuka{
    String judul;
    Pembuka(String judul){
        this.judul = judul;
    }
    void tampil(){
        System.out.println(this.judul);
    }

}

//Class Dosen
class Dosen{
    int kedudukan;
    String nama;
    String NIDN;
    int usia;
    String alamat;
    String jenisKelamin;

    //Method Dosen
    void method(){
        System.out.println("Masukkan Data Diri Anda");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nama: ");
        nama = keyboard.nextLine();
        System.out.print("NIDN: ");
        NIDN = keyboard.nextLine();
        System.out.print("Alamat: ");
        alamat = keyboard.nextLine();
        System.out.print("Jenis Kelamin: ");
        jenisKelamin = keyboard.nextLine();
        System.out.print("Usia: ");
        usia = keyboard.nextInt();
        System.out.println("Halo " + nama + " Selamat Datang di Perpustakaan Universitas Lampung");

    }
    void tampil(){
        System.out.println("\n\nNama: " + nama);
        System.out.println("NIDN: " + NIDN);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Usia: " + usia);

    }

}

//Class Mahasiswa
class Mahasiswa{
    int kedudukan;
    String nama;
    String NPM;
    String prodi;
    String alamat;
    String jurusan;
    int usia;
    String jenisKelamin;

    //Method Mahasiswa
    void method2(){
        System.out.println("Masukkan Data Diri:");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nama: ");
        nama = keyboard.nextLine();
        System.out.print("NPM: ");
        NPM = keyboard.nextLine();
        System.out.print("Alamat: ");
        alamat = keyboard.nextLine();
        System.out.print("Jurusan: ");
        jurusan = keyboard.nextLine();
        System.out.print("Prodi: ");
        prodi = keyboard.nextLine();
        System.out.print("Jenis Kelamin: ");
        jenisKelamin = keyboard.nextLine();
        System.out.print("Usia: ");
        usia = keyboard.nextInt();
        System.out.println("\nHalo " + nama + " Selamat Datang di Perpustakaan Universitas Lampung\n\n");

    }
    void tampil(){
        System.out.println("Nama: " + nama);
        System.out.println("NIDN: " + NPM);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Prodi: " + prodi);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Usia: " + usia);

    }

}

//Class Buku
class BukuNovel{
    String masukan;

    void method3(){
        System.out.println("\n\nKumpulan Buku Novel");
        System.out.println("1. Kambing Jantan, 2005, Raditya Dika");
        System.out.println("2. Manusia Setengah Salmon, 2011, Raditya Dika");
        System.out.println("3. Laskar Pelangi, 2005, Andrea Hirata");
        System.out.println("4. Sang Pemimpi, 2006, Andrea Hirata");
        System.out.println("5. Bumi Manusia, 1980, Pramoedya Ananta Toer");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Judul Buku: ");
        masukan = keyboard.nextLine();
        System.out.println("Buku yang dipinjam: ");
        System.out.println(masukan);
    }
}

class BukuSejarah{
    String masukan;

    void method4(){
        System.out.println("\n\nKumpulan Buku Sejarah");
        System.out.println("1. Sejarah Dunia yang Disembunyikan, 2007, Jonathan Black");
        System.out.println("2. Sejarah Peradaban Dunia Kuno Empat Benua, 2017, Anisa Septianingrum");
        System.out.println("3. Laut Bercerita, 2017, Leila Salikha Chudori");
        System.out.println("4. Max Havelaar, 1860, Eduard Douwes Dekker");
        System.out.println("5. Catatan Seorang Demonstran, 1983, Soe Hok Gie");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Judul Buku: ");
        masukan = keyboard.nextLine();
        System.out.println("Buku yang dipinjam: ");
        System.out.println(masukan);

    }

}

class BukuHorror{
    String masukan;

    void method5(){
        System.out.println("\n\nKumpulan Buku Horror");
        System.out.println("1. KKN Di Desa Penari, 2019, Simpleman");
        System.out.println("2. Wingit, 2020, Sara Wijayanto");
        System.out.println("3. Misteri Patung Garam, 2015, Ruwi Meita");
        System.out.println("4. Keluarga Tak Kasat Mata, 2016, Bonaventura Genta");
        System.out.println("5. Dracula, 1897, Bram Stoker");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Judul Buku: ");
        masukan = keyboard.nextLine();
        System.out.println("Buku yang dipinjam: ");
        System.out.println(masukan);

    }

}

class Pemilihan {
    int pilihan;

    void method() {
        System.out.println("\n\nPilihan Buku yang Tersedia");
        System.out.println("1. Buku Novel");
        System.out.println("2. Buku Sejarah");
        System.out.println("3. Buku Horror");
        System.out.print("Masukan Nomor Jenis Buku yang Ingin di Pinjam: ");
        Scanner keyboard = new Scanner(System.in);
        pilihan = keyboard.nextInt();
        switch (pilihan) {
            case 1:
                BukuNovel cetak1 = new BukuNovel();
                cetak1.method3();
                break;

            case 2:
                BukuSejarah cetak2 = new BukuSejarah();
                cetak2.method4();
                break;
            case 3:
                BukuHorror cetak3 = new BukuHorror();
                cetak3.method5();
                break;
        }

    }
}

class pengembalian{
    String PengembalianBuku;

    void method(){
        System.out.print("\nMasukan Tanggal Pengembalian: ");
        Scanner keyboard = new Scanner(System.in);
        PengembalianBuku = keyboard.nextLine();
        System.out.println("\nTanggal Pengembalian " + PengembalianBuku);
    }
}

class penutup{
    String salam;

    penutup(String salam){

        this.salam = salam;
    }
    void method(){

        System.out.println(this.salam);
    }
}

public class Main {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();
        Mahasiswa main = new Mahasiswa();
        pengembalian cetak = new pengembalian();
        Pembuka print = new Pembuka("APLIKASI PEMINJAMAN BUKU PERPUSTAKAAN UNILA");
        penutup salam = new penutup("Terimakasih Telah Berkunjung, Sampai Jumpa Kembali");
        Pemilihan pilih = new Pemilihan();
        Scanner keyboard = new Scanner(System.in);

        //Ekseskusi Program
        print.tampil();
        System.out.println("Pilih Jabatan ");
        System.out.println("1. Dosen");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan : ");
        int kedudukan;
        int jumlah;
        String pengembalian;
        kedudukan = keyboard.nextInt();
        switch (kedudukan) {
            case 1:
                dosen1.method();
                System.out.print("Masukkan Jumlah Buku yang Ingin di Pinjam: ");
                jumlah = keyboard.nextInt();
                for (int i=1; i<=jumlah; i++) {
                    pilih.method();
                }
                cetak.method();
                dosen1.tampil();
                System.out.println("Jumlah Buku yang dipinjam: " + jumlah + " Buku");
                salam.method();
                break;

            case 2:
                main.method2();
                System.out.print("Masukkan Jumlah Buku yang Ingin di Pinjam: ");
                jumlah = keyboard.nextInt();
                for (int i=1; i<=jumlah; i++) {
                    pilih.method();
                }
                cetak.method();
                main.tampil();
                System.out.println("Jumlah Buku yang dipinjam: " + jumlah + " Buku");
                salam.method();
                break;

            default:
                System.out.println("Input yang anda Masukkan Salah");
        }
    }
}