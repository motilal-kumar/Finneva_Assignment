package org.example.util;

public class TestImpl implements  ITest
{

    @Override
    public String operation(String str1, String str2) {

        String finalString = str2.concat(str1);

        StringBuffer reverse = new StringBuffer(finalString).reverse();
        System.out.println(new String(reverse));

        /*str1  = "hello";
        str2  = "India";*/



        return finalString;
    }
}
