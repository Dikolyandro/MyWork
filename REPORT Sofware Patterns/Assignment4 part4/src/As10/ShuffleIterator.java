package As10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ShuffleIterator implements Iterator<Song> {
    private List<Song> songs;
    private int position;

    public ShuffleIterator(Playlist playlist) {
        songs = new ArrayList<>(playlist.getSongs());
        Collections.shuffle(songs, new Random());
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Song next() {
        return songs.get(position++);
    }
}
