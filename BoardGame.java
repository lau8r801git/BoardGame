import java.util.Arrays;

//why is coderunner running this wrong
public class BoardGame{
    private String title;
    private Player owner;
    private int minimumAge;
    private int duration;
    private int minimumPlayers;
    private int maximumPlayers;
    private double rating;

    public BoardGame(String title, Player owner, int minimumAge, int duration, int minimumPlayers, int maximumPlayers, double rating){
        this.title=title;
        this.owner=owner;
        this.minimumAge=minimumAge;
        this.duration=duration;
        this.minimumPlayers=minimumPlayers;
        this.maximumPlayers=maximumPlayers;
        
        //if loop for ratings check, smaller than 0 and larger than 100 set to 0, otherwise set to rating
        if (rating<0||rating>100){
            System.out.println("Rating percentage not valid. Setting to 0.");
            this.rating=0;
        }
        else{
            this.rating=rating;
        }
    }
    
    //so many accessors ._.
    public String getTitle(){
        return title;
    }
    
    public Player getOwner(){
        return owner;
    }
    
    public int getMinimumAge(){
        return minimumAge;
    }
    
    public int getDuration(){
        return duration;
    }

    public int getMinimumPlayers(){
        return minimumPlayers;
    }

    public int getMaximumPlayers(){
        return maximumPlayers;
    }

    public double getRating(){
        return rating;
    }

    public void setRating(double rating){
        if (rating<0||rating>100){
            System.out.println("Rating percentage not valid.");
            return;
        }
        else
        {
            this.rating=rating;
        }
    }

}