package hust.soict.dsai.aims.store.Store;
import java.util.ArrayList;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore;
    public Store() {
        itemsInStore = new ArrayList<>();
    }
    public void addDigitalVideoDisc (DigitalVideoDisc dvd) {
        if (dvd != null) {
            itemsInStore.add(dvd);
            System.out.println("The disc \"" + dvd.getTitle() + "\" has been added to the store.");
        } else {
            System.out.println("Cannot add a null DVD to the store.");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc dvd) {
        if (itemsInStore.remove(dvd)) {
            System.out.println("The disc \"" + dvd.getTitle() + "\" has been removed from the store.");
        } else {
            System.out.println("The disc \"" + (dvd != null ? dvd.getTitle() : "Unknown") + "\" is not found in the store.");
        }
    }
    public void displayStore() {
        System.out.println("***********************STORE***********************");
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            System.out.println("Available DVDs in store:");
            for (int i = 0; i < itemsInStore.size(); i++) {
                System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
            }
        }
        System.out.println("***************************************************");
    }
}
