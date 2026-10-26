import java.util.Scanner;
class InvoiceItem { private String partNumber, description; private int quantity; private double price;
    InvoiceItem(String p,String d,int q,double price){partNumber=p;description=d;quantity=Math.max(0,q);this.price=Math.max(0,price);}
    double amount(){return quantity*price;} public String toString(){return partNumber+" - "+description+": "+amount();}}
public class Task15InvoiceArray {
    public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Number of invoice items: ");int n=in.nextInt();in.nextLine();InvoiceItem[] items=new InvoiceItem[Math.max(0,n)];double total=0;
        for(int i=0;i<items.length;i++){System.out.print("Part number: ");String p=in.nextLine();System.out.print("Description: ");String d=in.nextLine();System.out.print("Quantity: ");int q=in.nextInt();System.out.print("Price per item: ");double price=in.nextDouble();in.nextLine();items[i]=new InvoiceItem(p,d,q,price);}
        for(InvoiceItem item:items){System.out.println(item);total+=item.amount();}System.out.println("Total: "+total);}
}
