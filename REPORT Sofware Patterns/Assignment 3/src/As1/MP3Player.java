package As1;
public class MP3Player implements AudioPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else {
            System.out.println("Invalid media type. MP3Player supports only mp3.");
        }
    }
}
