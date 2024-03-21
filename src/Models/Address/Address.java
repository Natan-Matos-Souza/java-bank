package src.Models.Address;

public class Address implements AddressInterface
{
    public Address(
            String street,
            String city,
            String state,
            String number
    )
    {
        this.street = street;
        this.city = city;
        this.state = state;
        this.number = number;
    }
    private final String street;
    private final String city;
    private final String state;
    private final String number;

    public String getStreet()
    {
        return this.street;
    }

    public String getCity()
    {
        return this.city;
    }

    public String getState()
    {
        return this.state;
    }

    public String getNumber()
    {
        return this.number;
    }

    public String getAddress()
    {
        return this.street + ", " + this.number + ", " + this.city + ", " + this.state;
    }
}
