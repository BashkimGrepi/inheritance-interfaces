package inheritance.webshop;

/**
 * The Apartment class represents an apartment in a webshop. Like the Vehicle
 * class, the Apartment class should inherit the Product class.
 *
 * In real life an apartment would likely have additional properties, such as
 * the number of rooms, the size in square meters, the floor number, etc. In
 * this exercise, you can decide yourself which properties you want to add. You
 * can also decide yourself how the toString() method should look like.
 *
 * This class will not be autograded, so it is up to you to test it. You can
 * also skip this class and continue with the next part of the exercise if you
 * feel that you have understood the concept of inheritance.
 */
public class Apartment extends Product {
    private int rooms;
    private double squareMeter;
    private int floorNumber;
    
    
    public Apartment(String title, String description, double price, int rooms, double squareMeter, int floorNumber) {
        super(title, description, price);
        this.rooms = rooms;
        this.squareMeter = squareMeter;
        this.floorNumber = floorNumber;
    }


    public int getRooms() {
        return rooms;
    }


    public double getSquareMeter() {
        return squareMeter;
    }


    public int getFloorNumber() {
        return floorNumber;
    }


    @Override
    public String toString() {
        return super.toString()+ "Apartment [rooms=" + rooms + ", squareMeter=" + squareMeter + ", floorNumber=" + floorNumber + "]";
    }

    
    


    


}
