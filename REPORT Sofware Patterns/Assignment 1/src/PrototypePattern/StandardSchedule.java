package PrototypePattern;

class StandardSchedule implements MovieSchedule {
    private String movie;
    private String time;

    public StandardSchedule(String movie, String time) {
        this.movie = movie;
        this.time = time;
    }

    @Override
    public MovieSchedule clone() {
        return new StandardSchedule(movie, time);
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Movie: " + movie + ", Time: " + time;
    }
}
