/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

public class Book {
String title;
public Book (String title) {
this.title = title;
}
public static void main(String[] args) {
Author[]authorArray = {new Author(),
new Author(),
new Author(),
};
System.out.println(authorArray[0].getAuthors()[0]);
System.out.println(authorArray[0].getAuthors()[1]);

String test []={"Tolstoj", "Gorkij","A.Pupkin","B.Popkin"};
authorArray[1].setAuthors(test);
System.out.println(authorArray[1].getAuthors()[0]);
System.out.println(authorArray[1].getAuthors()[1]);
System.out.println(authorArray[1].getAuthors()[2]);
System.out.println(authorArray[1].getAuthors()[3]);

Book book = new Book("Капитанская дочка");

String [] books = new String[5];
books[0] = "Title book: " + book.title + " author: " + authorArray[0].getAuthors()[0];
book.title = "Вий";
books[1] = "Title book: " + book.title + " author: " + authorArray[0].getAuthors()[1];
book.title = "Анна Каренина";
books[2] = "Title book: " + book.title + " author: " + authorArray[1].getAuthors()[0];
book.title = "Старуха Изергиль";
books[3] = "Title book: " + book.title + " author: " + authorArray[1].getAuthors()[1];
book.title = "Лунтик";
books[4] = "Title book: " + book.title + " authors: " + authorArray[1].getAuthors()[2] + ", " +authorArray[1].getAuthors()[3];
for(String x: books){
System.out.println(x);
}
}
public String toString(){
return title;
}
}