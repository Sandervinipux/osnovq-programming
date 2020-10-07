/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;


import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author Sander
 */
public class History implements Serializable{
    private Book book;
    private Reader reader;
    private Date takeOnDate;
    private Date returnDate;
    
    public History() {
    }
    
    public History(Book book, Reader reader, Date takeOnDate, Date returnDate) {
        this.book = book;
        this.reader = reader;
        this.takeOnDate = takeOnDate;
        this.returnDate = returnDate;
    }
  
    public Date getReturnDate() {
        return returnDate;
    }
    
    public void SetReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
    
    public Book getBook() {
        return book;
    }
    
    public void SetBook(Book book) {
        this.book = book;
    }
    public void setReader(Reader reader) {
        this.reader = reader;
    }
    
    public Date getTakeOnDate() {
        return takeOnDate;
    }
    
    public void SetOnDate9(Date takeOnDate) {
        this.takeOnDate = takeOnDate;
    }
    
    @Override
    public String toString() {
        return "History{"
                + "book=" + book.getName()
                + ", reader=" + reader.getName()+" "+reader.getLastname()
                + ", takeOnDate=" + takeOnDate
                + ", returnDate=" + returnDate
                + "}";
    }

    public void setBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTakeOnDate(Date time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getReader() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
