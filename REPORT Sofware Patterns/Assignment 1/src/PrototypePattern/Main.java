package PrototypePattern;

class Main {
    public static void main(String[] args) {
        StandardSchedule originalSchedule = new StandardSchedule("Interstellar", "20:00");

        StandardSchedule clonedSchedule1 = (StandardSchedule) originalSchedule.clone();
        clonedSchedule1.setTime("10:00");

        StandardSchedule clonedSchedule2 = (StandardSchedule) originalSchedule.clone();
        clonedSchedule2.setMovie("Once Upon a Time in Hollywood");

        System.out.println("Default Schedule: " + originalSchedule);
        System.out.println("Cloned Schedule 1: " + clonedSchedule1);
        System.out.println("Cloned Schedule 2: " + clonedSchedule2);
    }
}
