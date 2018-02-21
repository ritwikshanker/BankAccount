import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
/*
CODE WRITTEN BY RITWIK SHANKER
 */
public class BankAccountApp
{
    public static void main(String args[]) throws IOException
    {
        List<Account> accounts = new LinkedList<Account>();

        String file = "D:\\Programming\\Java Projects\\BankAccout\\NewBankAccounts.csv";
        //Read a CSV FILE and then create new accounts based on that date
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders)
        {
            String name = accountHolder[0];
            String sSn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            if (accountType.equals("Savings"))
            {
                accounts.add(new Savings(name,sSn,initDeposit));
            }
            else if (accountType.equals("Checking"))
            {
                accounts.add(new Checking(name,sSn,initDeposit));
            }
            else
            {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }
        //accounts.get(5).showInfo();
        for (Account acc:accounts)
        {
            System.out.println("\n********************************");
            acc.showInfo();
        }
    }
}
