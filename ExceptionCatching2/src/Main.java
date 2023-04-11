import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(enterFloat());

        Exeption3.main(new String[]{""});
    }

    static float enterFloat(){
        float temp=0.00f;
        Scanner input=new Scanner(System.in);
        boolean isCorrect=false;
        while (isCorrect!=true) {
            try {
                temp = Float.valueOf(input.nextLine());
                input.close();
                isCorrect=true;
            } catch (InputMismatchException e) {
                System.out.println("Input format error\nplease try again");
            } catch (NumberFormatException e){
                System.out.println("Input format error\nplease try again");
            }
        }
        input.close();
        return temp;
    }

//    static void exeption2(){
//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }
//
//    }
}