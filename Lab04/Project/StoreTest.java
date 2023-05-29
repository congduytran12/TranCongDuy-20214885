public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        store.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin", "Animation", "Guy Ritchie", 90, 20.16f);
        store.addMedia(dvd3);

        System.out.println("DVDs in the store: " + store.getItemsInStore());

        store.removeMedia(dvd2);

        System.out.println("DVDs in the store after removal: " + store.getItemsInStore());

        DigitalVideoDisc dvd4 = new DigitalVideoDisc(4, "Avengers", "Action", "Joss Whedon", 88, 18.99f);
        store.removeMedia(dvd4);
    }
}
