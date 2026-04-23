import java.util.*;
public class Calculator{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      A c = new A();
      BasicOperations.show();
      c.showBasics();
      while(true){
       System.out.println("\n1.Add 2.Subtract 3.Multiplication 4.Division 5.Exit");
       int choice=sc.nextInt();
       try{
        System.out.println("Enter two numbers: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        switch(choice){
      case 1:System.out.println("Result: "+c.add(a,b));
             break;
      case 2:System.out.println("Result: "+c.subtract(a,b));
             break;
      case 3:System.out.println("Result: "+c.mult(a,b));
             break;
      case 4:System.out.println("Result: "+c.div(a,b));
             break;
      case 5:System.out.println("Exit");
             break;
      default:System.out.println("Invalid choice");
}
     catch(CalculatorException ce){
       System.out.println("Error: "+ce.getMessage);
}
     catch(Exception e){
        System.out.println("Invalid input");}
}}}