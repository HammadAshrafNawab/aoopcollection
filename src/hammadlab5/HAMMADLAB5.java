/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//COLLECTIONS
package hammadlab5;
import java.util.*;
/**
 *
 * @author student
 */
public class HAMMADLAB5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Mujtaba");
        list.add("MURTAZA");
        list.add("HAMMAD");
        
     // Iterator itr=list.iterator();
       /* while(itr.hasNext())
        {
        System.out.println(itr.next());    
        }
        */
     /*  for(String obj:list)
       {
       System.out.println(obj);
       }
       */
    /*  ArrayList<String> list2 = new ArrayList<String>();
      list2.add("GILO");
        list2.add("SHAKO");
        list2.add("DODA");
        list.addAll(list2);
          Iterator itr=list.iterator();
        while(itr.hasNext())
        {
        System.out.println(itr.next());    
        }
      */
    //list.removeAll(list2);
    
  /*  Collections.sort(list);
      Iterator itr=list.iterator();
        while(itr.hasNext())
        {
        System.out.println(itr.next());    
        }
*/
 /* Collections.sort(list);
  Collections.reverse(list);
      Iterator itr=list.iterator();
        while(itr.hasNext())
        {
        System.out.println(itr.next());    
        }
  */
  /* Collections.shuffle(list);
      Iterator itr=list.iterator();
        while(itr.hasNext())
        {
        System.out.println(itr.next());    
        }
*/
  /*Collections.fill(list,"ASHRAF");
  System.out.println(list);
*/
 /* 
  ArrayList<String> list2 = new ArrayList<String>();
      list2.add("GILO");
        list2.add("SHAKO");
        list2.add("DODA");
        Collections.copy(list2,list);
          
        
        
        System.out.println(list);    
       
  */
/* int frequency = Collections.frequency(list,"HAMMAD");
System.out.println(frequency);
*/
/*
System.out.println(Collections.min(list));
*/
/* ArrayList<String> list2 = new ArrayList<String>();
      list2.add("GILO");
        list2.add("SHAKO");
        list2.add("DODA");
       Collections.disjoint(list, list2);
        boolean disjoint = Collections.disjoint(list,list2); 
        System.out.println(disjoint);
*/

}
    
}
