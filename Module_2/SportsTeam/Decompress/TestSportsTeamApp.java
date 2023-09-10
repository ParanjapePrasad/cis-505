/*
 * Liang, Y.D. (2019).  Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.).  Pearson Education, Inc.
 * Payne, D. (2021).  CSD 405 Intermediate Java Programming.  Bellevue University, all rights reserved.
 * Paranjape, Prasad. (2023).  CIS 505 Intermediate Java Programming. Bellevue University.
 */

package Module_2.SportsTeam;

import java.util.Scanner;

public class TestSportsTeamApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner object to handle user prompts
        System.out.println("\n  Welcome to the Sports Team App "); // Welcome message

        do {
            System.out.print("\n  Enter a team name: "); // Prompt the user to enter the team name

            String teamName = scanner.nextLine();
            Team team = new Team(teamName); // New instance of the Team class

            System.out.println("\n  Enter the player names:"); // Prompt the user to enter the player names.
            System.out.print("    hint: use commas for multiple players; no spaces>: "); // Prompt the user hint to
                                                                                         // enter player names
            String playerNames = scanner.nextLine();
            String[] playerNamesArray = playerNames.split(","); // Convert the user entered players string into a string
                                                                // array of players
            for (int i = 0; i < playerNamesArray.length; i++) {
                team.addPlayer(playerNamesArray[i]); // Add player name to string array
            }

            System.out.println("\n  --Team Summary--"); // Print the summary result to console window
            System.out.println("  Number of players in team: " + team.getPlayerCount());
            System.out.print("  Players on team: ");

            String[] playersArray = team.getPlayers();
            for (int i = 0; i < team.getPlayerCount(); i++) {
                System.out.print(playersArray[i] + ",");
            }

            System.out.print("\n\n  Continue? (y/n): "); // Prompting user to decide between continuing or exiting the
                                                         // program
            String proceed = scanner.nextLine();
            
            if (proceed.equalsIgnoreCase("n")) {
                break; // Break do-while loop when user do not want to proceed
            }
        } while (true);

        scanner.close();
        System.out.println("\n  End of line...\n");

    }// end main

} // end TestSportsTeamApp