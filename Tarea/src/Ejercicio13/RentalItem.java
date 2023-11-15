package Ejercicio13;

import java.util.List;

 class RentalItem {
    protected String itemName;
    protected int itemID;
    protected boolean available;
    protected List<Movie> rentalItemList;

    public RentalItem(String itemName, int itemID, boolean available) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.available = available;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

   public void showDetails(){
       System.out.println("Nombre del item: " + this.itemName);
       System.out.println(" ID del item: " + this.itemID);
       System.out.println(" Estado del item: " + this.available);
   }


}
