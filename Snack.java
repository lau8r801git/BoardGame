import java.util.Arrays;

public class Snack{
    private String description;
    private double cost;
    private Player provider;

    public Snack(String description, double cost, Player provider){
        this.description=description;
        this.cost=cost;
        this.provider=provider;
    }

    public String getDescription(){
        return description;
    }

    public double getCost(){
        return cost;
    }

    public Player getProvider(){
        return provider;
    }
}