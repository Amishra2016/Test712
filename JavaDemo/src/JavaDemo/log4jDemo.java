package JavaDemo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.apache.log4j.Logger;

import java.io.*;
import java.sql.SQLException;


public class log4jDemo{

   /* Get actual class name to be printed on */
   static Logger log = Logger.getLogger(log4jDemo.class);
   
   public static void main(String[] args)throws IOException,SQLException{
      log.debug("Hello this is a debug message");
      log.info("Hello this is an info message");
   }
}