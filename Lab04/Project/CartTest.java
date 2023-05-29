public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin", "Animation", "Guy Ritchie", 90, 20.16f);
        cart.addMedia(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc(4, "Avengers", "Action", "Joss Whedon", 88, 18.99f);
        cart.addMedia(dvd4);

        DigitalVideoDisc dvd5 = new DigitalVideoDisc(5, "The Batman", "Action", "Matt Reeves", 89 ,21.95f);
        cart.addMedia(dvd5);

        cart.printOrder();

        cart.searchByID(2);
        cart.searchByTitle("The Lion King");
    }
}
