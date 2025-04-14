class BankAccount{
    // static variable to keep track of the next account number
    private static int nextAccountNumber=1000231;
    String owner;
    int accountNumber;
    double balance;
    // contructor 
    public BankAccount(String owner){
        this.balance=0.0;
        this.owner=owner;
        this.accountNumber =++nextAccountNumber;
    }
  
   
  
    // deposit money function to store modify balance after calling each constructor
    public void deposit(double amount){
        this.balance+=amount;
    }
 // display function to avoid complexity of printing each variable separately and maintain clean code
    public void display(){
        System.out.println("Owner: "+this.owner + "\nAccount Number: "+this.accountNumber + "\nBalance: "+this.balance);
    }
}



// main class to test the BankAccount class
public class LabTask5{
    public static void main(String[] args){
     //calling BankAccountContructor with owner name only all value is set to default
     BankAccount a1 = new BankAccount("Sohaib Hassan");
     BankAccount a2 = new BankAccount("Sir Umar Haroon");
     BankAccount a3 = new BankAccount("Ali Hassan");
     a1.deposit(500);
     a2.deposit(1000);
     a3.deposit(1500);
     a1.display();
     a2.display();
     a3.display();
    
    
    }
}
