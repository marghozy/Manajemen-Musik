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

    public void hapusLagu(int indexLagu) {
        if (indexLagu >= 0 && indexLagu < laguList.size()) {
            laguList.remove(indexLagu);
        } else {
            System.out.println("Nomor lagu tidak valid.");
        }
    }

    public void tampilkanLagu() {
        if (laguList.isEmpty()) {
            System.out.println("Playlist kosong.");
        } else {
            System.out.println("Daftar Lagu dalam Playlist '" + namaPlaylist + "':");
            int index = 1;
            for (Song song : laguList) {
                System.out.println(index + ". Lagu: " + song.getNama() + ", Artis: " + song.getArtis());
                index++;
            }
        }
    }

    public void ubahUrutan(int dari, int ke) {
        if (dari >= 0 && dari < laguList.size() && ke >= 0 && ke < laguList.size()) {
            Song lagu = laguList.remove(dari);
            laguList.add(ke, lagu);
        } else {
            System.out.println("Posisi tidak valid.");
        }
    }

    public String getNamaPlaylist() {
        return namaPlaylist;
    }
}
