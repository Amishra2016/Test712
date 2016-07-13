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
public class junforteenth {
    
    private int age;
    private String maritalstatus;
    private String phonenumber;

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the maritalstatus
     */
    public String getMaritalstatus() {
        return maritalstatus;
    }

    /**
     * @param maritalstatus the maritalstatus to set
     */
    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    /**
     * @return the phonenumber
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * @param phonenumber the phonenumber to set
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    public static void main(String args[]){
        junforteenth Anonymous=new junforteenth();
        Anonymous.setAge(27);
        Anonymous.setMaritalstatus("married");
        Anonymous.setPhonenumber("2402913464");
        
        System.out.println("the Anonymous profile details is "+Anonymous.getAge()+"\n"+Anonymous.getMaritalstatus()+"\n"+Anonymous.getPhonenumber());
        
    }
    }
