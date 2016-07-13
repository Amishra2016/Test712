/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDemo;

/**
 *
 * @author sailesh
 */
public class AccessFBProfile {
    
    public static void main(String args[]){
        junforteenth Anonymous=new junforteenth();
        Anonymous.setAge(27);
        Anonymous.setMaritalstatus("married");
        Anonymous.setPhonenumber("2402913464");
        
        System.out.println("the Anonymous profile details is "+Anonymous.getAge()+"\n"+Anonymous.getMaritalstatus()+"\n"+Anonymous.getPhonenumber());
        
    }
}
