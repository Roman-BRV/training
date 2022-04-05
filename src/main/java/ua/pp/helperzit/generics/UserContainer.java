package ua.pp.helperzit.generics;

public class UserContainer<T extends Comparable<T>> {

    T value;

    public UserContainer(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
