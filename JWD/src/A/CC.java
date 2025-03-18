package A;
import B.BB;
public class CC {
public static void main(String []args) {
AA ab=new AA();
ab.defaultMethod();
ab.protectedMethod();
ab.publicMethod();
BB ba=new BB();
ba.publicMethod();
}
}