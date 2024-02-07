package example;

public enum Color {

  RED("Love",1, 2), GREEN("Health", 2, 4), BLUE("Calm", 3, 6);

  private String meaning;
  private int a, b;


  Color(String meaning, int a, int b) {
    this.meaning = meaning;
    this.a = a;
    this.b = b;

  }

  public String getMeaning() {
    return meaning;
  }
  

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  public String toString() {
    return "This color meaning is: " + meaning + a + b;
  }
}
