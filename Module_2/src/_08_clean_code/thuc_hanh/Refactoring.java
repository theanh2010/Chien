package _08_clean_code.thuc_hanh;

public class Refactoring {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(5));
    }
}
