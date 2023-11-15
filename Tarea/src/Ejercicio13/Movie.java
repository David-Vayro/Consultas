package Ejercicio13;

public class Movie extends RentalItem{
    private String director;
    private short duration;
    private  String ageRating;
    private  String gener;

    public Movie(String itemName, int itemID, boolean available, String director, short duration, String ageRating, String gener) {
        super(itemName, itemID, available);
        this.director = director;
        this.duration = duration;
        this.ageRating = ageRating;
        this.gener = gener;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public short getDuration() {
        return duration;
    }

    public void setDuration(short duration) {
        this.duration = duration;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    @Override
    public void showDetails(){
        System.out.println("Nombre del item: " + this.itemName);
        System.out.println(" ID del item: " + this.itemID);
        System.out.println(" Estado del item: " + this.available);
        System.out.println(" Director: " +this.director);
        System.out.println(" Duration: " + this.duration);
        System.out.println(" Clasificacion de edades: " + this.ageRating);
        System.out.println(" Genero: " + this.gener);
    }
}
