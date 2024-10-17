package As7;

public class LearningPlatformApp {
    public static void main(String[] args) {
        OnlineCourse mobilographyCourse = new OnlineCourse();

        mobilographyCourse.addVideoLecture(new ProxyVideoLecture("Introduction to Mobilography"));
        mobilographyCourse.addVideoLecture(new ProxyVideoLecture("Camera Techniques for Mobile Photography"));
        mobilographyCourse.addVideoLecture(new ProxyVideoLecture("Post-Processing Mobile Photos"));

        System.out.println("Available Lectures:");
        mobilographyCourse.showLectureInfo();

        mobilographyCourse.playLecture(0);

        mobilographyCourse.playLecture(1);

        mobilographyCourse.playLecture(0);

        mobilographyCourse.playLecture(2);
    }
}
