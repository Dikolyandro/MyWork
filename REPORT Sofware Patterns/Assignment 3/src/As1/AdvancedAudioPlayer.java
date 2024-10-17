package As1;

public class AdvancedAudioPlayer implements WAVPlayer, AACPlayer {
    @Override
    public void playWAV(String fileName) {
        System.out.println("Playing wav file: " + fileName);
    }

    @Override
    public void playAAC(String fileName) {
        System.out.println("Playing aac file: " + fileName);
    }
}

