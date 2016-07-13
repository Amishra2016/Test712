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
public class ArrayDemo {
    int[] a  ;
      
    public void StoreNumbers(){
       a=new int[101];
        for(int i=0;i<101;i++){
            a[i]=i;
        }
       }
    public void PrintEvenNumbers(){
       
        for(int i=0;i<101;i++){
            if(a[i]%2==0){
               
                
           System.out.print(a[i]+",");
            }
        }
    }
  public static void main(String args[]) {
      ArrayDemo AD=new ArrayDemo();
      AD.StoreNumbers();
      AD.PrintEvenNumbers();
  } 
}
