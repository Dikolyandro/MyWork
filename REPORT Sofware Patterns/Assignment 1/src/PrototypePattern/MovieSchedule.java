package PrototypePattern;

public interface MovieSchedule extends Cloneable {
    MovieSchedule clone();
    void setMovie(String movie);
    void setTime(String time);
}

