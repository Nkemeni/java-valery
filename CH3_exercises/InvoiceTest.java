import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args)
    {
      Invoice invoice1 = new Invoice("PE1150", "Amazing Handset beta", -5, 99.68);
      System.out.printf("The initial are part: %s Description: %s Quantity: %d and Price: %.3f%n%n", 
                          invoice1.getPartNumber(), invoice1.partDescription, invoice1.quantityPurchased, invoice1.pricePerItem);
      invoice1.setQuantityPurchased(5);
      System.out.printf("The Last Invoice is: %.5f%n%n ", invoice1.getInvoiceAmount());
    
    
    }
}