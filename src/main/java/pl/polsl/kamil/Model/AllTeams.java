package pl.polsl.kamil.Model;

import java.util.Vector;
import java.util.stream.Stream;
import pl.polsl.kamil.view.Speaking;

/**
 * Class that contains array of Team class's objects Represents database of all
 * teams in application
 *
 * @author Kamil Skupien
 * @version JDK 1.7
 */
public class AllTeams {

    Vector<Team> Teams;
  //  Team Teams[];//array that contains all teams in the app
    int Free;//number of objects in the Teams array
    int Full;//maximum lenth of Teams array

    /**
     * default constructor of a class
     */
    public AllTeams() {
        
        Teams=new Vector(10);
        //Teams = new Team[10];
        this.Full = 10;
        this.Free = 0;
    }

    /**
     * Method that chceck if there is a free space in Teams array and if it is
     * add object T
     *
     * @param T object of Team class that is tried to be add to the array
     */
    public void AddTeam(Team T) {
        if (Free >= Full) {
            Speaking spk = new Speaking();
            spk.TableIsFull();
            return;
        }
        this.Teams.add(T);
//  this.Teams[Free] = T;
        Free++;
    }

    /**
     * Gets Teams array
     *
     * @return Teams array
     */
    public Vector<Team> GetTeams() {
        return this.Teams;
    }

    /**
     * Gets number of objects in Teams array
     *
     * @return number of objects in Teams array
     */
    public int GetFree() {
        return this.Free;
    }

    /**
     * Gets an object of Team class that is placed in array on specific place
     *
     * @param nr place in array
     * @return Team from Teams array
     */
    public Team GetTeam(int nr) {
        return this.Teams.elementAt(nr);
    }
    
    /**
     * Function that find all teams that play in given country
     * @param country String given country
     * @return All teams that play in given country
     */
    public Stream<Team> findTeamsFromGivenCountry(String country){
        Stream<Team> teamsStream = this.Teams.stream();
        return  teamsStream.filter(t -> t.Country.equals(country));
    }
}
