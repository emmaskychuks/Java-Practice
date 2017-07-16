package com.emmasky;

/**
 * Created by emmas on 6/19/2017.
 */
public class Contact
{
    private String name;
    private String mobileNumber;

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }


    Contact(String _name, String _mobileNumber)
    {
        name = _name;
        mobileNumber = _mobileNumber;
    }
}
