public class BloodData
{
    private String BloodType;
    private String rhFactor;

    public BloodData(){ //default constructor
        BloodType = "O";
        rhFactor = "+";
    }

    public void display(){
        System.out.println(BloodType + rhFactor + " is added on the blood bank");
    }

    public void setBloodType(String bloodType1) {
        this.BloodType = bloodType1;
    }

    public void setRhFactor(String rhFactor1) {
        this.rhFactor = rhFactor1;
    }

    public String getBloodType(){
        return BloodType;
    }

    public String getRhFactor(){
        return rhFactor;
    }
    
}