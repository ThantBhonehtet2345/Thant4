package JWD;

import java.util.ArrayList;
import java.util.Iterator;
public class E5 {

public static void main(String []args) {
ArrayList<Integer>  list=new ArrayList<>();
for(int i=1;i<=10;i++)
list.add(i);

Iterator<Integer>itr=list.iterator();
while(itr.hasNext()) {

if(itr.next()%2==0)
itr.remove();

}
System.out.println(list);

}

}