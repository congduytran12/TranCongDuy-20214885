public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();

        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avengers", "Action", "Joss Whedon", 18.99f);
        anOrder.addDigitalVideoDisc(dvd4);

        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Batman", "Action", "Matt Reeves", 21.95f);
        anOrder.addDigitalVideoDisc(dvd5);

        // Print total cost of the items in the cart
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        // Remove some items from the cart and print total cost of the remaining items in the cart
        anOrder.removeDigitalVideoDisc(dvd1);
        anOrder.removeDigitalVideoDisc(dvd5);
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());

        System.out.println(anOrder.getQtyOrdered(dvd1));
        System.out.println(anOrder.getQtyOrdered(dvd2));
        System.out.println(anOrder.getQtyOrdered(dvd3));
        System.out.println(anOrder.getQtyOrdered(dvd4));
        System.out.println(anOrder.getQtyOrdered(dvd5));
    }
}