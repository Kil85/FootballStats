package pl.polsl.kamil.Model;

import java.util.Vector;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author Kamil Skupien
 * @version 1.0
 */
public class AllTeamsTests {

    private AllTeams T;//AllTeams object that tests work on

    /**
     * Method that initalize T before each test
     */
    @BeforeEach
    public void setUp() {
        T = new AllTeams();
    }

    /**
     * Test that check if method AddTeam add exact ammount of game objects to AllTeams
     * @param TeamA Name of first team
     * @param TeamB Name of second team
     * @param TeamC Name of third team
     * @param Result How many teams are there to add
     */
    @ParameterizedTest
    @CsvSource({"Manchester City, Liverpool, Real Madrid, 3"})
    public void AddTeamTest(String TeamA, String TeamB, String TeamC, int Result) {
        Team teamA = new Team(TeamA);
        Team teamB = new Team(TeamB);
        Team teamC = new Team(TeamC);
        T.AddTeam(teamA);
        T.AddTeam(teamB);
        T.AddTeam(teamC);
        assertEquals(Result, T.GetFree());
    }

    /**
     * Checks if finction findTeamsFromGivenCountry finds good amount of teams in AllTeams object
     * @param nameA Name of first team
     * @param countryA Country of first team
     * @param nameB Name of second team
     * @param countryB Country of second team
     * @param nameC Name of third team
     * @param countryC Country of third team
     * @param givenCountry Country that function search teams form
     * @param Result Number of teams form given country
     */
    @ParameterizedTest
    @CsvSource({"Manchester City, England, Liverpool, England,Real Madrid, Spain, England, 2",
        "Manchester City, England, Liverpool, England,Real Madrid, Spain, France, 0 "})
    public void findTeamsFromGivenCountryTest(String nameA, String countryA, String nameB, String countryB, String nameC, String countryC,
            String givenCountry, int Result) {
        Team teamA = new Team(nameA, countryA);
        Team teamB = new Team(nameB, countryB);
        Team teamC = new Team(nameC, countryC);
        T.AddTeam(teamA);
        T.AddTeam(teamB);
        T.AddTeam(teamC);
        assertEquals(Result, T.findTeamsFromGivenCountry(givenCountry).count());
    }
    
    
    @ParameterizedTest
    @CsvSource({"A, B, C"})
    public void namesOfTeamsTest(String teamA, String teamB, String teamC){
        
        Vector<String>rightAnswer = new Vector<String>();
        rightAnswer.addElement(teamC);
        rightAnswer.addElement(teamB);
        rightAnswer.addElement(teamA);
        
        Team cTeam= new Team(teamC);
        Team bTeam= new Team(teamB);
        Team aTeam= new Team(teamA);
        
        T.AddTeam(cTeam);
        T.AddTeam(bTeam);
        T.AddTeam(aTeam);
        
        assertEquals(rightAnswer, T.namesOfTeams());
    }

}
