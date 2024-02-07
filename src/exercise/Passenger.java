package exercise;

public class Passenger {

  private String name;
  private SeatClass seatClass;
  private double ticketPrice;

  public Passenger(String name, SeatClass seatClass, double ticketPrice) {
    super();
    this.name = name;
    this.seatClass = seatClass;
    this.ticketPrice = ticketPrice;
  }

  public String getName() {
    return name;
  }

  public SeatClass getSeatClass() {
    return seatClass;
  }

  public double getTicketPrice() {
    return ticketPrice;
  }

  @Override
  public String toString() {
    return "Passenger name is = " + name + ", seatClass is = " + seatClass + ", ticket price is = " + ticketPrice;
  }

}
