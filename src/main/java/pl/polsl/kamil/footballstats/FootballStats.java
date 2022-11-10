package pl.polsl.kamil.footballstats;

import pl.polsl.kamil.Controler.Listening;
import pl.polsl.kamil.Controler.Menu;
import pl.polsl.kamil.Model.AllTeams;
import pl.polsl.kamil.Model.PastGames;
import pl.polsl.kamil.Window.OpenWindow;

/**
 * Main class of whole application
 *
 * @author Kamil Skupien
 * @version JDK 1.7
 */
public class FootballStats {// Wiekszosc funkcji trzeba dokonczyc i polaczyc z modelem, narazie stworzylem szkielet okienek

    /**
     * Function which starts program and decide rather use arguments from
     * console or ask user
     *
     * @param args Arguments form consol
     */
    public static void main(String[] args) {
        Listening listen = new Listening();
        PastGames Table = new PastGames();
        AllTeams Teams = new AllTeams();
        Menu menu = new Menu();
        int choice = 4;
         if (args.length == 1) {
            if (args[0].equals("1")) {
                choice = 1;
           }
            if (args[0].equals("2")) {
                choice = 2;
           }
            if (args[0].equals("3")) {
                choice = 3;
            }
           if (args[0].equals("4")) {
              choice = 4;
           }
        } else {
           choice = listen.Interaction();
        }
        do {
            menu.M(choice, Teams, Table);
            choice = listen.Interaction();
       } while (choice != 0);
       // java.awt.EventQueue.invokeLater(() -> {
         //   new OpenWindow().setVisible(true);
      //  });
    }
}
