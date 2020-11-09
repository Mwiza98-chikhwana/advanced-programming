public class Student extends AccDetails{
    private String regNumber;

    //Student(){}

    Student(int accountNumber, String accountName, String regNumber,String branch, double balance){
        super(accountName, accountNumber, branch, balance);
        this.regNumber = regNumber;
    }
    public void setRegNumber(String regNumber){
        this.regNumber = regNumber;
    }
    public String getRegNumber(){
        return regNumber;
    }
    
   /*@Override
    public void AccountClass(){
        System.out.println("your Account Number is :" + getAccountNumber());
        System.out.println("enter Account name");
        System.out.println();
        String AccountName = inpu.nextLine();
        setAccountName(accountName);
        System.out.println();
        System.out.println("enter your reg Number");
        String regNumber = inpu.nextLine();
        setRegNumber(regNumber);
        System.out.println("enter branch");
        System.out.println();
        String branch = inpu.nextLine();
        SetBranch(branch);
        System.out.println();
        System.out.println("enter BookBalance: MK");
        double balance =inpu.nextDouble();
        setBalance(balance);
        System.out.println(""+accountName+" your Account was successfully created." );       
    }*/
}