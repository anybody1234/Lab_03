public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        store.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 87);
        store.addDigitalVideoDisc(dvd3);
        store.displayStore();
        store.removeDigitalVideoDisc(dvd2);
        store.displayStore();
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avatar", "Sci-fi", "James Cameron", 162, 29.99f);
        store.removeDigitalVideoDisc(dvd4);
        store.removeDigitalVideoDisc(null);
    }
}
