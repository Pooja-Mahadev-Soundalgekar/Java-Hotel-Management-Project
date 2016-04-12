/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaminiproject1;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author admin
 */
public class Per implements Serializable {
    String name;
    String emailid;
    String password;
    String cimonth,ciyear,cidate;
    String comonth,coyear,codate;
    String deluxe;
    String grand;
    String regular;
    int totalsum;
    public int city;
   // int hasBooked=0;
    Per()
    {
        name=null;
        emailid=null;
        password=null;
        cimonth=null;
        cimonth=ciyear=cidate=null;
        comonth=coyear=codate=null;
        deluxe="0";
        grand="0";
        regular="0";
        totalsum=0;
        city=0;
    }
    void signup(String name,String emailid, String password) {
        
        this.name=name;
        this.emailid=emailid;
        this.password=password;
        
    }
    void setrooms(String deluxe,String regular,String grand)
    {
        this.deluxe=deluxe;
        this.regular=regular;
        this.grand=grand;
    }
    void setdates(String cidate,String cimonth,String ciyear,String codate,String comonth,String coyear)
    {
        this.cidate=cidate;
        this.cimonth=cimonth;
        this.ciyear=ciyear;
        this.codate=codate;
        this.comonth=comonth;
        this.coyear=coyear;
    }
    String getname()
    {
        return this.name;
    }
    String getpassword()
    {  
        return this.password;
    }
    String getemail()
    {  
        return this.emailid;
    }
    String getcidate()
    {  
        return this.cidate;
    }
    String getcimonth()
    {  
        return this.cimonth;
    }
    String getciyear()
    {  
        return this.ciyear;
    }
    String getcodate()
    {  
        return this.codate;
    }
    String getcomonth()
    {  
        return this.comonth;
    }
    String getcoyear()
    {  
        return this.coyear;
    }
    String getdeluxe(){
       return this.deluxe;
    }
    
    String getregular(){
        return this.regular;
    }
    
    String getgrand(){
        return this.grand;
    }
     
    Integer getsum(int regular,int grand,int deluxe){
        totalsum=(int) (regular*2000+grand*10000+deluxe*5000);
        return(totalsum);
    }
    int getamount()
    {return totalsum;}
    int getcity()
    {
        return city;
    }
   
}

