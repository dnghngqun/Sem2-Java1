public class PlayerTest {
    public static void main(String[] args) {
        PlayerIncome player1 = new PlayerIncome("John", 1000.0);
        TournamentIncome tournament = new TournamentIncome(player1,"John", 10, 70.9);
        player1.displayDetail();
        tournament.displayDetail();
    }
}
