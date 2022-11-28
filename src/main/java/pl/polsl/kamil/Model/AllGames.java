package pl.polsl.kamil.Model;

import java.util.Vector;
import pl.polsl.kamil.view.Speaking;

/**
 * Class that contains array of Game class's objects Represents database of all
 * games in application
 *
 * @author Kamil Skupien
 * @version 1.0
 */
public class AllGames {

    Vector<Game> Games;
    //  Game Games[]; // array of Game class's objects
    int Free; // number of objects in Games array
    int Full; // maximum lenth of Games array

    /**
     * Constructor of PastGames class
     */
    public AllGames() {
        Full = 10;
        //   Games = new Game[10];
        Games = new Vector(10);
        Free = 0;
    }

    /**
     * Gets number of objects in Game array
     *
     * @return number of objects in Game array
     */
    public int GetFree() {
        return this.Free;
    }

    /**
     * Gets array of Games
     *
     * @return array of Games
     */
    public Vector< Game> GetGames() {
        return this.Games;
    }

    /**
     * Method that chceck if there is a free space in Games array and if it is
     * add object G
     *
     * @param G object of Game class that is tried to be add to the array
     */
    public void AddGame(Game G) {
        if (Free + 1 >= Full) {

            Speaking speak = new Speaking();
            speak.TableIsFull();
            return;
        }
        //this.Games[this.Free] = G;
        this.Games.add(G);
        // this.Games.elementAt(this.Free);
        this.Free++;
    }

    public String[][] TableToArray() {

        String[][] result = new String[Free][4];

        int columsIterator = 0;

        for (Game g : this.Games) {
            int rowsIterator = 0;

            result[columsIterator][rowsIterator] = g.GetFirstT();
            rowsIterator++;

            result[columsIterator][rowsIterator] = Integer.toString(g.GetFirstS());
            rowsIterator++;

            result[columsIterator][rowsIterator] = Integer.toString(g.GetSecondS());
            rowsIterator++;
            
            result[columsIterator][rowsIterator] = g.GetSecondT();
            rowsIterator++;
            
            columsIterator++;
        }

        return result;
    }

}
