public class Count{
public static void main(String [] args){
String a = ("I live at 3/35 Chain St, Dunedin 9053");
int count = 0; 
for(int i=0;i<=a.length();i++)
{
if(a.charAt(i) == "i")
count++;
{
System.out.println("I has appeared "+ count +" times");
}
}
}
}
