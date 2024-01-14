import java.util.Arrays;

public class GamingParty {

    private String theme;
    private BoardGame boardGame;
    private Player[] players;
    private Snack[] snacks;
    private Player winner;

    // a
    public GamingParty(String theme, BoardGame boardGame) {
        this.theme = theme;
        this.boardGame = boardGame;
        this.players = new Player[boardGame.getMaximumPlayers()];
        this.snacks = new Snack[2 * boardGame.getMaximumPlayers()];
        this.winner = null;
    }

    // b imagine getting stuck because you missed s in contains
    public void addPlayer(Player player) {
        if (player.getAge() < boardGame.getMinimumAge()) {
            System.out.println("The player does not meet the age requirements for the board game at this party.");
        } else if (Arrays.asList(players).contains(player)) {
            System.out.println("The player is already playing the game at this party.");
        } else {
            int index = -1;
            for (int i = 0; i < players.length; i++) {
                if (players[i] == null) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                System.out.println("The maximum number of players has been reached for the game at this party.");
            } else {
                players[index] = player;
            }
        }
    }

    // c
    public void play() {
        int numPlayers = 0;
        for (Player player : players) {
            if (player != null) {
                numPlayers++;
            }
        }

        if (numPlayers >= boardGame.getMinimumPlayers()) {
            System.out.println("Play!");
        } else {
            System.out.println("You need " + (boardGame.getMinimumPlayers() - numPlayers) + " more player(s)!");
        }
    }

    // d
    public void addSnack(Snack snack) {
        int index = -1;
        for (int i = 0; i < snacks.length; i++) {
            if (snacks[i] == null) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            snacks[index] = snack;
        } else {
            System.out.println("There are enough snacks!");
        }
    }

    // e
    public double getPartyCost() {
        double cost = 0;
        for (Snack snack : snacks) {
            if (snack != null) {
                cost += snack.getCost();
            }
        }
        return cost;
    }

    // f
    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        if (this.winner != null) {
            System.out.println("The winner has already been decided! It was " + this.winner.getName() + ".");
        } else if (!Arrays.asList(players).contains(winner)) {
            System.out.println("The player didn't even play the game so cannot win!");
        } else {
            this.winner = winner;
        }
    }

    // g
    public void outputPartyDetails() {
        System.out.println("Theme: " + theme);
        System.out.println("Board game: " + boardGame.getTitle());
        System.out.println("Players:");
        for (Player player : players) {
            if (player != null) {
                System.out.println(player.getName());
            }
        }
        System.out.println("Snacks:");
        for (Snack snack : snacks) {
            if (snack != null) {
                System.out.println(snack.getDescription() + " provided by " + snack.getProvider().getName());
            }
        }
        if (winner != null) {
            System.out.println("The winner is " + winner.getName() + "!");
        } else {
            System.out.println("No winner yet!");
        }
    }

    // h
    public void calculateRecommendedSnacks() {
        int numPlayers = 0;
        for (Player p : players) {
            if (p != null) {
                numPlayers++;
            }
        }

        double hours = Math.round(this.boardGame.getDuration() / 60.0f);
        int recommendedSnacks = (int) (hours * numPlayers);
        if (recommendedSnacks < numPlayers) {
            recommendedSnacks = numPlayers;
        }

        if (recommendedSnacks > snacks.length) {
            recommendedSnacks = snacks.length;
        }

        System.out.println("A total of " + recommendedSnacks + " snack(s) are recommended for the game.");
    }
}