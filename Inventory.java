import java.util.HashMap;
import java.util.Map;

public class Inventory implements Storable {
    private Map<String, Song> laguMap;
    private int totalLagu;

    public Inventory() {
        laguMap = new HashMap<>();
        totalLagu = 0;
    }

    @Override
    public void tambahLagu(String lagu, String artis) {
        if (!laguMap.containsKey(lagu)) {
            laguMap.put(lagu, new Song(lagu, artis));
            totalLagu++;
        } else {
            System.out.println("Lagu sudah ada di koleksi.");
        }
    }

    @Override
    public void hapusLagu(String lagu) {
        if (laguMap.containsKey(lagu)) {
            laguMap.remove(lagu);
            totalLagu--;
        } else {
            System.out.println("Lagu tidak ditemukan.");
        }
    }

    @Override
    public void tampilkanLagu() {
        if (laguMap.isEmpty()) {
            System.out.println("Tidak ada lagu dalam koleksi.");
        } else {
            System.out.println("Daftar Lagu:");
            for (Song song : laguMap.values()) {
                System.out.println("Lagu: " + song.getNama() + ", Artis: " + song.getArtis());
            }
            System.out.println("Total Lagu: " + totalLagu);
        }
    }
}
