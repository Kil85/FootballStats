package pl.polsl.kamil.view;

import java.util.function.Consumer;
import java.util.function.Supplier;
import pl.polsl.kamil.Model.AllTeams;
import pl.polsl.kamil.Model.Game;
import pl.polsl.kamil.Model.AllGames;
import pl.polsl.kamil.Model.Team;

/**
 * Class that prints informations on screen
 *
 * @author Kamil Skupien
 * @version JDK 1.7
 */
public class Speaking {

    /**
     * Method that prints informations about menu on screen
     */
    public void MenuInfo() {
        System.out.println("""
                           Witaj wybierz akcje: 
                           0. Wyjscie
                           1. Dodaj druzyne 
                           2. Dodaj mecz
                           3. Wyswietl druzyny
                           4. Wyswietl mecze""");

    }

    /**
     * Prints information about wrong choise
     */
    public void WrongChoise() {
        System.out.println("Niewlasciwy wybor!! Sprobuj ponownie: ");
    }

    /**
     * Prints all teams's name from table T
     *
     * @param T table of all teams that application knows
     */
    public void PrintAllTeams(AllTeams T) {
        Consumer<Team> printTeam = n -> System.out.println(n); // Lambda expresion with a functional interface
        T.GetTeams().forEach(printTeam);
    }

    /**
     * Gives information about the order of strings
     */
    public void AskForTeam() {
        System.out.println("Podaj zespol w kolejnosci: Nazwa pseudonim kraj miasto liga");
    }

    /**
     * Gives info about full table
     */
    public void TableIsFull() {
        System.out.println("Blad tablica pelna!!");
    }

    /**
     * Gives info what we need to do
     */
    public void ChooseTeams() {
        System.out.println("Wybierz zespoly");
    }

    /**
     * Gives info what we need to do
     */
    public void AskForScore() {
        System.out.println("Podaj wynik");
    }

    /**
     * Prints information about all games that application knows
     *
     * @param Table object that remembers all games included in application
     */
    public void PrintAllGames(AllGames Table) {
        int index = 1;
        for (Game g : Table.GetGames()) {
            System.out.println(index + ". " + g.GetFirstT() + " " + g.GetFirstS()
                    + " : " + g.GetSecondS() + " "
                    + g.GetSecondT());
        }

    }

    /**
     * Gives info what we need to do
     */
    public void AskForGame() {
        System.out.println("Wybierz mecz");
    }
}
