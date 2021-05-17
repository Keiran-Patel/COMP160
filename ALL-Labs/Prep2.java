import java.text.DecimalFormat;
public class Prep2{
public static void main (String[]args){
DecimalFormat f1 = new DecimalFormat();
f1.setMaximumFractionDigits(3);
System.out.println(Math.PI); // print pi in default format
System.out.println(f1.format(Math.PI)); //inspecifiedformat
}
}
