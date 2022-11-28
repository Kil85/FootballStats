package pl.polsl.kamil.Controler;

import java.util.Scanner;
import pl.polsl.kamil.Model.AllTeams;
import pl.polsl.kamil.Model.AllGames;
import pl.polsl.kamil.view.Speaking;

/**
 * Class which comunicate with user
 *
 * @author Kamil Skupien
 * @version JDK 1.7
 */
public class Listening {

    /**
     * Method to interact with user and ask to choose option from menu
     */
    public int Interaction() {
        Speaking speak = new Speaking();
        speak.MenuInfo();
        int Choise = TakeInt();
        Choise = CheckChoise(Choise, speak);
        return Choise;

    }

    /**
     * Method that takes string from user
     *
     * @return String from consol
     */
    public String TakeString() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    /**
     * Method that takes intiger from user
     *
     * @return intiger from consol
     */
    public int TakeInt() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    /**
     * Checks if intiger is in the range and if not asks until it is
     *
     * @param choise intiger that is checking
     * @param speak object of class that print informations on screen
     * @return
     */
    int CheckChoise(int choise, Speaking speak) {
        while (choise < 0 || choise > 4) {
            speak.WrongChoise();
            choise = CheckChoise(TakeInt(), speak);
            break;
        }
        return choise;
    }
}
