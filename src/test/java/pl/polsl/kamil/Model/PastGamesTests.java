package pl.polsl.kamil.Model;


import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author Kamil Skupien
 * @version 1.0
 */
public class PastGamesTests {


    private PastGames GameTable;//private PastGames object that tests work on

    /**
     * Method that initalize GameTable before each test
     */
    @BeforeEach
    public void setUp() {
        GameTable = new PastGames();
    }

    /**
     * Test that check if method AddGame add exact ammount of game objects to GameTable
     * @param TeamA Name of first team
     * @param TeamB Name of second team
     * @param aScore Number of goals scored by the first team
     * @param bScore Number of goals scored by the second team
     * @param howMany Tells how many iteraton of a loop test's gonna to do
     */
    @ParameterizedTest
    @CsvSource({" ManchesterCity, Chelsea, 2, 0, 6", "Arsenal, Liverpool, 2, 1, 5"})
    public void AddGameTest(String TeamA, String TeamB, int aScore, int bScore, int howMany) {
        for (int i = 0; i < howMany; i++) {
            Team aTeam = new Team(TeamA);
            Team bTeam = new Team(TeamB);
            Game game = new Game(aTeam, bTeam, aScore, bScore);
            GameTable.AddGame(game);
       }

        assertEquals(howMany, GameTable.GetFree());
    }
}
