package pl.polsl.kamil.Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author Kamil Skupien
 * @version 1.0
 */
public class GameTests {
    
    /**
     * Test that chceck if function WhoWon picks right winner
     * @param host host's name of the game
     * @param guest guest's name of the game
     * @param hostScore how many goals did host scored
     * @param guestScore how many goals did guest scored
     * @param winner expected winner
     */

    @ParameterizedTest
    @CsvSource({"ManchesterCity, Chelsea, 2, 0, ManchesterCity", "Arsenal, Liverpool, 1, 2, Liverpool", "Polska, Niemcy, 0, 0, Draw"})
    public void WhoWonTest(String host, String guest, int hostScore, int guestScore, String winner) {
        Team teamA = new Team(host);
        Team teamB = new Team(guest);
        Game g = new Game(teamA, teamB, hostScore, guestScore);
        
        assertEquals(winner, g.WhoWon(host, guest, hostScore, guestScore));
    }

}
