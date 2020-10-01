/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vertebrados;


public class Vertebrados {
    static String sv1,sv2,sv3,bv1;
    static BRAnimales objBS= new BRAnimales();
    public static void main(String[] args) {
        
        sv1=objBS.getVertebrado("no","no","no","no");
        System.out.println("Encadenamiento hacia adelante V1: "+sv1);
        
        sv2=objBS.getVertebrado2(sv1,"no","no","no","no","no","no","no","no","no","si","no","no","no","no");
        System.out.println("Encadenamiento hacia adelante V2: "+sv2);
        
        sv3=objBS.getVertebrado3(sv2,"si","no");
        System.out.println("Encadenamiento hacia adelante V3: "+sv3);
       
           }
    
}
