public class CartTest{
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 87);
        cart.addDigitalVideoDisc(dvd3);
        cart.print();
        System.out.println("\nSearching by ID...");
        DigitalVideoDisc resultById = cart.searchByID(2);
        if (resultById != null) {
            System.out.println("Found: " + resultById.toString());
        }
        System.out.println("\nSearching by Title...");
        cart.searchByTitle("Star Wars");
        cart.searchByTitle("Avatar"); 
    }
}
