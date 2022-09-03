import org.example.Account;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccountTest
{
    Account account;
    Account accountStartsWithBlank;
    Account accountEndsWithBlank;
    Account accountShorterThan3;
    Account accountLongerThan19;
    Account accountWithTwoBlanks;


    @Before
    public void setUp()
    {
        account = new Account("Тык Тык");
        accountStartsWithBlank = new Account(" ТыкТык");
        accountEndsWithBlank = new Account("ТыкТык ");
        accountShorterThan3 = new Account("Тк");
        accountLongerThan19 = new Account("ТыкТыкТыкТык ТыкТыкТык");
        accountWithTwoBlanks = new Account("Тык Т ык");
    }

    @Test
    public void accountTest()
    {
        assertTrue("ошибка", account.checkNameToEmboss());
    }

    @Test
    public void accountStartsWithBlankTest()
    {
        assertFalse("ошибка", accountStartsWithBlank.checkNameToEmboss());
    }

    @Test
    public void accountEndsWithBlankTest()
    {
        assertFalse("ошибка", accountEndsWithBlank.checkNameToEmboss());
    }

    @Test
    public void accountShorterThan3Test()
    {
        assertFalse("ошибка", accountShorterThan3.checkNameToEmboss());
    }

    @Test
    public void accountLongerThan19Test()
    {
        assertFalse("ошибка", accountLongerThan19.checkNameToEmboss());
    }

    @Test
    public void accountWithTwoBlanksTest()
    {
        assertFalse("ошибка", accountWithTwoBlanks.checkNameToEmboss());
    }
}
