public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        store.addDVD("The Godfather");
        store.addDVD("The Glory");
        store.addDVD("The Conjuring");

        System.out.println("DVDs in the store: " + store.getItemsInStore());

        store.removeDVD("The Conjuring");

        System.out.println("DVDs in the store after removal: " + store.getItemsInStore());

        store.removeDVD("The Matrix");
    }
}
