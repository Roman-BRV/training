package ua.pp.helperzit.generics;

public class User extends BaseEntity implements Comparable<User>{

    private Long id;

    public User(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int compareTo(User o) {
        System.out.println("0 - 0 => " + Integer.valueOf(0).compareTo(0));
        System.out.println("0 - 1 => " + Integer.valueOf(0).compareTo(1));
        System.out.println("1 - 0 => " + Integer.valueOf(1).compareTo(0));
        return id.compareTo(o.getId());
    }
}
