package src.Models.Account;

import src.Models.Person.Person;
import src.Models.Address.Address;
import src.Models.Person.PersonInterface;

public class Account implements AccountInterface
{
    private Person owner;
    private float balance;
    public Account(
            Person owner,
            float balance
    )
    {
        this.balance = balance;
        this.owner = owner;
    }
    public Person getOwner()
    {
        return this.owner;
    }

    public void getAmount(float amount)
    {
        if (amount > this.balance) return;

        this.balance -= amount;
    }

    public void storeAmount(float amount)
    {
        this.balance += amount;
    }

    public void transferMoney(Account account, float amount)
    {
        if (amount > this.balance) return;
        this.getAmount(amount);
        account.storeAmount(amount);
    }

    public float getBalance()
    {
        return this.balance;
    }
}
