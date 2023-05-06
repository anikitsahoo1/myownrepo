import java.util.Scanner;
public class arithmeticCalculator {
    public void calculator(){
        while(true) {
            System.out.println("Choose a operation to perform with TWO numbers");
            System.out.println("1: Add\n2: Subtract\n3: Multiply\n4: Divide\n5: Exit\nEnter 1/2/3/4/5 from the options");
            Scanner sc = new Scanner(System.in);
            try {
                int option = sc.nextInt();
                switch (option) {
                    case 1: {
                        System.out.println("Enter first number");
                        float firstnum = sc.nextFloat();
                        System.out.println("Enter second number");
                        float secondnum = sc.nextFloat();
                        System.out.println("The sum is " + (firstnum + secondnum));
                        break;
                    }
                    case 2: {
                        System.out.println("Enter first number");
                        float firstnum = sc.nextFloat();
                        System.out.println("Enter second number");
                        float secondnum = sc.nextFloat();
                        System.out.println("The difference is " + (firstnum - secondnum));
                        break;
                    }
                    case 3: {
                        System.out.println("Enter first number");
                        float firstnum = sc.nextFloat();
                        System.out.println("Enter second number");
                        float secondnum = sc.nextFloat();
                        System.out.println("The product is " + (firstnum * secondnum));
                        break;
                    }
                    case 4: {
                        System.out.println("Enter first number");
                        float firstnum = sc.nextFloat();
                        System.out.println("Enter second number");
                        float secondnum = sc.nextFloat();
                        System.out.println("The decimal division result is " + (firstnum / secondnum) +
                                "\nFor Normal Division:-\n(The quotient is " + ((int) (firstnum) / (int) (secondnum)) +
                                "\nThe remainder is " + ((int) (firstnum) % (int) (secondnum)) + ")");
                        break;
                    }
                    case 5: {
                        break;
                    }
                    default: {
                        System.out.println("*PLEASE CHOOSE A CORRECT OPTION*");
                    }
                }
                if (option == 5) {
                    System.out.println("See you again!");
                    break;
                }
            }
            catch (Exception e){
                System.out.println("OOPS, Something went wrong. Try again...");
            }
            System.out.println("______________________________________________");
        }
    }
    public static void main(String[] args) {
        new arithmeticCalculator().calculator();
    }
}
