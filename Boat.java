
import java.io.Serializable;
import java.util.Formatter;

 
public class Boat implements Serializable{
    //instance variables
    private BoatType type;
    private String name;
    private int manufactureYear;
    private String model;
    private int feet;
    private double price;
    private double expenses;

    //default constructor
    public Boat() {
        name="";
        manufactureYear=0;
        model="";
        feet=0;
        price=0.0;
        expenses=0.0;
    }

    
    //prametric constructor
    public Boat(BoatType type,String name, int manufactureYear, String model, int feet, double price, double expenses) {
        this.type=type;
        this.name = name;
        this.manufactureYear = manufactureYear;
        this.model = model;
        this.feet = feet;
        this.price = price;
        this.expenses = expenses;
    }


    //setters and getters
    public BoatType getType() {
        return type;
    }

    public void setType(BoatType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }
    
    //to string method
    public String toString() {
          String boatType="SAILING";
         if(getType()==BoatType.POWER){
             boatType="POWER";
         }
         int space=12;
         if(String.valueOf(getPrice()).length()>7){
             space=11;
         }
         
         int expendeSpace=15;
         if(expenses==0.00){
             expendeSpace=15;
         }
         else if(String.valueOf(expenses).length()<7){
             expendeSpace=13;
         }else{
             expendeSpace=12;
         }
         
        Formatter fmt = new Formatter();
        fmt.format("%-5s%-10s%-18s%-5s%-10s%-2s%-"+space+"s%.2f%-"+expendeSpace+"s%.2f%n","", boatType, getName(), getManufactureYear(), getModel(), getFeet()+"'", " : Paid $ ", getPrice()," : Spent $ ", getExpenses());
        return fmt.toString();
    }
    
    
}
