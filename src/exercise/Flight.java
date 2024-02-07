package exercise;

import java.util.HashMap;
import java.util.Map;

public class Flight {

  private Map<String, Passenger> passenger = new HashMap<>();

  public void resirveSeat(String passengerName, SeatClass seatClass) {

    double ticketPrice = seatClass.getPrice();
    Passenger passengers = new Passenger(passengerName, seatClass, ticketPrice);
    passenger.put(passengerName, passengers);
    System.out.println("Seat reserved: " + passengers);

  }

  public void cancelTicket(String passengerName) {
    if (passenger.containsKey(passengerName)) {
      Passenger cancelReservation = passenger.remove(passengerName);
      System.out.println("Canseled reservition: " + cancelReservation);
    }
  }

  public void display() {
    if (passenger.isEmpty()) {
      System.out.println("No reservation.");
    } else {
      for (Passenger passenger : passenger.values()) {
        System.out.println(passenger);
      }
    }
  }
  public double totalRevenue() {
    double revenue = 0.0;
    for(Passenger passengers : passenger.values()) {
      revenue += passengers.getTicketPrice();
    }
    return revenue;
  }

}
