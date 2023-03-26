package sec_verify12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

   public static void main(String[] args) {
      Set<Student> set = new HashSet<Student>();

      set.add(new Student("½ÅÀºÇõ", 2, 1, 70, 90, 70));
      set.add(new Student("ÀÌÇý¼÷", 2, 2, 60, 100, 80));
      set.add(new Student("È²±âÅÂ", 1, 3, 100, 100, 100));
      set.add(new Student("½Å±â¼®", 1, 1, 90, 70, 80));
      set.add(new Student("±è¿¬¾Æ", 3, 4, 80, 80, 90));
      set.add(new Student("±èÁÖ½Ä", 3, 2, 10, 80, 90));
      set.add(new Student("»ç±ºÀÚ", 3, 3, 20, 60, 99));
      set.add(new Student("½É¼öºÀ", 3, 5, 80, 70, 12));

     // System.out.println("ÃÑ °´Ã¼ ¼ö " + set.size());

      ArrayList<Student> list = new ArrayList<>(set);

      System.out.println("ÃÑ °´Ã¼¼ö : " + list.size());

      Collections.sort(list, new BanNoAscending());

      Iterator<Student> it = list.iterator();

      while (it.hasNext()) {
         System.out.println(it.next());
      }

   }

}