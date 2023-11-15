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

    public List<RentalItem> getRentalItems() {
        return rentalItems;
    }

    public void setRentalItems(List<RentalItem> rentalItems) {
        this.rentalItems = rentalItems;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customer) {
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
    public void rentMovieToCustomer(String itemName, String customerName) {
        Customer customerFound = null;
        for (Customer customer1 : this.customers) {
            if (customer1.getCustomerName().equals(customerName)) {
                customerFound = customer1;
                break;
            }
        }
        if (customerFound == null) {
            System.out.println("Usuario no encontrado");
            return;
        }

        RentalItem itemFound = null;
        for (RentalItem item1 : this.rentalItems) {
            if (item1.getItemName().equals(itemName)) {
                itemFound = item1;
                break;
            }
        }
        if (itemFound == null) {
            System.out.println("Pelicula no encontrada");
            return;
        }
        if (itemFound.isAvailable()) {
            itemFound.setAvailable(false);
            customerFound.getRentedMovies().add(itemFound);
            System.out.println("Pelicula " + itemFound.getItemName() + " rentada a " + customerFound.getCustomerName());
        } else {
            System.out.println("Pelicula " + itemFound.getItemName() + " no esta disponible.");
        }

    }


    //Metodo para procesar la devolucion de una pelicula rentada
    public void returnMovie(String itemName, String customerName) {
        Customer customerFound = null;
        for (Customer customer1 : this.customers) {
            if (customer1.getCustomerName().equals(customerName)) {
                customerFound = customer1;
                break;
            }
        }
        if (customerFound == null) {
            System.out.println("Usuario no encontrado");
            return;
        }

        RentalItem itemFound = null;
        for (RentalItem item1 : this.rentalItems) {
            if (item1.getItemName().equals(itemName)) {
                itemFound = item1;
                break;
            }
        }
        if (itemFound == null) {
            System.out.println("Pelicula no encontrada");
            return;
        }
            if (customerFound.getRentedMovies().contains(itemFound)) {
                itemFound.setAvailable(true);
                customerFound.getRentedMovies().remove(itemFound);
                System.out.println("Pelicula " + itemFound.getItemName() + " devuelta por el usuario " + customerFound.getCustomerName());
            } else {
                System.out.println("El usuario " + customerFound.getCustomerName() + " no tiene rentada esta pelicula.");

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






