package Booking;

public class TicketBooking {

    private String cinemaName;
    private String movieTitle;
    private String seatNumber;
    private String snackCombo;

    private TicketBooking() {}

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getSnackCombo() {
        return snackCombo;
    }
    public String getCinemaName() {
        return cinemaName;
    }

    public static class TicketBookingBuilder {
        private TicketBooking ticketBooking;

        public TicketBookingBuilder() {
            ticketBooking = new TicketBooking();
        }

        public TicketBookingBuilder setMovieTitle(String movieTitle) {
            ticketBooking.movieTitle = movieTitle;
            return this;
        }

        public TicketBookingBuilder setSeatNumber(String seatNumber) {
            ticketBooking.seatNumber = seatNumber;
            return this;
        }

        public TicketBookingBuilder setSnackCombo(String snackCombo) {
            ticketBooking.snackCombo = snackCombo;
            return this;
        }
        public TicketBookingBuilder setCinemaName(String cinemaName) {
            ticketBooking.cinemaName = cinemaName;
            return this;
        }

        public TicketBooking build() {
            return ticketBooking;
        }
    }
}

class Main {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking.TicketBookingBuilder()
                .setMovieTitle("Dumb and Dumber")
                .setSeatNumber("A10")
                .setSnackCombo("Bahandi Double Chicken Combo")
                .setCinemaName("Kinopark Saryarka")
                .build();

        System.out.println("Booking Details:");
        System.out.println("Movie Title: " + booking.getMovieTitle());
        System.out.println("Seat Number: " + booking.getSeatNumber());
        System.out.println("Snack Combo: " + booking.getSnackCombo());
        System.out.println("Cinema Name: " + booking.getCinemaName());
    }
}
