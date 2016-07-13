/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/**
 *
 * @author sailesh
 */
public class MapEx {
    
    public Map<String,String> getStudentDetails(){
        Map<String,String> Studentmap=new HashMap();
        Studentmap.put("3","Archana");
        Studentmap.put("4","Sailesh");
        Studentmap.put("5", "Aseema");
        Studentmap.put("1", "Aruna");
      
        return Studentmap;
        
    }
    
    public static void main(String args[]){
        MapEx exmap=new MapEx();
        Map<String,String> map1=exmap.getStudentDetails();
        System.out.println(map1);
        Set<String> keys=map1.keySet();
        System.out.println(keys);
        Collection<String> name=map1.values();
        System.out.println(name);
        Iterator iterator=keys.iterator();
        System.out.println("Student Details: ");
         while(iterator.hasNext()){
             String Rollnumber=(String)iterator.next();
             System.out.println("Roll Number : "+Rollnumber+"          Name : "+map1.get(Rollnumber));
         }
      
    }
    
}
