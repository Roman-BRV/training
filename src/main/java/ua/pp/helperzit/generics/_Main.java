package ua.pp.helperzit.generics;

import java.util.function.Predicate;

public class _Main {

    public static void main(String[] args) {

        Container<Number, String, Boolean> stringContainer = new Container<>(1.5, "", false);

        User u1 = new User(1L);
        User u2 = new User(2L);
        UserContainer<User> userContainer1 = new UserContainer<>(u1);
        UserContainer<User> userContainer2 = new UserContainer<>(u2);

        //stringContainer.setValue("123");
        stringContainer.setValueT(Integer.valueOf(123));
        System.out.println(stringContainer.getValueT());
        System.out.println(stringContainer.getValueR());
        System.out.println(stringContainer.getValueU());
        Util.printTypeClass(stringContainer);

        System.out.println(userContainer1.getValue().compareTo(userContainer2.getValue()));

        Predicate<BaseEntity>  predicate = e -> e.getEntityId() != null;
        System.out.println(Util.validateUser(u1, predicate));
    }
}
