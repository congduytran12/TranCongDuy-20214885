import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }

    public void addMedia(Media dvd) {
        itemsInStore.add(dvd);
    }

    public void removeMedia(Media dvd) {
        if (itemsInStore.contains(dvd)) {
            itemsInStore.remove(dvd);
        } else {
            System.out.println("DVD not found in store");
        }
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
}
