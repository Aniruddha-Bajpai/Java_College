package String_output;

public class Test03 {
//    public static void main(String[] args) {
//        StringBuffer s2 =new StringBuffer("GLA");
//        String s1=s2.toString();
//        System.out.println(s1==s2);
//    }
public static void main(String[] args) {
    String str=new String("GLA");
    str.concat("University");
    str=str.concat(",Mathura");
    System.out.println(str);
}
}
