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
            System.out.println("4. Edit Urutan Lagu di Playlist");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  // Clear the buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama playlist: ");
                    String namaPlaylist = scanner.nextLine();
                    System.out.print("Tambah berapa lagu? ");
                    int jumlah = scanner.nextInt();
                    scanner.nextLine();  // Clear the buffer

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
                    System.out.println("Daftar Playlist:");
                    if (inventory.tampilkanSemuaPlaylist() == 0) {
                        System.out.println("Tidak ada playlist yang tersedia, kembali ke menu utama.");
                        break;
                    }
                    System.out.print("Masukkan nama playlist yang ingin diedit: ");
                    namaPlaylist = scanner.nextLine();
                    inventory.tampilkanPlaylist(namaPlaylist);

                    System.out.print("Masukkan nomor lagu yang ingin dihapus: ");
                    int noLaguHapus = scanner.nextInt();
                    scanner.nextLine();  // Clear the buffer
                    inventory.hapusLaguDariPlaylist(namaPlaylist, noLaguHapus - 1);
                    System.out.println("Lagu berhasil dihapus (jika ditemukan).");
                    break;

                case 3:
                    System.out.println("Daftar Playlist:");
                    if (inventory.tampilkanSemuaPlaylist() == 0) {
                        System.out.println("Tidak ada playlist yang tersedia, kembali ke menu utama.");
                        break;
                    }
                    System.out.print("Masukkan nama playlist yang ingin ditampilkan: ");
                    namaPlaylist = scanner.nextLine();
                    inventory.tampilkanPlaylist(namaPlaylist);
                    break;

                case 4:
                    System.out.println("Daftar Playlist:");
                    if (inventory.tampilkanSemuaPlaylist() == 0) {
                        System.out.println("Tidak ada playlist yang tersedia, kembali ke menu utama.");
                        break;
                    }
                    System.out.print("Masukkan nama playlist yang ingin diedit: ");
                    namaPlaylist = scanner.nextLine();
                    inventory.tampilkanPlaylist(namaPlaylist);

                    System.out.print("Masukkan nomor lagu yang ingin dipindah: ");
                    int dari = scanner.nextInt();
                    System.out.print("Masukkan nomor posisi baru: ");
                    int ke = scanner.nextInt();
                    scanner.nextLine();  // Clear the buffer
                    inventory.ubahUrutanLagu(namaPlaylist, dari - 1, ke - 1);
                    System.out.println("Urutan lagu berhasil diubah.");
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
