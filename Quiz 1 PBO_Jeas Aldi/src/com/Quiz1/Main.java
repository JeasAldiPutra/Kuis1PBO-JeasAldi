package com.Quiz1;

    class buku{
        String judul;
        String genre;
        int halaman;
        String penulis;

        //constructor
        buku(String buku, String genre, int halaman, String penulis){
            this.judul = buku;
            this.genre = genre;
            this.halaman = halaman;
            this.penulis = penulis;
        }

        // Method
        void tampilJudul(){
            System.out.println("Judul buku yang dipinjam: " + judul);
            System.out.println("genre buku: " + genre);
            System.out.println("jumlah halaman: " + halaman);
            System.out.println("Penulis: " + penulis);
        }
    }

    class peminjaman{
        String id;
        String namaPeminjam;
        buku judulBukuPinjam;
        String tanggalPinjam;
        String waktuPinjam;
        String tanggalKembali;
        String waktuKembali;

        //contructor
        peminjaman(String id, String namaPeminjam, buku judulBukuPinjam, String tanggalPinjam, String waktuPinjam, String tanggalKembali, String waktuKembali){
            this.id = id;
            this.namaPeminjam = namaPeminjam;
            this.judulBukuPinjam = judulBukuPinjam;
            this.tanggalPinjam = tanggalPinjam;
            this.waktuPinjam = waktuPinjam;
            this.tanggalKembali = tanggalKembali;
            this.waktuKembali = waktuKembali;
        }

        //Method
        void tampilPeminjam(){
            System.out.println("\nID Peminjam: " + id);
            System.out.println("Nama Peminjam: " + namaPeminjam + "\n");
            judulBukuPinjam.tampilJudul();
            System.out.println("\nTanggal peminjaman: " + tanggalPinjam);
            System.out.println("Waktu peminjaman: " + waktuPinjam);
            System.out.println("Tanggal pengembalian: " + tanggalKembali);
            System.out.println("Waktu pengembalian: " + waktuKembali);
            System.out.println("========================================");
        }

}
public class Main {


    public static void main(String[] args) {

        //Input Buku
        buku koalaKumal = new buku("Koala Kumal", "Komedi", 566, "Raditya Dika");
        buku cintaBrontosaurus = new buku ("Cinta Brontosaurus", "Komedi, Drama",333, "Raditya Dika");

        //Input Peminjam
        peminjaman jeasAldiPutra = new peminjaman("01", "Jeas Aldi Putra", koalaKumal, "29 Agustus 2022", "19.41", "1 September 2022", "19.41");
        peminjaman nugrahaWijaya = new peminjaman("02", "Nugraha Wijaya", cintaBrontosaurus, "30 Agustus 2022", "14.23", "2 September 2022", "14.23");

        //Menampilkan Peminjam
        jeasAldiPutra.tampilPeminjam();
        nugrahaWijaya.tampilPeminjam();
    }
}