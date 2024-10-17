package As7;

import java.util.ArrayList;
import java.util.List;

class OnlineCourse {
    private List<VideoLecture> videoLectures;

    public OnlineCourse() {
        videoLectures = new ArrayList<>();
    }

    public void addVideoLecture(VideoLecture videoLecture) {
        videoLectures.add(videoLecture);
    }

    public void playLecture(int index) {
        if (index >= 0 && index < videoLectures.size()) {
            videoLectures.get(index).play();
        } else {
            System.out.println("Invalid lecture index.");
        }
    }

    public void showLectureInfo() {
        for (VideoLecture lecture : videoLectures) {
            System.out.println(lecture.getInfo());
        }
    }
}
