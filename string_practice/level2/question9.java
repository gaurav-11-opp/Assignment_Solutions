import java.util.*;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) return "user";
        return "computer";
    }

    public static String[][] calculateResults(String[][] games) {
        int userWins = 0, computerWins = 0, draws = 0;
        for (int i = 0; i < games.length; i++) {
            if (games[i][2].equals("user")) userWins++;
            else if (games[i][2].equals("computer")) computerWins++;
            else draws++;
        }
        double userPercent = (userWins * 100.0) / games.length;
        double computerPercent = (computerWins * 100.0) / games.length;
        String[][] results = new String[games.length + 1][4];
        for (int i = 0; i < games.length; i++) {
            results[i] = games[i];
        }
        results[games.length][0] = "Avg";
        results[games.length][1] = String.format("%.2f", userPercent) + "%";
        results[games.length][2] = String.format("%.2f", computerPercent) + "%";
        results[games.length][3] = "Draws: " + draws;
        return results;
    }

    public static void display(String[][] data) {
        System.out.println("User\tComputer\tWinner\t");
        for (int i = 0; i < data.length - 1; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1] + "\t" + data[i][2]);
        }
        System.out.println("User Win %: " + data[data.length - 1][1]);
        System.out.println("Computer Win %: " + data[data.length - 1][2]);
        System.out.println(data[data.length - 1][3]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[][] games = new String[n][3];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String user = sc.nextLine().toLowerCase();
            String computer = getComputerChoice();
            String winner = findWinner(user, computer);
            games[i][0] = user;
            games[i][1] = computer;
            games[i][2] = winner;
        }
        String[][] results = calculateResults(games);
        display(results);
    }
}
