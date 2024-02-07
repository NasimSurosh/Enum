package enums;

public class Enum {
  
  public static final int RED = 1;
  public static final int GREEN = 2;
  public static final int BLUE = 3;
 
  

  public static void main(String[] args) {
    
   int color = GREEN;
   
   switch(color) {
   case GREEN:
     System.out.println("GREEN");
     break;
   case RED:
     System.out.println("RED");
     break;
   }

  }

}
