public class Driver {
    public static void main(String[] args) {
        // Create Player instances
        Player player1 = new Player("Kit", 18);
        Player player2 = new Player("Riley", 19);

        // Create Snack instances
        Snack snack1 = new Snack("Chips", 5.0, player2);

        // Create a BoardGame instance
        BoardGame boardGame = new BoardGame("Monopoly", player1, 8, 120, 2, 6, 54.7);

        // Create a GamingParty instance
        GamingParty gamingParty = new GamingParty("Birthday", boardGame);

        // Test adding players
        gamingParty.addPlayer(player1);
        gamingParty.addPlayer(player2);

        // Test adding snacks
        gamingParty.addSnack(snack1);

        gamingParty.outputPartyDetails();

        // Test calculating recommended snacks
        gamingParty.calculateRecommendedSnacks();

    }
}