public interface Storable {
    void tambahLaguKePlaylist(String namaPlaylist, String lagu, String artis);
    void hapusLaguDariPlaylist(String namaPlaylist, int indexLagu);
    void tampilkanPlaylist(String namaPlaylist);
}
