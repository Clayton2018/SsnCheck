import java.util.Scanner;

public class SsnCheck {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String ssn;

        ssn = getSsn(in);

        if (validSsn(ssn)){
            System.out.println(ssn + " is a valid Social Security Number!");
        }

        else{
            System.out.println("This ssn is not valid! must be in the format of (999-99-9999)");
        }

        in.close();

    }//end main

    private static String getSsn(Scanner in){

        System.out.println("Please enter your social security number");
        return in.next();

    }//end getSsn

}//end class
