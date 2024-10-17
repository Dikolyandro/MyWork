package As5;

public class SmartHomeApp {
    public static void main(String[] args) {
        SmartHomeFacade smartHome = new SmartHomeFacade();

        smartHome.arriveHome();

        smartHome.leaveHome();

        smartHome.nightMode();

        smartHome.movieMode();
    }
}
