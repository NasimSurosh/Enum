package exercise;

public class Main {

  public static void main(String[] args) {
    
    Flight flightResevation = new Flight();
    flightResevation.resirveSeat("Ahmad", SeatClass.BUSINESS_CLASS);
    flightResevation.resirveSeat("Katya", SeatClass.ECONOMY_CLASS);
    flightResevation.resirveSeat("Joe", SeatClass.FIRST_CLASS);
    
    System.out.println("\nReserved tickets are: ");
    flightResevation.display();
    
    System.out.println("\nCanceled ticket is: ");
    flightResevation.cancelTicket("Joe"); 
    System.out.println("\nThe updated list is: ");
    flightResevation.display();    
    System.out.println("Total amount of tickets = "+ flightResevation.totalRevenue());

  }

}
