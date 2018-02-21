public class Checking extends Account
{
    //List the properties to a checking account
    private long debitCardNumber;
    private int debitCardPin;

    //Constructor to initialize checking account properties
    public Checking(String name, String sSn, double initDeposit)
    {
        super(name, sSn, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate()
    {
        rate = getBaseRate() * .15;
    }

    private void setDebitCard()
    {
        debitCardNumber = (long) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }

    //List any methods specific to the checking account
    public void showInfo()
    {
        super.showInfo();
        System.out.println(
                "Your Checking Account Features" +
                        "\nDebit Card Nmber " + debitCardNumber +
                        "\nDebit Card PIN " + debitCardPin
        );
    }

}
