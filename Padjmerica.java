import java.util.Scanner;

public class Padjmerica
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        Double Salary;
        Double Age;
        Double Dependants;
        Double Tax = 0.0;

        System.out.println("Salary: ");
        Salary = scan.nextDouble();
        System.out.println("Age: ");
        Age = scan.nextDouble();
        System.out.println("Dependants: ");
        Dependants = scan.nextDouble();


        if(Salary >= 250000){
            Tax = (64000 + (Salary - 250000) * 0.5);
        } else if(Salary >= 75000){
            Tax = (11500 + (Salary - 75000) * 0.3);
        } else if(Salary >= 25000){
            Tax = (1500 + (Salary - 25000) * 0.2);
        } else if(Salary >= 10000){
            Tax = (Salary * 0.1);
        }

        if(Dependants > 2){
            Tax =((Tax - 1000) - (Dependants - 2) * 500);
        } else if(Dependants >= 1){
            Tax = (Tax - 1000);
        }

        if(Age >= 81){
            Tax = Tax * 0;
        } else if(Age >= 73){
            Tax = (Tax * 0.34);
        } else if(Age >= 64){
            Tax = (Tax * 0.67);
        } else if(Age >= 22){
        } else if(Age >= 16){
            Tax = (Tax  * 0.75);
        } else{
            Tax = (Tax * 0.5);
        }

        System.out.println("You must pay: $" + (Tax));


        
    }
}