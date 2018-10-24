package test;


import java.util.Objects;

public class MyClass {
    private String string1;
    private String string2;

    public MyClass(){
        string1 = "a";
        string2 = "b";
    }
    public MyClass(String string1, String string2){
        this.string1 = string1;
        this.string2 = string2;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        MyClass person = (MyClass) o;
        return Objects.equals(string1, person.string1) && Objects.equals(string2, person.string2);
    }

    @Override
    public String toString() {
        return string1 + ", " + string2;
    }
}
