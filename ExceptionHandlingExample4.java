//NumberFormat Exception Handling
public class ExceptionHandlingExample4{
public static void main(String args[]){
try{
String s="Reva";
int n=Integer.parseInt(s);
System.out.println(n);
}
catch(Exception e){
System.out.println("Invalis string convert to Integer:----"+e);
}
}
}