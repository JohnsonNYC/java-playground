public class Restaurant {
  private String name;
  private long restaurantContact;
  private String restaurantAddress;
  private float rating;

  Restaurant(String name, long restaurantContact, String restaurantAddress, float rating) {
    this.name = name;
    this.restaurantContact = restaurantContact;
    this.restaurantAddress = restaurantAddress;
    this.rating = rating;
  }

  public void displayRestaurantDetails(){
    System.out.println("Restaurant Details\n****************");
    System.out.println("Name: " + this.name);
    System.out.println("Rating: " + this.rating);
    System.out.println("Contact: " + this.restaurantContact);
    System.out.println("Address: " + this.restaurantAddress);
  }
}
