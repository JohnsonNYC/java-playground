package FirstProject.Assignment2;

public class Restaurant {
  public String restaurantName;
  public long restaurantContact;
  public String restaurantAddress;
  public float rating;

  public void displayRestaurantDetails(){
    System.out.println("Restaurant details");
    System.out.println("*******************");
    System.out.println("Restaurant Name: " + restaurantName);
    System.out.println("Restaurant Rating: " + rating);
    System.out.println("Restaurant Contact: " + restaurantContact);
    System.out.println("Restaurant Address: " + restaurantAddress);
  }

  public static void main(String[] args) {
    Restaurant rest = new Restaurant();
    rest.restaurantName = "McDonalds's";
    rest.rating = 4.1f;
    rest.restaurantContact = 998876345;
    rest.restaurantAddress =  "SH109, Carolina Street, Springfield";

    rest.displayRestaurantDetails();
  }
}
