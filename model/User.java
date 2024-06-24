package model;

public abstract class User {
    protected int id;
    protected String name;
    protected String lastName;

    public User(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(getClass().getSimpleName() + ": id = %s, name = %s, lastName = %s", id, name, lastName);
    }

    public int getId(){
        return id;
    }
}
