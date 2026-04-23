 public interface BasicOperations{
     double add(double a,double b);
     double subtract(double a,double b);
     static void show(){
        System.out.println("Calculator program");}
     private void display(){
        System.out.println("operations");}
     default void showBasic(){
       System.out.println("Basic Operations");}
}