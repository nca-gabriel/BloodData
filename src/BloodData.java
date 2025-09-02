public class BloodData{
    static String BloodType;
    static String rhFactor;

    public BloodData(){ //default constructor
        BloodType = "O";
        rhFactor = "+";
    }

    public BloodData(String bt, String rh){ //overloaded constructor
        this.BloodType = bt; //instance reference ('this' is an object of the class)
        this.rhFactor = rh;
        /*
        or this, since variable is static
          BloodType = bt;
          rhFactor = rh
        */

    }

    public void display(){
        System.out.println(BloodType + rhFactor + " is added on the blood bank");
    }
}