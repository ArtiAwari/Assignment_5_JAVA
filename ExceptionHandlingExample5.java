//NullPointerException Handling
class ExceptionHandlingExample5{
public static void main (String args[]){
try{
String s=null;
System.out.println("Length of a string is:"+s.length());
}
catch(Exception e){
System.out.println("you cannot find length of empty string---"+e);
}
}
}