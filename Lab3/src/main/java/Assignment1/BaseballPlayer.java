package Assignment1;

import java.util.Objects;

/**
 * This class is for BaseballPlayer inherits Athlete and contains team, avgBatting, homRuns
 */
public class BaseballPlayer extends Athlete{
    private String team;
    private Double avgBatting;
    private Integer homRuns;

    /**
     * return the team
     * @return  the team
     */
    public String getTeam() {
        return team;
    }

    /**
     * set the team
     * @param team the team
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * get the average betting
     * @return the average betting
     */
    public Double getAvgBatting() {
        return avgBatting;
    }

    /**
     * set the average betting
     * @param avgBatting the average betting
     */
    public void setAvgBatting(Double avgBatting) {
        this.avgBatting = avgBatting;
    }

    /**
     * return the home runs
     * @return the home runs
     */
    public Integer getHomRuns() {
        return homRuns;
    }

    /**
     * set the home runs
     * @param homRuns  the home runs
     */
    public void setHomRuns(Integer homRuns) {
        this.homRuns = homRuns;
    }

    /**
     * Constructs the object
     * @param athletesName athletesName
     * @param height height
     * @param weight weight
     * @param league league
     * @param team team
     * @param avgBatting avgbatting
     * @param homRuns homRuns
     */
    public BaseballPlayer(Name athletesName, Double height, Double weight, String league, String team,
           Double avgBatting, Integer homRuns)
    {
        super(athletesName, height, weight, league);
        this.setHomRuns(homRuns);
        this.setAvgBatting(avgBatting);
        this.setTeam(team);
    }


    /**
     * check if two objects are the same
     * @param o the Object to compare
     * @return true if equals false if not
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseballPlayer)) return false;
        if (!super.equals(o)) return false;
        BaseballPlayer that = (BaseballPlayer) o;
        return this.team.equals(that.team) && this.avgBatting.equals(that.avgBatting) && this.homRuns.equals(that.homRuns);
    }
    /**
     * hash the object
     * @return the hash code of the object
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), team, avgBatting, homRuns);
    }

    /**
     * String representation
     * @return String representation of the object
     */
    @Override
    public String toString() {
        return "BaseballPlayer{" +
                "team='" + team + '\'' +
                ", avgBatting=" + avgBatting +
                ", homRuns=" + homRuns +
                '}';
    }
}
