/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testengine;

import java.util.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Er. Ved Prakash Arya
 */
public class Calander {
    String formDate, formTime;
   public void timeDisplay(){
    Thread clock = new Thread(){
          public void run(){

              for (;;){
                 Date d = new Date();
                 int hr ,min,sec ;
                 hr= d.getHours();
                 min= d.getMinutes();
                 sec = d.getSeconds();
              formTime=("Time:- "+(hr+":")+(min+":")+(sec+"")); 
              try{
                  sleep(1000);
              }
              catch(Exception ex){
                  System.out.print("Error"+ex);
              }
              }
          }
          
      };
        clock.start();
    }
    
    public void dateDisplay(){
          GregorianCalendar date = new GregorianCalendar();
        int yr,day,mon;
        day= date.get(Calendar.DAY_OF_MONTH);
      
        mon= date.get(Calendar.MONTH);
        yr= date.get(Calendar.YEAR);
        mon++;
        formDate=("Date:- "+(day+"-")+(mon+"-")+(yr+""));
     } 
}
