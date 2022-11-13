package pl.polsl.kamil.Model;

/**
 * Class that holds informations about a game
 *
 * @author Kamil Skupien
 * @version 1.0
 */
public class Game {

    Team teamA;//object of Team class represents host team of the game
    Team teamB;//object of Team class represents guest team of the game
    String Winner;//Winner of the game
    int teamAScore;//Number of goals scored by the hosts
    int teamBScore;//Number of goals scored by the guests

    /**
     * Constructor of the Game class
     *
     * @param TeamA host team of the game
     * @param TeamB guest team of the game
     * @param TAS Number of goals scored by the hosts
     * @param TBS Number of goals scored by the guests
     */
    public Game(Team TeamA, Team TeamB, int TAS, int TBS) {
        this.teamA = new Team(TeamA);
        this.teamB = new Team(TeamB);
        this.Winner=this.WhoWon(TeamA.GetName(), 
                TeamB.GetName(), TAS, TBS);
        this.teamAScore = TAS;
        this.teamBScore = TBS;
    }
    
    public String WhoWon(String TeamA, String TeamB, int TAS, int TBS){
        if (TAS > TBS) {
            return TeamA;
        } else if (TBS > TAS) {
            return TeamB;
        } else {
            return "Draw";
        }
   } 

    /**
     * Gets name of the host team
     *
     * @return name of the host team
     */
    public String GetFirstT() {
        return this.teamA.GetName();
    }

    /**
     * Gets name of the guest team
     *
     * @return name of the guest team
     */
    public String GetSecondT() {
        return this.teamB.GetName();
    }

    /**
     * Gets number of goals scored by host team
     *
     * @return number of goals scored by host team
     */
    public int GetFirstS() {
        return this.teamAScore;
    }

    /**
     * Gets number of goals scored by guest team
     *
     * @return number of goals scored by guest team
     */
    public int GetSecondS() {
        return this.teamBScore;
    }
}
