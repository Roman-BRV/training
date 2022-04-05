package ua.pp.helperzit.generics;

import java.util.function.Predicate;

public class Util {

    public static <T extends Container> void printTypeClass(T input){
        System.out.println("Type T - " + input.getClass());
    }

    public static boolean validateUser(User user, Predicate<? super User> predicate){
        return predicate.test(user);
    }
}
