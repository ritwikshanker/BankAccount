public abstract class Account implements IBaseRate
{
    //List common properties for saving and checking account
    static int index = 10000;
    protected String accountNumber;
    protected double rate;
    private String name;
    private String sSn;
    private double balance;

    //Constructor to set base properties and initialize the account
    public Account(String name, String sSn, double initDeposit)
    {
        this.name = name;
        this.sSn = sSn;
        balance = initDeposit;

        //SetAccountNumber
        index += 1;
        this.accountNumber = setAccountNumber();
        setRate();

    }

    public abstract void setRate();

    private String setAccountNumber()
    {
        String lastTwoOfSSN = sSn.substring(sSn.length() - 2, sSn.length());
        int uniqueId = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + index + randomNumber;
    }

    public void compound()
    {
        double accruedInterest = balance * (rate / 100.0);
        balance += accruedInterest;
        System.out.println("AccruedIneterest : " + accruedInterest);
        printBalance();
    }


    //List common Methods
    public void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Depositing");
        printBalance();
    }

    public void withdraw(double amount)
    {
        balance = balance - amount;
        System.out.println("Withdrawing");
        printBalance();
    }

    public void transfer(String toWhere, double amount)
    {
        balance = balance - amount;
        System.out.println("Transferring amount " + amount + "$ to " + toWhere);
        printBalance();
    }

    public void printBalance()
    {
        System.out.println("Your Balance is =" + balance);

    }

    public void showInfo()
    {
        System.out.println(
                "NAME :" + name +
                        "\nAccount Number : " + accountNumber +
                        "\nBalance: " + balance +
                        "\nRate:" + rate + "%"
        );
    }

}
