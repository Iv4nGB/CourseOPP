package HomeWork4;

/* import java.io.Serializable;
import java.util.ArrayList;
import java.util.List; */

public class Human extends Nimale
{
    public Human(String name, String sex, int age)
    {
        super(name, sex, age);
    }

    public Human(String name, String sex, int age, Nimale mather, Nimale father)
    {
        super(name, sex, age, mather, father);
    }
}