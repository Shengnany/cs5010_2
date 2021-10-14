package Assignment1;

import java.util.Objects;

/**
 * This class extends Athlete and contains best5K, bestHalfMara, favourite
 */
public class Runner extends Athlete{
    private Double best5K;
    private Double bestHalfMara;
    private String favourite;

    /**
     * return the best 5k time
     * @return the best 5k time
     */
    public Double getBest5K() {
        return best5K;
    }

    /**
     * set the best 5k time
     * @param best5K the best 5k time
     */
    public void setBest5K(Double best5K) {
        this.best5K = best5K;
    }

    /**
     * get the best half marathon
     * @return the best half marathon
     */
    public Double getBestHalfMara() {
        return bestHalfMara;
    }

    /**
     * set the best half marathon
     * @param bestHalfMara the best half marathon
     */
    public void setBestHalfMara(Double bestHalfMara) {
        this.bestHalfMara = bestHalfMara;
    }

    /**
     * get the favourite event
     * @return  the favourite event
     */
    public String getFavourite() {
        return favourite;
    }

    /**
     * set the favourite event
     * @param favourite the favourite event
     */
    public void setFavourite(String favourite) {
        this.favourite = favourite;
    }

    /**
     * construct the Runner
     * @param athletesName athletesName
     * @param height height
     * @param weight weight
     * @param best5K best5K
     * @param bestHalfMara bestHalfMara
     * @param favourite favourite
     */
    public Runner(Name athletesName, Double height, Double weight, Double best5K,
            Double bestHalfMara,String favourite) {
        super(athletesName, height, weight);
        this.setBest5K(best5K);
        this.setBestHalfMara(bestHalfMara);
        this.setFavourite(favourite);
    }

    /**
     * String representation
     * @return String representation of the object
     */
    @Override
    public String toString() {
        return "Runner{" +
                "best5K=" + best5K +
                ", bestHalfMara=" + bestHalfMara +
                ", favourite='" + favourite + '\'' +
                '}';
    }

    /**
     * check if two objects are the same
     * @param o the Object to compare
     * @return true if equals false if not
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Runner)) return false;
        if (!super.equals(o)) return false;
        Runner runner = (Runner) o;
        return getBest5K().equals(runner.getBest5K()) && getBestHalfMara().equals(runner.getBestHalfMara()) && getFavourite().equals(runner.getFavourite());
    }

    /**
     * hash the object
     * @return the hash code of the object
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBest5K(), getBestHalfMara(), getFavourite());
    }

}

