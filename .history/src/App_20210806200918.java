public class App {
    public static void main(String[] args) throws Exception {
        //creating a two element array
        Payable[] payables = new Payable[2];

        //populating an array with objects
        payables[0] = new Invoice("01234", "Seat", 5, 1200.00);
        payables[1] = new SalariedEmployee("Lungu", "Joe", "1111-777-88", 3000.90);

        System.out.println("Invoice and Employee process polymorphically: ");

        for(Payable currentPayables : payables){
            //outputting currentPayables and it's appropriate payment amount
            System.out.println(currentPayables.toString() + " payment due " + currentPayables.getPaymentAmount());
        }
    }

    //end of the main class
}
