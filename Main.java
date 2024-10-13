import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nSistem Playlist Musik:");
            System.out.println("1. Tambah Lagu ke Playlist");
            System.out.println("2. Hapus Lagu dari Playlist");
            System.out.println("3. Tampilkan Playlist");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama playlist: ");
                    String namaPlaylist = scanner.nextLine();
                    System.out.print("Tambah berapa lagu? ");
                    int jumlah = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 1; i <= jumlah; i++) {
                        System.out.print("Masukkan nama lagu ke-" + i + ": ");
                        String namaLagu = scanner.nextLine();
                        System.out.print("Masukkan nama artis untuk lagu \"" + namaLagu + "\": ");
                        String namaArtis = scanner.nextLine();
                        inventory.tambahLaguKePlaylist(namaPlaylist, namaLagu, namaArtis);
                    }
                    System.out.println("Lagu berhasil ditambahkan ke playlist!");
                    break;

                case 2:
                    System.out.print("Masukkan nama playlist: ");
                    namaPlaylist = scanner.nextLine();
                    System.out.print("Masukkan nama lagu yang ingin dihapus: ");
                    String laguHapus = scanner.nextLine();
                    inventory.hapusLaguDariPlaylist(namaPlaylist, laguHapus);
                    System.out.println("Lagu berhasil dihapus (jika ditemukan).");
                    break;

                case 3:
                    System.out.print("Masukkan nama playlist yang ingin ditampilkan: ");
                    namaPlaylist = scanner.nextLine();
                    inventory.tampilkanPlaylist(namaPlaylist);
                    break;

                case 4:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
