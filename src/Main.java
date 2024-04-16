public class Main {

    // Question 1 - calculateGrade
    public static String calculateGrade(int grade) {

        if (grade >= 90) {
            return "A";
        } else if (grade >= 80 && grade < 90) {
            return "B";
        } else if (grade >= 70 && grade < 80) {
            return "C";
        } else if (grade >= 60 && grade < 70) {
            return "D";
        } else {
            return "F";
        }
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int num) {
        if (num % 3 == 0) {
            return "fizz";
        } else if (num % 5 == 0) {
            return "buzz";
        } else if (num % 3 == 0 && num % 5 == 0) {
            return "fizzbuzz";
        } else {
            return "unlucky";
        }
    }

    // Question 3 - frontBack
    public static String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            String firstTwoLetters = str.substring(0, 2);
            return firstTwoLetters + str + firstTwoLetters;
        }
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c) {
        if (a + b == c) {
            return true;
        } else if (b + a == c) {
            return true;
        } else {
            return false;
        }
    }

    // Question 5 - endUp
    public static String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        } else {
            String lastThreeChars = str.substring(str.length() - 3);
            return str.substring(str.length() - 3) + lastThreeChars.toUpperCase();

        }
    }
}
