/*
 * Liang, Y.D. (2019).  Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.).  Pearson Education, Inc.
 * Payne, D. (2021).  CSD 405 Intermediate Java Programming.  Bellevue University, all rights reserved.
 * Paranjape, Prasad. (2023).  CIS 505 Intermediate Java Programming. Bellevue University.
 */

package Module_2.SportsTeam;

public class Team {

    private String teamName;
    private String[] players = new String[20]; // String array to store plays name
    private int playerCount = 0;

    /**
     * Class argument constructor
     * 
     * @param teamName String
     */
    public Team(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Method with one argument, which is used to adds a player to the players data
     * field
     * 
     * @param playerName
     */
    public void addPlayer(String playerName) {
        players[playerCount] = playerName;
        playerCount++;
    }// end addPlayer

    /**
     * Accessor method to get players names
     * 
     * @return string array, returns the players data field
     */
    public String[] getPlayers() {
        return players;
    }// end getPlayers

    /**
     * Accessor method to get players count
     * 
     * @return integer, returns the playerCount data field
     */
    public int getPlayerCount() {
        return playerCount;
    }

    /**
     * Accessor method to get Team name
     * 
     * @return String, returns the teamName data field
     */
    public String getTeamName() {
        return teamName;
    }

}
