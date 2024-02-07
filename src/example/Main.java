package example;

public class Main {

  public static void main(String[] args) {

    Color color = Color.BLUE;
    
    switch(color) {
    case BLUE:
      break;
    case GREEN:
      break;
    case RED:
      break;
    default:
      break;
    
    }
    System.out.println(color.BLUE);
    System.out.println("Enum meaning as a string is: " + color.RED.name());
    System.out.println(color.BLUE.getClass());
    System.out.println(color.GREEN instanceof Enum);
    
    
    for(Color colors: color.values()) {
      System.out.println("The color is: " + colors.name()+ " and the value is: "+ color.getMeaning());
    }
    
  }

}
