package As1;

public class MusicPlayerApp {
    public static void main(String[] args) {
        AudioPlayer mp3Player = new MP3Player();
        mp3Player.play("mp3", "Stop Waiting.mp3");

        AudioPlayer wavPlayer = new AudioAdapter("wav");
        wavPlayer.play("wav", "L.wav");

        AudioPlayer aacPlayer = new AudioAdapter("aac");
        aacPlayer.play("aac", "Nothing's Gonna Hurt You Baby");
    }
}
