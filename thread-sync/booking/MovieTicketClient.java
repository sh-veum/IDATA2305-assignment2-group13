package booking;

public class MovieTicketClient extends Thread {
  private String customerName;
  private int numberOfSeats;
  private MovieTicketServer movieTicketServer;

  public MovieTicketClient(MovieTicketServer movieTicketServer, String customerName, int numberOfSeats) {
    this.movieTicketServer = movieTicketServer;
    this.customerName = customerName;
    this.numberOfSeats = numberOfSeats;
  }

  public void run() {
    movieTicketServer.bookTicket(customerName, numberOfSeats);
  }
}