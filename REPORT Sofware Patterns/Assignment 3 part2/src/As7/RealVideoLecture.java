package As7;

class RealVideoLecture implements VideoLecture {
    private String title;

    public RealVideoLecture(String title) {
        this.title = title;
        loadVideo();
    }

    private void loadVideo() {
        System.out.println("Loading video: " + title);
    }

    @Override
    public String getInfo() {
        return "Video Title: " + title;
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title);
    }
}
