package Challenge2;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));
    }
    private static int sumDigits(int number){ //125
        if(number<10){
            return -1;
        }
        int sum = 0;
        while(number >0){
            // get the least significant number
            int digit = number % 10; // get 5 from 125
            sum += digit;

            //drop the least significant number
             number /= 10; // get 12 from 125

        }
        return sum;
    }
}
