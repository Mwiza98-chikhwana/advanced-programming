import java.util.*;

public class AccDetails{
    private String accountName;
    private double accountNumber;
    private String branch;
    private String accountType;
    private double bookBalance;

    AccDetails(String accountName, double accountNumber, String branch, double bookBalance){
        //DateCreated = new java.util.Date();
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.branch = branch;
        this.bookBalance = bookBalance;

        //Scanner inpu = new Scanner(System.in);
    }
    public int getAccountNumber(){

        return (10000 + (int)(Math.random() * 90000));
    }
    
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountName(){
        return accountName;
    }
    public void setaccountName(String AccountName){
        this.accountName = accountName;
    }
    public String getaccountType(){
        return accountType;
    }
    public void setaccountType(String accountType){
        this.accountType = accountType;
    }
    public String getBranch(){
        return branch;
    }
    public void setBranch(String Branch){
        this.branch = branch;
    }
    public double getBookBalance(){
        return bookBalance;
    }
    public void setBookBalance(double bookBalance){
        this.bookBalance = bookBalance;
    }
    public void setDeposit(double amount){
        this.bookBalance += amount;
    }
    public double getDeposit(){
        return bookBalance;
    }
    public double setWithdraw(double amount){
        return this.bookBalance -= amount;
    }

    public String toString(){
        return "Acccount Number   AccountName  Branch Balance Type\n--------------------------------------------------\n"+"   "+getAccountNumber()+"          "+this.accountName+"    "+this.branch+"  "+this.bookBalance+"    "+this.accountType;
    }
    //public java.util.date getDateCreated(){
       // return DateCreated;
   // }
    public void AccountClass(){

    }


}