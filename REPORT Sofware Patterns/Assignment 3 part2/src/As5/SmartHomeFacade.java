package As5;

class SmartHomeFacade {
    private Lights lights;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade() {
        lights = new Lights();
        thermostat = new Thermostat();
        securitySystem = new SecuritySystem();
        entertainmentSystem = new EntertainmentSystem();
    }

    public void leaveHome() {
        lights.turnOff();
        securitySystem.activate();
        thermostat.setTemperature(18);
        System.out.println("Leaving home...");
    }

    public void arriveHome() {
        lights.turnOn();
        securitySystem.deactivate();
        thermostat.setTemperature(22);
        System.out.println("Arriving home...");
    }

    public void nightMode() {
        lights.turnOff();
        securitySystem.activate();
        System.out.println("Night mode activated");
    }

    public void movieMode() {
        lights.turnOff();
        entertainmentSystem.turnOn();
        System.out.println("Movie mode activated");
    }
}
