package prototypepattern.registrationform;

public interface Prototype {
    public Prototype clone();
    public void setName(String name);
    public String getName();
}
