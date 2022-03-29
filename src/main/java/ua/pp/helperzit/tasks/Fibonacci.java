package ua.pp.helperzit.tasks;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(new Fibonacci().getFibonacciMember(6));
    }

    public int getFibonacciMember(int pointer){

        //i - 1, 2, 3, 4, 5, 6, 7...
        //f - 0, 1, 1, 2, 3, 5, 8...
        int fibonacciMember = 0;
        if(pointer == 1){
            fibonacciMember = 0;
        } else if (pointer == 2){
            fibonacciMember = 1;
        } else {
            int previous = 1;
            int preprevious = 0;
            for (int i = 3; i <= pointer ; i++) {
                fibonacciMember = previous + preprevious;
                preprevious = previous;
                previous = fibonacciMember;
            }
        }
        
        return fibonacciMember;
    }
}
