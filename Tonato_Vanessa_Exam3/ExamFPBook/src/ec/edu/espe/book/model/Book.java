/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.book.model;

/**
 *
 * @author FAMILIA TONATO
 */
public class Book {

    public static String txt;
   private String NameBook; 
   private String BookSize;  
   private String BookColor;  
   private int YearPublished;
   private String AuthorBook;
   private int EdittionBook;
   private String BookEditor;


    public Book(String NameBook, String BookSize, String BookColor, int YearPublished, String AuthorBook, int EdittionBook, String BookEditor) {
        this.NameBook = NameBook;
        this.BookSize = BookSize;
        this.BookColor = BookColor;
        this.YearPublished = YearPublished;
        this.AuthorBook = AuthorBook;
        this.EdittionBook = EdittionBook;
        this.BookEditor = BookEditor;

    }
       /**
     * @return the Speciesname
     */
    public String getNameBook() {
        return NameBook;
    }

    /**
     * @param NameBook the Speciesname to set
     */
    public void setSpeciesname(String NameBook) {
        this.NameBook = NameBook;
    }

    /**
     * @return the Species
     */
    public String isBookSize() {
        return BookSize;
    }

    /**
     * @param BookSize the Species to set
     */
    public void setSpecies(String BookSize) {
        this.BookSize = BookSize;
    }

    /**
     * @return the BookColor
     */
    public String getBookColor() {
        return BookColor;
    }

    /**
     * @param BookColor the SkinColor to set
     */
    public void setBookColor(String BookColor) {
        this.BookColor = BookColor;
    }

    /**
     * @return the YearPublished
     */
    public int getYearPublished() {
        return YearPublished;
    }

    /**
     * @param YearPublished the Age to set
     */
    public void setYearPublished(int YearPublished) {
        this.YearPublished = YearPublished;
    }

    /**
     * @return the AuthorBook
     */
    public String getAuthorBook() {
        return AuthorBook;
    }

    /**
     * @param AuthorBook the Feeding to set
     */
    public void setAuthorBook(String AuthorBook) {
        this.AuthorBook = AuthorBook;
    }

    /**
     * @return the Weight
     */
    public int getEdittionBook() {
        return EdittionBook;
    }

    /**
     * @param EdittionBook the Weight to set
     */
    public void setEdittionBook(int EdittionBook) {
        this.EdittionBook = EdittionBook;
    }

    /**
     * @return the BookEditor
     */
    public String getBookEditor() {
        return BookEditor;
    }

    /**
     * @param BookEditor the Location to set
     */
    public void setBookEditor(String BookEditor) {
        this.BookEditor = BookEditor;
    }  
}
