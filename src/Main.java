import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String bloodType; //global variables to call & store value
        String rhFactor; //initialized because it cannot be accessed in the while code blocks
        while (true)
        {
            System.out.print("Enter the blood type (O, A, B, AB) of the patient: ");
            bloodType = sc.nextLine().toUpperCase();
            if (bloodType.matches("[OAB]|AB|")) { //accepts only A,B,C,O,AB or ""
                break; //breaks the while loop and continue to the second one
            } else {
                System.out.println("Invalid input. Please use (O, A, B, AB) only.\n");
            }
        }

        while (true)
        {
            System.out.print("Enter the Rhesus factor (+ or -) of the patient: ");
            rhFactor = sc.nextLine();
            BloodData bd;
            if (bloodType.isEmpty() && ((rhFactor.equals("+") || rhFactor.equals("-")))){ //in case if input is empty bloodtype and have valid rhfactor
                System.out.println("Invalid input. Please input a bloodtype and an rhfactor.\n");
                break;
            } else if (rhFactor.isEmpty() && bloodType.isEmpty()) {
                bd = new BloodData();
                bd.display();
                break;
            } else if (rhFactor.equals("+") || rhFactor.equals("-")){
                bd = new BloodData(bloodType, rhFactor);
                bd.display();
                break;
            }else {
                System.out.println("Invalid input. Please use (+ or -) only.\n");
            }
        }
    }
}

