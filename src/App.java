public class App {
    public static void main(String[] args){
        //creating a two element array
        Payable[] payable = new Payable[2];

        //populating an array with objects
        payable[0] = new Invoice("01234", "Seat", 5, 1200.00);
        payable[1] = new SalariedEmployee("Lungu", "Joe", "1111-777-88", 3000.90);

        System.out.println("\nInvoice and Employee process polymorphically:\n\n");

        for(Payable currentPayable : payable){
            //outputting currentPayable and it's appropriate payment amount
            System.out.println(currentPayable.toString() + " payment due K" + currentPayable.getPaymentAmount() + "\n");
        }
        
        //end of main function
    }

    //end of the main class
}
