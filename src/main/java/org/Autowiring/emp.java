package org.Autowiring;

public class emp {
    private String Address;
    private String Name;

    // constructor
    public emp() {
        super();
    }

    public emp(String address, String name) {
        super();
        Address = address;
        Name = name;
    }

    // getter and setter
    public String getAddress()
    {
        return Address;
    }
    public void setAddress(String address)
    {
        Address = address;
    }

    public String getName()
    {
        return Name;
    }
    public void setName(String name)
    {
        Name = name;
    }

    @Override
    public String toString() {
        return "emp{" +
                "Address='" + Address + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}
