public class App {
    public static void main(String[] args) throws Exception {
        //creating a two element array
        Payable[] payable = new Payable[2];

        //populating an array with objects
        payable[0] = new Invoice("01234", "Seat", 5, 1200.00);
        payable[1] = new SalariedEmployee("Lungu", "Joe", "1111-777-88", 3000.90);

        System.out.println("Invoice and Employee process polymorphically: ");

        for(Payable currentPayables : payable){
            //outputting currentPayables and it's appropriate payment amount
            System.out.println(currentPayables.toString() + " payment due " + currentPayables.getPaymentAmount());
        }
        
        //end of main function
    }

    //end of the main class
}