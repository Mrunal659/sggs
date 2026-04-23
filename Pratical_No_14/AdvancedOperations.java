public interface AdvancedOperations{
     double mult(double a,double b);
     double div(double a,double b)throws CalculatorException;
     default void showBasic(){
       System.out.println("Advanced operations");
}   
   
}