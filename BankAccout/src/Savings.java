public class Savings extends Account
{

    //List the properties to a savings account
    private int safetyDepositBoxID;
    private int safetyDeposityBoxKey;

    //Constructor to initialize savings account properties
    public Savings(String name, String sSn, double initDeposit)
    {
        super(name, sSn, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate()
    {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox()
    {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDeposityBoxKey = (int) (Math.random() * Math.pow(10, 3));
    }

    //List any methods specific to the savings account
    public void showInfo()
    {
        super.showInfo();
        System.out.println(
                "Your Savings Account Feature" +
                        "\nSafety Deposit Box ID " + safetyDepositBoxID +
                        "\nSafety Deposit Box Key " + safetyDeposityBoxKey
        );
    }
}
