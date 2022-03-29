package ua.pp.helperzit.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DifferentHashEachInstance {

    public static void main(String[] args) {

        Map<DifferentHashEachInstance, Integer> map = new HashMap<>();
        DifferentHashEachInstance first = new DifferentHashEachInstance("field");
        System.out.println(first);
        DifferentHashEachInstance second = new DifferentHashEachInstance("field");
        System.out.println(second);
        System.out.println(map.put(first, 1));
        System.out.println(map.put(second, 2));
        System.out.println(map.containsKey(first));
        System.out.println(map.containsKey(second));
        System.out.println(map);
        System.out.println(map.get(first));
        System.out.println(map.get(second));
        DifferentHashEachInstance third = new DifferentHashEachInstance("field");
        System.out.println(third);
        System.out.println("Third equals first and second - " + (third.equals(second) && third.equals(first)));
        System.out.println("But Map get by key 'third' - " + map.get(third));
    }
    private static int counter;

    private int intentionalInvalidHash;

    private String field;

    public DifferentHashEachInstance(String field){
        this.field = field;
        counter++;
        this.intentionalInvalidHash = counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DifferentHashEachInstance that = (DifferentHashEachInstance) o;
        return Objects.equals(field, that.field);
    }

    @Override
    public int hashCode() {
        return intentionalInvalidHash;
    }

    @Override
    public String toString() {
        return "DifferentHashEachInstance{" +
                "intentionalInvalidHash=" + intentionalInvalidHash +
                ", field='" + field + '\'' +
                '}';
    }
}
