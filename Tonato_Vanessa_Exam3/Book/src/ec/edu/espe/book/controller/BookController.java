/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.book.controller;
import ec.edu.espe.book.model.Book;
import utils.FileManager;
/**
 *
 * @author FAMILIA TONATO
 */
public class BookController {
    
    public void save(Book Book){
       String data = Book.getNameBook() + ";" + Book.isBookSize()+ ";" + Book.getBookColor()+ ";" + Book.getAuthorBook()+ ";" + Book.getEdittionBook()+ ";" + Book.getYearPublished()+ ";" + Book.getBookEditor();
       FileManager.save(data, "Book");
    }

}
