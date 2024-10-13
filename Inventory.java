import java.util.HashMap;
import java.util.Map;

public class Inventory implements Storable {
    private Map<String, Playlist> playlistMap;

    public Inventory() {
        playlistMap = new HashMap<>();
    }

    @Override
    public void tambahLaguKePlaylist(String namaPlaylist, String lagu, String artis) {
        Playlist playlist = playlistMap.get(namaPlaylist);
        if (playlist == null) {
            playlist = new Playlist(namaPlaylist);
            playlistMap.put(namaPlaylist, playlist);
        }
        playlist.tambahLagu(new Song(lagu, artis));
    }

    @Override
    public void hapusLaguDariPlaylist(String namaPlaylist, int indexLagu) {
        Playlist playlist = playlistMap.get(namaPlaylist);
        if (playlist != null) {
            playlist.hapusLagu(indexLagu);
        } else {
            System.out.println("Playlist tidak ditemukan.");
        }
    }

    @Override
    public void tampilkanPlaylist(String namaPlaylist) {
        Playlist playlist = playlistMap.get(namaPlaylist);
        if (playlist != null) {
            playlist.tampilkanLagu();
        } else {
            System.out.println("Playlist tidak ditemukan.");
        }
    }

    public int tampilkanSemuaPlaylist() {
        if (playlistMap.isEmpty()) {
            return 0;  // Indikasi tidak ada playlist
        } else {
            for (String namaPlaylist : playlistMap.keySet()) {
                System.out.println(namaPlaylist);
            }
            return 1;  // Indikasi ada playlist
        }
    }

    public void ubahUrutanLagu(String namaPlaylist, int dari, int ke) {
        Playlist playlist = playlistMap.get(namaPlaylist);
        if (playlist != null) {
            playlist.ubahUrutan(dari, ke);
        } else {
            System.out.println("Playlist tidak ditemukan.");
        }
    }
}
