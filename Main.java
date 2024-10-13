import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nSistem Manajemen Musik:");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu");
            System.out.println("3. Tampilkan Daftar Lagu");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Tambah berapa lagu? ");
                    int jumlah = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 1; i <= jumlah; i++) {
                        System.out.print("Masukkan nama lagu ke-" + i + ": ");
                        String namaLagu = scanner.nextLine();
                        System.out.print("Masukkan nama artis untuk lagu \"" + namaLagu + "\": ");
                        String namaArtis = scanner.nextLine();
                        System.out.print("Masukkan tahun rilis untuk lagu \"" + namaLagu + "\": ");
                        int tahunRilis = scanner.nextInt();
                        scanner.nextLine();
                        inventory.tambahLagu(namaLagu, namaArtis, tahunRilis);
                    }
                    System.out.println("Lagu berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.print("Hapus berapa lagu? ");
                    int jumlahHapus = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 1; i <= jumlahHapus; i++) {
                        System.out.print("Masukkan nama lagu yang ingin dihapus ke-" + i + ": ");
                        String laguHapus = scanner.nextLine();
                        inventory.hapusLagu(laguHapus);
                    }
                    System.out.println("Lagu berhasil dihapus (jika ditemukan).");
                    break;

                case 3:
                    System.out.println("Tampilkan lagu berdasarkan:");
                    System.out.println("A. Tahun rilis");
                    System.out.println("B. Artis/Penyanyi");
                    System.out.println("C. Tampilkan Semua lagu");
                    System.out.print("Masukkan pilihan (A/B/C): ");
                    String subPilihan = scanner.nextLine().toUpperCase();

                    switch (subPilihan) {
                        case "A":
                            System.out.print("Masukkan tahun rilis: ");
                            int tahun = scanner.nextInt();
                            scanner.nextLine();
                            inventory.tampilkanLaguBerdasarkanTahun(tahun);
                            break;

                        case "B":
                            System.out.print("Masukkan nama artis: ");
                            String artis = scanner.nextLine();
                            inventory.tampilkanLaguBerdasarkanArtis(artis);
                            break;

                        case "C":
                            inventory.tampilkanLagu();
                            break;

                        default:
                            System.out.println("Pilihan tidak valid.");
                    }
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
