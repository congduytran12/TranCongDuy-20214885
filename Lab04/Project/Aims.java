import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();

        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", "Roger Allers", 87, 19.95f);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin", "Animation", "Guy Ritchie", 88,18.99f);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc(4, "Avengers", "Action", "Joss Whedon", 87, 24.35f);

        DigitalVideoDisc dvd5 = new DigitalVideoDisc(5, "The Batman", "Action", "Matt Reeves", 88, 25.65f);

        anOrder.addMedia(dvd1, dvd2, dvd3, dvd4, dvd5);
        anOrder.addMedia(dvd1);
        anOrder.addMedia(dvd2, dvd3);

        // Print total cost of the items in the cart
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        // Remove some items from the cart and print total cost of the remaining items in the cart
        anOrder.removeMedia(dvd1);
        anOrder.removeMedia(dvd5);
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());

        List<Media> mediaList = new ArrayList<Media>();
        mediaList.add(dvd1);
        mediaList.add(dvd2);
        mediaList.add(dvd3);
        mediaList.add(dvd4);
        Collections.sort(mediaList, Media.COMPARE_BY_TITLE_COST);
        Collections.sort(mediaList, Media.COMPARE_BY_COST_TITLE);
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("-------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("-------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("-------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("-------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("-------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("-------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("-------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove medias in cart");
        System.out.println("4. Play a media");
        System.out.println("5. PLace order");
        System.out.println("0. Back");
        System.out.println("-------------------------------");
        System.out.println("PLease choose a number: 0-1-2-3-4-5");
    }
}