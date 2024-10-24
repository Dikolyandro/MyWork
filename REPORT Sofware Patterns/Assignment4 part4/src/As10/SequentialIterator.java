package As10;

import java.util.Iterator;

public class SequentialIterator implements Iterator<Song> {
    private Playlist playlist;
    private int position;

    public SequentialIterator(Playlist playlist) {
        this.playlist = playlist;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < playlist.getSongs().size();
    }

    @Override
    public Song next() {
        return playlist.getSongs().get(position++);
    }
}
