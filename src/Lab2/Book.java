package Lab2;

import java.util.Scanner;

public class Book {
    String title;
    String author;
    int price;

    Book(String title,String amount,int price){
        this.title=title;
        this.author=amount;
        this.price=price;
    }

    void applyDiscount(){
        float discAmt = (float) (10.00 / 100.00) * this.price;
        float AmtAfterDisc = this.price-discAmt;
        System.out.println("Discount Amount is: "+discAmt);
        System.out.println("Total Amount after Discount is: "+AmtAfterDisc);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book's name, author's name and it's price: ");
        Book book = new Book(sc.next(), sc.next(), sc.nextInt());
        book.applyDiscount();
    }
}
