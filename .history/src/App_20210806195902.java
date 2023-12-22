public class App {
    public static void main(String[] args) throws Exception {
        //creating a four element array
        Payable[] payables = new Payable[4];

        //populating an array with objects
        payables[0] = new Invoice("01234", "Seat", "5, "K1200.00");
    }
}
