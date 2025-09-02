import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        BloodData bd = new BloodData();
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter the blood type (O, A, B, AB) of the patient: ");
            bd.setBloodType(sc.nextLine().toUpperCase());
            if (bd.getBloodType().matches("[OAB]|AB|")) { //accepts only A,B,C,O,AB or ""
                break; //breaks the while loop and continue to the second one
            } else {
                System.out.println("Invalid input. Please use (O, A, B, AB) only.\n");
            }
        }

        while (true)
        {
            System.out.print("Enter the Rhesus factor (+ or -) of the patient: ");
            bd.setRhFactor(sc.nextLine());
            if (bd.getBloodType().isEmpty() && ((bd.getRhFactor().equals("+") || bd.getRhFactor().equals("-")))){
                //in case if input is empty blood type and have valid rh factor

                System.out.println("Invalid input. Please input a blood type and an rh factor.\n");
                break;
            } else if (bd.getBloodType().isEmpty() && bd.getRhFactor().isEmpty()) {
                bd = new BloodData();
                bd.display();
                break;
            } else if (bd.getRhFactor().equals("+") || bd.getRhFactor().equals("-")){
                System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank");
                break;
            }else {
                System.out.println("Invalid input. Please use (+ or -) only.\n");
            }
        }
    }
}

