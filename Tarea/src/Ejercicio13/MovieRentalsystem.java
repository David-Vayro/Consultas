package Ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class MovieRentalsystem {
    // Atributos:
    //  rentalItems: Colección de RentalItems.
    //        customers: Lista de clientes registrados.

    private List<RentalItem> rentalItems;
    private List<Customer> customers;
    public MovieRentalsystem() {
        this.rentalItems = new ArrayList<>();
        this.customers = new ArrayList<>();

    }
    public void setRentalItem(List<RentalItem> rentalItems) {

    }

    public  List<RentalItem> getRentalItems() {
        return rentalItems;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomer(List<Customer> customer) {
    }

//Metodo para aniadir items

    public void addItem(RentalItem item) {
        rentalItems.add(item);
    }

    //Metodo para registrar un cliente
    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    //Metodo para rentar una pelicula al cliente
    public void rentMovieToCustomer(RentalItem item, Customer customer) {

        if (item.isAvailable()) {
            item.setAvailable(false);
            customer.getRentedMovies().add(item);
            System.out.println("Pelicula " + item.getItemName() + " rentada a " + customer.getCustomerName());
        } else {
            System.out.println("Pelicula " + item.getItemName() + " no esta disponible.");
        }

    }


    //Metodo para procesar la devolucion de una pelicula rentada
    public void returnMovie(RentalItem item, Customer customer) {
        if (customer.getRentedMovies().contains(item)) {
            item.setAvailable(true);
            customer.getRentedMovies().remove(item);
            System.out.println("Pelicula " + item.getItemName() + " devuelta por el usuario " + customer.getCustomerName());
        } else {
            System.out.println("El usuario " + customer.getCustomerName() + " no tiene rentada esta pelicula.");

        }

    }

    //metood para mostrar los items disponibles
    public void showAllItems() {
        for (RentalItem item : this.rentalItems) {
            item.showDetails();
            System.out.println(">>>>>----***-----------------***-----<<<<<<");
        }

    }

    //metodo par amostrar todos los clientes registrados
    public void showAllCustomers() {
        for (Customer customer : this.customers) {
            customer.showCustomerDetails();
            System.out.println(">>>>>----***-----------------***-----<<<<<<");
        }
    }




}



