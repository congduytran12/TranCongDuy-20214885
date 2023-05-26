import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<String> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }

    public void addDVD(String dvd) {
        itemsInStore.add(dvd);
    }

    public void removeDVD(String dvd) {
        if (itemsInStore.contains(dvd)) {
            itemsInStore.remove(dvd);
        } else {
            System.out.println("DVD not found in store");
        }
    }

    public List<String> getItemsInStore() {
        return itemsInStore;
    }
}
