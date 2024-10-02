public class CinemaConfig {
    private static CinemaConfig instance;

    private CinemaConfig() {
        this.cinemaName = "Kinopark 8 IMAX Saryarka";
        this.numScreens = 9;
        this.operatingHours = "10:00 - 21:00";
        this.seatsNumber = 200;
    }
    public static CinemaConfig getInstance() {
        if (instance == null) {
            synchronized (CinemaConfig.class) {
                if (instance == null) {
                    instance = new CinemaConfig();
                }
            }
        }
        return instance;
    }

    private String cinemaName;
    private int numScreens;
    private String operatingHours;
    private int seatsNumber;


    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public int getNumScreens() {
        return numScreens;
    }

    public void setNumScreens(int numScreens) {
        this.numScreens = numScreens;
    }

    public String getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }
    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }
    public static void main(String[] args) {
        CinemaConfig config = CinemaConfig.getInstance();
        System.out.println("Name: " + config.getCinemaName());
        System.out.println("Screens: " + config.getNumScreens());
        System.out.println("Working hours: " + config.getOperatingHours());
        System.out.println("Number of seats: " + config.getSeatsNumber());

        config.setCinemaName("Eurasia Cinema 7");
        config.setNumScreens(8);
        config.setOperatingHours("9:00 - 22:00");
        config.setSeatsNumber(400);

        System.out.println("Updated Name: " + config.getCinemaName());
        System.out.println("Updated Screens: " + config.getNumScreens());
        System.out.println("Updated Working Hours: " + config.getOperatingHours());
        System.out.println("Updated Number of Seats: " + config.getSeatsNumber());
    }
}
