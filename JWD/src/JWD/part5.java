package JWD;

import java.util.ArrayList;
import java.util.List;


public class part5 {

  
    public static void main (String[] args) {
      List<Object> lst = new ArrayList<Object>();
      lst.add('1');
      lst.add('c');
      lst.add(true);
      lst.add(2.3);
      lst.add("java");
      System.out.println(lst);
      lst.add(new Employee());
      System.out.println(lst);
      System.out.println(lst.get(1));
      lst.get(3);
      double number=(double) lst.get(3);
    }
  }
