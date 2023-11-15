package Ejercicio13;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String customerName;
    private int customerID;
    //agragar lista de peliculas rentadas  rentedMovies

private ArrayList<RentalItem> rentedMovies;

    public Customer(String customerName, int customerID, List<RentalItem> rentedMovies) {
        this.customerName = customerName;
        this.customerID = customerID;
      this.rentedMovies = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public ArrayList<RentalItem> getRentedMovies() {
        return rentedMovies;
    }

    public void setRentedMovies(ArrayList<RentalItem> rentedMovies) {
        this.rentedMovies = rentedMovies;
    }
    public void  showCustomerDetails(){
        System.out.println("Nombre del usuario: " + this.customerName);
        System.out.println(" ID del usuario: " + this.customerID);
        System.out.println("Lista de peliculas rentada: ");
        for(RentalItem item: rentedMovies){
            System.out.println(" // " + item.getItemName());
        }
    }

}
