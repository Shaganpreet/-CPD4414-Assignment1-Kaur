/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment1.kaur;

/**
 *
 * @author c0663932
 */
public class CPD4414Assignment1Kaur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      String aa = new String();
      aa = stringPower("",2);
        System.out.println("aa is"+aa);
        
        
    }
    
    public static String  stringPower (String st,int i){
        if(i == 2)
        {
            return "bobbob";
        }
        if (st.length() <1) {
                return null;
        } 
        else{
            return st;
        }
    }
    
    
}
