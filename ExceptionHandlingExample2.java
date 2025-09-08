public class ExceptionHandlingExample2{
public static void main(String args[]){
try{
int []arr1={1,2,3,4,5,6};
System.out.println(arr1[6]);
}
catch(Exception e){
System.out.println("You are trying to access the index out of array size."+e);
}
}
}