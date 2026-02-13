package week03.invoice;

public class TestInvoice {

    public static void main(String[] args) {

        // create an Invoice object
        Invoice inv = new Invoice("A123", "Hammer", 3, 15.5);

        // print values
        System.out.println("Part Number: " + inv.getPartNumber());
        System.out.println("Description: " + inv.getPartDescription());
        System.out.println("Quantity: " + inv.getQuantity());
        System.out.println("Price per item: " + inv.getPricePerItem());
        System.out.println("Invoice amount: " + inv.getInvoiceAmount());
    }
}
