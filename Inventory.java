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
    public void hapusLaguDariPlaylist(String namaPlaylist, String lagu) {
        Playlist playlist = playlistMap.get(namaPlaylist);
        if (playlist != null) {
            playlist.hapusLagu(lagu);
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
}
