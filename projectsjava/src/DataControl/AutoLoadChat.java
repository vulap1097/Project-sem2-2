/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataControl;

import Frame.formchinh;
import static Frame.formchinh.txtnamefriend;
import Frame.loginForm;
import Util.ConnectionSQL;
import Util.ketnoi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author truon
 */
public class AutoLoadChat extends Thread {
    private String sql,user,friend, content;
    private int idu, idf;
    private loginForm lg;
    private ConnectionSQL kn;
  
    
    @Override
    public void run() {
      while(true){
          Loaddata();
          try{
              Thread.sleep(500);
          }catch(Exception e){
              System.out.print(e);
          }
      }
    }
    
   public void Loaddata(){
       kn= new ConnectionSQL();
       user=formchinh.userName;
       friend= formchinh.CurrentFriend;
       
       sql="select idu  from username where taikhoan='"+user+"'";
       ResultSet rs;
       rs= kn.Query(sql);
        try {
            while(rs.next()){
                idu=rs.getInt("idu");
            } } catch (SQLException ex) {
            Logger.getLogger(AutoLoadChat.class.getName()).log(Level.SEVERE, null, ex);
        }
        // lay idu cua friend trong bang taikhoan
       sql="select idu from username where taikhoan='"+friend+"'";
       rs=kn.Query(sql);
       try {
            while(rs.next()){
                idf=rs.getInt("idu");
            } } catch (SQLException ex) {
            Logger.getLogger(AutoLoadChat.class.getName()).log(Level.SEVERE, null, ex);
        }
       // su dung 2 idu de lay ra content tai bang connectuf*/
       sql="select contentchat from connectuf where idu="+idu+" and idf="+idf+"";
       rs= kn.Query(sql);
       // lay content va load len o noi dung chat chinh 
       try {
            while(rs.next()){
                content=rs.getString("contentchat");
                formchinh.txttext.setText(content);
            }} catch (SQLException ex) {
            Logger.getLogger(AutoLoadChat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
 }
