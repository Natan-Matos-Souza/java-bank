package src.Models.Person;

import src.Models.Address.Address;
import src.Models.Address.AddressInterface;

public class Person implements PersonInterface
{
    public Person(
            String firstName,
            String lastName,
            String documentCredentials,
            Address address
    )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentCredentials = documentCredentials;
        this.address = address;
    }
    private String firstName;
    private String lastName;
    private String documentCredentials;
    private Address address;
    public String getName()
    {
        return this.firstName + " " + this.lastName;
    }

    public String getDocumentCredentials()
    {
        return this.documentCredentials;
    }

    public Address getAddress()
    {
        return this.address;
    }
}
