public class AccDetails{
    private String AccountName;
    private double[] AccountNumber;
    private String Branch;
    private Date DateCreated;
    private String AccountType;

    AccDetails(){
        public String setName(String name){
            this.name = name;
        }
            public String getName(){
                return this.name;
            }
            public void setAcccountNumber(double[] AccountNumber){
                this.AccountNumber = AccountNumber;
            }
            public double[] getAccountNumber(){
                return 10000 + (int)(math.random * 90000);
            }
            public String setBranch(String Branch){
                this.branch = Branch;
            }
            public String getBranch(){
                return this.branch;
            }
            Date getDateCreated(){
                this.DateCreated = new Date();
                return this.DateCreated;
            }
            public String setAccountType(String AccountType){
                this.AccountType = AccountType;
            }
            public String getAccountType(){
                return this.AccountType;
            }
    }
}