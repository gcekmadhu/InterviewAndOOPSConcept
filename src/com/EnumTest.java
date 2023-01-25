package com;

public class EnumTest {

    private enum Element{
        BOOKINGS("Accounts"),
        CLOSE("Close")
        ;

        public String name;

        Element(String name) {
            this.name=name;
        }
    }

    public static void main(String[] args){
        System.out.println(Element.BOOKINGS.name);
    }
}
