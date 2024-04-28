/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP 15ZBOOK G3
 */
public class book_product extends product {

   private String author;
    private String publisher;

    public book_product(int id, String name, float price, String auther, String publisher) {
        super(id, name, price);
        this.author = auther;
        this.publisher = publisher;
    }

    public void set_author(String author) {
        this.author = author;
    }

    public void set_publisher(String publisher) {
        this.publisher = publisher;
    }

    public String get_author() {
        return author;
    }

    public String get_publisher() {
        return publisher;
    }

}
