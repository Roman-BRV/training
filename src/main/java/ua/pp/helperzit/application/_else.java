package ua.pp.helperzit.application;

import java.util.ArrayList;
import java.util.List;

public class _else {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);

        List<String> list = new ArrayList<>();
        list.add("aaa");

        System.out.println(list.contains("aaa"));

        Integer iOb1 = 100;
        Integer iOb2 = 100;
        System.out.println(iOb1 == iOb2);

        Integer iOb3 = new Integer(120);
        Integer iOb4 = new Integer(120);
        System.out.println(iOb3 == iOb4);

        Integer iOb5 = 200;
        Integer iOb6 = 200;
        System.out.println(iOb5 == iOb6);

    }
}
