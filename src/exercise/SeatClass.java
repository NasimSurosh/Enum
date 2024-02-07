package exercise;

public enum SeatClass {

  FIRST_CLASS(320.0), BUSINESS_CLASS(254.0), ECONOMY_CLASS(200.0);

  private double price;

  private SeatClass(double price) {
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

}
