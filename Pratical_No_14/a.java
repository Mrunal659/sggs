class A implements BasicOperations,AdvancedOperations{
         public double add(double a,double b){
           return a+b;}
         public double subtract(double a,double b){
           return a-b;}
         public double mult(double a,double b){
           return a*b;}
         public double div(double a,double b)throws CalculatorException{
            if(b==0){
               throw new CalculatorException("Can not divide by zero");}
           return a/b;}
        public void showBasic(){
          System.out.println("Both basic and advanced operations");}//override ambiguity resolve
}