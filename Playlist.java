import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String namaPlaylist;
    private List<Song> laguList;

    public Playlist(String namaPlaylist) {
        this.namaPlaylist = namaPlaylist;
        this.laguList = new ArrayList<>();
    }

    public void tambahLagu(Song lagu) {
        laguList.add(lagu);
    }

    public void hapusLagu(String namaLagu) {
        laguList.removeIf(lagu -> lagu.getNama().equalsIgnoreCase(namaLagu));
    }

    public void tampilkanLagu() {
        if (laguList.isEmpty()) {
            System.out.println("Playlist kosong.");
        } else {
            System.out.println("Daftar Lagu dalam Playlist '" + namaPlaylist + "':");
            for (Song song : laguList) {
                System.out.println("Lagu: " + song.getNama() + ", Artis: " + song.getArtis());
            }
        }
    }

    public String getNamaPlaylist() {
        return namaPlaylist;
    }
}
