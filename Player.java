import java.util.Arrays;

public class Player{
    //player name variable
    private String name;
    //player age variable
    private int age;

    //constructor take name and age
    public Player(String name, int age){
        this.name=name;
        this.age=age;
    }

    //getter for name
    public String getName(){
        return name;
    }
    //getter for age
    public int getAge(){
        return age;
    }
}