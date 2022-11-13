package pl.polsl.kamil.Controler;

import pl.polsl.kamil.Controler.Listening;
import pl.polsl.kamil.Model.AllTeams;
import pl.polsl.kamil.Model.Game;
import pl.polsl.kamil.Model.PastGames;
import pl.polsl.kamil.Model.Team;
import pl.polsl.kamil.view.Speaking;

/**
 * Class that is responsible for working of whole menu of the aplication
 *
 * @author Kamil Skupien
 * @version 1.0
 */
public class Menu {

    /**
     * Method that operate on menu
     *
     * @param Choise action choosed by user
     * @param Teams database of teams in applications
     * @param Table database of Games in applications
     * @throws pl.polsl.kamil.Controler.MyException My own exception class
     */
    public void M(int Choise, AllTeams Teams, PastGames Table) throws MyException {
        Speaking spk = new Speaking();
        Listening list = new Listening();
        switch (Choise) {
            case 0:
                break;
            case 1:
                spk.AskForTeam();
                Listening li = new Listening();
                String name = li.TakeString();
                String Nickname = li.TakeString();
                String Country = li.TakeString();
                String City = li.TakeString();
                String League = li.TakeString();

                Team t = new Team(name, Nickname, Country, City, League);
                Teams.AddTeam(t);
                break;
            case 2:
                spk.PrintAllTeams(Teams);
                spk.ChooseTeams();
                int FirstT = list.TakeInt();
                int SecondT = list.TakeInt();
                spk.AskForScore();
                int FirstS = list.TakeInt();
                int SecondS = list.TakeInt();
                Game G = new Game(Teams.GetTeam(FirstT - 1), Teams.GetTeam(SecondT - 1),
                        FirstS, SecondS);
                Table.AddGame(G);

                break;
            case 3:
                spk.PrintAllTeams(Teams);
                break;
            case 4:
                spk.PrintAllGames(Table);
                break;
            case 5:
                spk.AskForGame();
                spk.PrintAllGames(Table);
                int Number = list.TakeInt();
                break;
            default:
                throw new MyException("Znak spoza skali");
        }

    }
}

