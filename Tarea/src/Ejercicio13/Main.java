package Ejercicio13;

import java.util.List;
import java.util.Scanner;

//Clase principal
public class Main {
    public static void main(String[] args) {
        //Agregando peliculas
        MovieRentalsystem sistema = new MovieRentalsystem();
        //Agregando peliculas al sistema de renta
        // nombre,id,estado,director,duracion,clasificacion,genero
        List<RentalItem> rentalItems =  List.of(
                new Movie("The lord of rings",1,true, "J.R Tolkien",(short)50,"para todos","Ficcion"),
                new Movie("The Spiderman",2,true, "NN",(short)90,"para todos","Ficcion"),
                new Movie("The ring",3,true, "Jackie Chang",(short)150,"mayores de 18","Terror"),
                new Movie("Thor",4,true, "Matin Scorssese",(short)250,"para todos","Ficcion"));
        //creacion de usuarios
        List<Customer> customer = List.of(
                new Customer("Rodrigo",1,null),
                new Customer("Mateo",2,null),
                new Customer("Pedro",3,null));


        //Interfas que permite realizar operaciones
    sistema.setRentalItems(rentalItems);
    sistema.setCustomers(customer);

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Bienvenido");
            System.out.println("Ingrese 1 para rentar una pelicula: ");
            System.out.println("Ingrese 2 para devolver una pelicula: ");
            System.out.println("Ingrese 3 para mostrar todas las peliculas: ");
            System.out.println("Ingrese 4 para mostrar a todos los usuario: ");
            System.out.println("Ingrese 5 salir");
            System.out.println("Que operacion desea realizar?");
            int option = sc.nextInt();
            if (option ==1){
                sistema.showAllItems();

                System.out.println("Ingrese su usuario");
                String usuario = sc.next();
                System.out.println("Ingrese el titulo de la Pelicula");
                String pelicula = sc.next();
                sistema.rentMovieToCustomer(pelicula, usuario);

            }
            if (option ==2){
                sistema.showAllItems();

                System.out.println("Ingrese su usuario");
                String usuario = sc.next();
                System.out.println("Ingrese el titulo de la Pelicula que devolvera");
                String pelicula = sc.next();
                sistema.returnMovie(pelicula, usuario);

            }
            if (option == 3){
                sistema.showAllItems();
            }
            if (option == 4){
                sistema.showAllCustomers();
            }

        }
    }
}
