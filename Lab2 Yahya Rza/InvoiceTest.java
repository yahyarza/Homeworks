package week03.invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("P100", "USB keyboard", 2, 15.50);

        System.out.println("Part number: " + invoice.getPartNumber());
        System.out.println("Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: " + invoice.getPricePerItem());
        System.out.println("Invoice amount: " + invoice.getInvoiceAmount());

        
        invoice.setQuantity(-3);
        invoice.setPricePerItem(-10.0);

        System.out.println("Amount after invalid values: " + invoice.getInvoiceAmount());
    }
}
