package test;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import org.junit.Assert;

import code.*;
public class UnitTest {


   @Test
   public void testreverse() {	
      LinkedList<LinkedList<Integer>> list2 = new LinkedList<>();
      LinkedList<Integer> li = new LinkedList<>();
      li.addFirst(1);
      li.addLast(2);

      LinkedList<Integer> li2 = new LinkedList<>();
      li2.addFirst(3);
      li2.addLast(4);
      list2.addFirst(li);
      list2.addLast(li2);
  
      list2.reverse();
     

      assertEquals(list2.getFirst(),li2); 
      assertEquals(list2.getLast(),li);    
   }

   @Test
   public void testEmpty() throws Exception {
      LinkedList<LinkedList<Integer>> list2 = new LinkedList<>();

      //check removeFirst
      int flag = 0;
      try {
         list2.removeFirst();
      } catch(Exception e) {
         flag = 1;
      }
      assertEquals(flag,1);

      //check remove last
      int flag2 = 0;
      try {
         list2.removeLast();
      } catch(Exception e) {
         flag2 = 1;
      }
      assertEquals(flag2,1);


      //check if it throws error if the list is not empty
      LinkedList<Integer> li = new LinkedList<>();
      list2.addFirst(li);

      flag = 0;
      try {
         list2.removeFirst();
      } catch(Exception e) {
         flag = 1;
      }
      assertEquals(flag,0);
     
   }

   @Test
   public void testGet() throws Exception{
      LinkedList<Integer> list2 = new LinkedList<>();
      list2.addFirst(2);
      list2.addLast(3);

      // test getFirst
      int res = list2.getFirst();
      assertEquals(res, 2);

      //test getLast
      res = list2.getLast();
      assertEquals(res, 3);

      list2.addFirst(4);
      res = list2.getFirst();
      assertEquals(res, 4);

      //test remove functions with get functions
      list2.removeLast();
      res = list2.getLast();
      assertEquals(res, 2);

      list2.removeFirst();
      res = list2.getFirst();
      assertEquals(res, 2);








   }




public static void main(String[] args) {
    //
}
}
