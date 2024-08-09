import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;
import java.util.Base64;
import java.math.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.
                print("""
                        Please chose an option:
                         \
                        1.- Basic calculator
                         \
                        2.- Encoder
                         \
                        3.-Student average calculator
                        """);

        Scanner option = new Scanner(System.in);
        int op = Integer.parseInt(option.next());

        if (op == 1){

            calculator();

        } else if (op == 2) {

            encoder();

        } else if (op == 3) {

            studentavg();

        }
        else System.out.print("Please chose from the options above\n");
    }

    public static void calculator(){
        System.out.print("Please chose an option: \n 1.- Sum (a + b)\n 2.- Substract (a - b)\n 3.- Multiply (a x b)\n 4.- Divide (a / b)\n");

        Scanner optioncal = new Scanner(System.in);
        int cal = Integer.parseInt(optioncal.next());

        if (cal == 1){
            System.out.print("Please the value for a: ");
            double a = Integer.parseInt(optioncal.next());

            System.out.print("Please the value for b: ");
            double b = Integer.parseInt(optioncal.next());

            double result = a + b;
            System.out.printf("The result is: %s", result);

        } else if (cal == 2) {
            System.out.print("Please the value for a: ");
            double a = Integer.parseInt(optioncal.next());

            System.out.print("Please the value for b: ");
            double b = Integer.parseInt(optioncal.next());

            double result = a - b;
            System.out.printf("The result is: %s", result);

        } else if (cal == 3) {
            System.out.print("Please the value for a: ");
            double a = Integer.parseInt(optioncal.next());

            System.out.print("Please the value for b: ");
            double b = Integer.parseInt(optioncal.next());

            double result = a*b;
            System.out.printf("The result is: %s", result);

        } else if (cal == 4) {
            System.out.print("Please the value for a: ");
            double a = Integer.parseInt(optioncal.next());

            System.out.print("Please the value for b: ");
            double b = Integer.parseInt(optioncal.next());

            double result = a/b;
            System.out.printf("The result is: %s", result);

        }


    }


    public static void encoder(){

        System.out.print("Please chose an option:\n 1.- Encode a String to Base64\n 2.- Decode a String to Base64\n");

        Scanner optionenco = new Scanner(System.in);
        int enco = Integer.parseInt(optionenco.next());

        if (enco == 1){
            System.out.print("Please enter the string to encode:\n");

            Scanner encode = new Scanner(System.in);
            String e = encode.next();

            byte[] encodedBytes = Base64.getEncoder().encode(e.getBytes());
            System.out.println("Encoded string is: " + new String(encodedBytes));

        } else if (enco == 2) {
            System.out.print("Please enter the string to decode:\n");

            Scanner decode = new Scanner(System.in);
            String d = decode.nextLine();

            byte[] decodedBytes = Base64.getDecoder().decode(d);
            System.out.println("Decoded string is: " + new String(decodedBytes));

        }

    }

    public static void studentavg() {
        System.out.print("Please enter your name:\n");
        Scanner StudentName = new Scanner(System.in);
        String name = StudentName.nextLine();

        System.out.print("Please enter your grade:\n");
        Scanner StudentGrade = new Scanner(System.in);
        String grade = StudentGrade.nextLine();

        System.out.print("Please enter the number of signatures to enroll:\n");
        Scanner NSignatures = new Scanner(System.in);
        int numsig = NSignatures.nextInt();

        List<String> signatures = new ArrayList<String>();
        List<Double> scores = new ArrayList<Double>();

        double sum = 0;

        for (int i = 0; i < numsig; i++) {


            System.out.printf("Please enter the name of signature %d:\n", i + 1);
            Scanner Signature = new Scanner(System.in);
            String sig = Signature.nextLine();
            signatures.add(sig);


            System.out.printf("Please enter the score of %s:\n", sig);
            Scanner sigscore = new Scanner(System.in);
            double score = sigscore.nextDouble();
            scores.add(score);

            sum = sum + score;


        }

        double avg = sum / numsig;
        String status ="";
        if (avg <7) {
            status = "Failed.";
        } else if (avg > 9) {
            status = "Passed with good level.";
        }else status = "Passed.";


        System.out.println("--------------------------------------------------------\n");
        System.out.printf("Student name: %-30sGrade: %s\n", name, grade);
        System.out.println("--------------------------------------------------------\n");

        for (int i = 0; i < numsig; i++) {
            System.out.printf("             Signature: %-20sScore: %.2f\n", signatures.get(i), scores.get(i));
        }

        System.out.println("--------------------------------------------------------\n");

        System.out.printf("Final average: %-35.2f Status: %s\n",avg,status);
    }



}