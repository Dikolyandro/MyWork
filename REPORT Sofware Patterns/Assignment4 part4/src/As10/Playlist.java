package As10;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public SequentialIterator getSequentialIterator() {
        return new SequentialIterator(this);
    }

    public Iterator<Song> getShuffleIterator() {
        return new ShuffleIterator(this);
    }

    public Iterator<Song> getGenreFilterIterator(String genre) {
        return new GenreFilterIterator(this, genre);
    }
}
