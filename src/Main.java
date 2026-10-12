import java.util.Scanner;

import Projects.Author;
import Projects.Book;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Author author=new Author("OMAR");
        Book b1=new Book(20);
        b1.setNameofbook("world");
        b1.setPrice(100);
        Book b2=new Book("horse",30);
        b2.setPrice(200);
        Book b3=new Book("beauty",40,300);
        author.Addbook(b1,0);
        author.Addbook(b2,1);
        author.Addbook(b3,2);

        author.display_book_data();
        Book b= author.searchbook("hor");
        if(b!=null){
            System.out.println("the data of book you have searched for is ");
            b.displayinfo();
        }
        else System.out.println("sorry!!!! \"we have not found your book\" ");
    }

}