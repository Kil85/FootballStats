package pl.polsl.kamil.Model;

/**
 * Class that holds informations about a team
 *
 * @author Kamil Skupien
 * @version JDK 1.7
 */
public class Team {

    String Name; //Name of the club
    String Nickname;// Nickname of the club 
    String Country; //Country which club come from
    String City; //City where the club is placed
    String League; //League which club plays in

    /**
     * Constructor of the class
     *
     * @param name Name of the club
     * @param nickname Nickname of the club
     * @param country Country which club come from
     * @param City City where the club is placed
     * @param League League which club plays in
     */
    public Team(String name, String nickname, String country, String City, String League) {
        SetName(name);
        SetNickname(nickname);
        SetCountry(country);
        SetCity(City);
        SetLeague(League);
    }

    public Team(String name) {
        SetName(name);
        SetNickname("Nieznany");
        SetCountry("Nieznany");
        SetCity("Nieznane");
        SetLeague("Nieznana");
    }

    public Team(String name, String country) {
        SetName(name);
        SetNickname("Nieznany");
        SetCountry(country);
        SetCity("Nieznane");
        SetLeague("Nieznana");
    }

//    public Team(String name, String...rest){
//        SetName(name);
//        String AboutTeam[]= new String [4];
//        for (int i = 0; i < 4; i++) {
//            if(i<=rest.length){
//                AboutTeam[i]=rest[i];
//            }
//            else{
//                AboutTeam[i]="unknown";
//            }
//        }
//        SetNickname(AboutTeam[0]);
//        SetCountry(AboutTeam[1]);
//        SetCity(AboutTeam[2]);
//        SetLeague(AboutTeam[3]);
//    }
    /**
     * Constructor that coppies information from given object
     *
     * @param A object of Team class that constructor takes informations
     */
    public Team(Team A) {
        SetName(A.GetName());
        SetNickname(A.GetNickname());
        SetCountry(A.GetCountry());
        SetCity(A.GetCity());
        SetLeague(A.GetLeague());
    }

    /**
     * Gets name of the team
     *
     * @return name of the team
     */
    public String GetName() {
        return this.Name;
    }

    /**
     * Gets nickname of the team
     *
     * @return nickname of the team
     */
    public String GetNickname() {
        return this.Nickname;
    }

    /**
     * Gets country of the team
     *
     * @return country of the team
     */
    public String GetCountry() {
        return this.Country;
    }

    /**
     * Gets city of the team
     *
     * @return city of the team
     */
    public String GetCity() {
        return this.City;
    }

    /**
     * Gets league of the team
     *
     * @return league of the team
     */
    public String GetLeague() {
        return this.League;
    }

    /**
     * Sets name of the team
     *
     * @param name name to be set
     */
    void SetName(String name) {
        this.Name = name;
    }

    /**
     * Sets nickname of the team
     *
     * @param nickname nickname to be set
     */
    void SetNickname(String nickname) {
        this.Nickname = nickname;
    }

    /**
     * Sets country of the team
     *
     * @param country country to be set
     */
    void SetCountry(String country) {
        this.Country = country;
    }

    /**
     * Sets city of the team
     *
     * @param city city to be set
     */
    void SetCity(String city) {
        this.City = city;
    }

    /**
     * Sets league of the team
     *
     * @param league league to be set
     */
    void SetLeague(String league) {
        this.League = league;
    }

    /**
     * Override method toString helps print name of the object
     *
     * @return Name of the object
     */
    @Override
    public String toString() {
        return this.Name;
    }
}
