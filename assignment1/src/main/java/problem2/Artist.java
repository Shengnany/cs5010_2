package problem2;

import problem1.TransitCard;

import java.util.ArrayList;
import java.util.Objects;

/**
 * This class is for Artist
 */
public class Artist {
    private Name name;
    private Integer age;
    private Genre genre;
    private ArrayList<Award> awards;
    private ArrayList<Movie> movies;
    private ArrayList<Serie> series;
    private ArrayList<Multimedia> multimedias;

    /**
     * Initialize the Artist
     * @param name the name of the Artist
     * @param genre the name of the Artist
     * @param age  the age of the Artist
     */
    public Artist(Name name, Genre genre, int age) {
        this.name = name;
        this.genre = genre;
        this.age = age;
        this.awards = new ArrayList<>();
    }

    /**
     *
     * @return the age of the artist
     */
    public int getAge() {
        return age;
    }

    /**
     * set the age of the artist
     * @param age the age of the artist
     */
    public void setAge(int age) {
        if(0<age && age<=128) this.age = age;
        else throw new IllegalArgumentException("Illegal Age");
    }

    /**
     *
     * @return the name of the artist
     */
    public Name getName() {
        return this.name;
    }

    /**
     * set the name of the artist
     * @param name the name of the artist
     */
    public void setName(Name name) {
        this.name = name;
    }

    /**
     *
     * @return the genre of the artist
     */
    public Genre getGenre() {
        return this.genre;
    }

    /**
     * set the genre of the artist
     * @param genre the genre of the artist
     */
    public void setGenre(Genre genre) {
       this.genre = genre;
        if (this.genre.equals(Genre.ACTOR) || this.genre.equals(Genre.FILMAKER)
                || this.genre.equals(Genre.DANCER)) {
            movies = new ArrayList<>();
            series = new ArrayList<>();
            multimedias = new ArrayList<>();
        } else {
            this.movies = null;
            this.series = null;
            this.multimedias = null;
        }
    }

    /**
     *
     * @return the list of awards
     */
    public ArrayList<Award> getAwards() {
        return this.awards;
    }

    /**
     * add award to the award list
     * @param award the award to be added
     */
    public void setAwards(Award award) {
        this.awards.add(award);
    }

    /**
     *
     * @return the movies list
     */
    public ArrayList<Movie> getMovies() {
        return this.movies;
    }

    /**
     * add the movie to the list
     * @param movie the movie to be added
     */
    public void setMovies(Movie movie) {
        if (this.genre.equals(Genre.ACTOR) || this.genre.equals(Genre.FILMAKER)
                || this.genre.equals(Genre.DANCER)) {
            this.movies.add(movie);
        }
        else{
            throw new IllegalArgumentException("Movie cannot be added");
        }
    }

    /**
     *
     * @return the list of TV series of the artist
     */
    public ArrayList<Serie> getSeries() {
        return this.series;
    }

    /**
     * set the list of TV series of the artist
     * @param serie TV series of the artist
     */
    public void setSeries(Serie serie) {
        if (this.genre.equals(Genre.ACTOR) || this.genre.equals(Genre.FILMAKER)
                || this.genre.equals(Genre.DANCER)) {
            this.series.add(serie);
        }
        else{
            throw new IllegalArgumentException("TV Serie cannot be added");
        }
    }

    /**
     *
     * @return the list of multi-media
     */
    public ArrayList<Multimedia> getMultimedias() {
        return this.multimedias;
    }

    /**
     * add multimedia to the list
     * @param multimedia the multimedia to be added to the list
     */
    public void setMultimedias(Multimedia multimedia) {
        if (this.genre.equals(Genre.ACTOR) || this.genre.equals(Genre.FILMAKER)
                || this.genre.equals(Genre.DANCER)) {
            this.multimedias.add(multimedia);
        }
        else{
            throw new IllegalArgumentException("Multimedia cannot be added");
        }
    }

    /**
     * @param object object.
     * @return boolean.
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Artist compared = (Artist) object;
        return Objects.equals(this.name, compared.name)
                && Objects.equals(this.age, compared.age)
                && Objects.equals(this.genre, compared.genre);
    }
    /**
     * @return hash code of the object
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.genre,this.age);
    }

}
