package As10;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong(new Song("Song 1", "Artist A", "Pop"));
        playlist.addSong(new Song("Song 2", "Artist B", "Rock"));
        playlist.addSong(new Song("Song 3", "Artist C", "Pop"));
        playlist.addSong(new Song("Song 4", "Artist D", "Jazz"));

        System.out.println("Sequential Iterator:");
        Iterator<Song> sequentialIterator = playlist.getSequentialIterator();
        while (sequentialIterator.hasNext()) {
            Song song = sequentialIterator.next();
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }

        System.out.println("\nShuffle Iterator:");
        Iterator<Song> shuffleIterator = playlist.getShuffleIterator();
        while (shuffleIterator.hasNext()) {
            Song song = shuffleIterator.next();
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }

        System.out.println("\nGenre Filter Iterator (Pop):");
        Iterator<Song> genreIterator = playlist.getGenreFilterIterator("Pop");
        while (genreIterator.hasNext()) {
            Song song = genreIterator.next();
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }
    }
}
