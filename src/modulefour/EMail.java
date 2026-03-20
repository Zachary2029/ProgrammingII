/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulefour;

/**
 *
 * @author ZQIN
 */
public class EMail {
    private String author;
    private Date date;
    private String subject;
    private String[] to;
    
    public EMail(String author, Date date, String subject, String[] to) {
        this.author = author;
        this.date = date;
        this.subject = subject;
        this.to = to;
    }
    
    public String getAuthor() {
        return author; }
    
    public void setAuthor(String author) {
        this.author = author; }
    
    public Date getDate() {
        return date; }
    
    public void setDate(Date date) {
        this.date = date; }
    
    public String getSubject() {
        return subject; }
    
    public void setSubject(String subject) {
        this.subject = subject; }
    
    @Override
    public String toString() {
        String x = "";
        for (String b : to) {
            x = x + b + ";";
        }
        return "Author: " + author + "\nDate: " + date + "\nSubject: " + subject + "\nTo: " + x;
    }  
}
