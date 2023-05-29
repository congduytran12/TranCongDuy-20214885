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
    }
}