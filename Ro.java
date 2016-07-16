/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roman;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Ro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
     int n=0,j=0;
     
     char[] d=a.toCharArray();
    
     
     if(d[j]=='X')
         n=n+10;
     else if(d[j]=='V')
             n=n+5;
     else
         n=n+1;
             
    do
     {
         j++;
         switch(d[j])
         {
             case 'X':
                 n=n+10;
                 
                  if(d[j-1]=='I')     
                 n=n-2;
                 
                      
                break;
                 //System.out.println(""+num);
             case 'V':
                  n=n+5;
                  if(d[j-1]=='I')
                n=n-2;
                  
                     
                 break;
             case 'I':
                 n=n+1;
                 break;
                 
         }
         
     }while(j<d.length-1);
     System.out.println(" Romans To Integer: "+n);
   
    
    }
}
