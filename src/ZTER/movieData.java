/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZTER;

import java.util.Date;

/**
 *
 * @author haseena
 */
public class movieData {
    
    private final String Movietitle;
    private final String Genre;
    private final String Duration;
    private final String image;
    private final Date PublishDate;
    
    public movieData(String Movietitle,String Genre,String Duration,String image,Date PublishDate)
    {
        this.Movietitle=Movietitle;
        this.Genre=Genre;
        this.Duration=Duration;
        this.PublishDate=PublishDate;
        this.image=image;
    }
    
    public String gettitle(){
        return Movietitle;
    }
    
    public String getGenre(){
        return Genre;
    }
    public String getDuration(){
        return Duration;
    }
    public String getimage(){
        return image;
    }
    public Date getdata(){
        return PublishDate;
        
    }
    
    
}
