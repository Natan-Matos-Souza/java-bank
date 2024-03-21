package src.Models.Account;

import src.Models.Person.Person;
import src.Models.Address.Address;
public interface AccountInterface
{
    public Person getOwner();
    public void getAmount(float amount);
    public float getBalance();
    public void storeAmount(float amount);
}
