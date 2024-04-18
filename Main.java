 
    interface MyInterface{
        int DEFAULT_VALUE=10;
        void doSomething();
        int calculate(int a, int b);
    }
    
    class MyClass implements MyInterface {
        @Override
        public void doSomething(){
            System.out.println("Doing something");
        }
        @Override
        public int calculate(int a, int b){
            return a+b;
        }
    }
    
    public class Main{
        public static void main(String[] args) {
           MyClass obj = new MyClass();
           obj.doSomething();
           int result = obj.calculate(5,6);
           System.out.println("Addition Result: "+result);
           System.out.println("Default value: "+MyInterface.DEFAULT_VALUE);
        }
    }

