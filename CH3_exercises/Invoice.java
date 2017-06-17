public class Invoice {
public Invoice (String partNumber, String partDescription, int quantityPurchased, double pricePerItem )
   {
      this.partNumber = partNumber;
      this.partDescription = partDescription;
      if(quantityPurchased > 0)
          this.quantityPurchased = quantityPurchased;
      if(pricePerItem > 0.0)
          this.pricePerItem = pricePerItem;
      

   }
String partNumber;
String partDescription;
int quantityPurchased;
double pricePerItem;

public void setPartNumber(String partNumber)
{
   this.partNumber = partNumber;
}
public String getPartNumber()
{
   return partNumber;
}
public void setPartDescription(String partDescription)
{
   this.partDescription = partDescription;
}
public String getPartDescription()
{
   return partDescription;
}
public void setQuantityPurchased(int quantityPurchased)
{ if(quantityPurchased > 0)
   this.quantityPurchased = quantityPurchased;
}
public int getQuantityPurchased()
{
   return quantityPurchased;
}
public void setPricePerItem(double pricePerItem)
{ if(pricePerItem > 0.0)
   this.pricePerItem = pricePerItem;
}
public double getPricePerItem()
{
   return pricePerItem;
}
public double getInvoiceAmount()
{
   return quantityPurchased*pricePerItem;

}

        

}