
public class Lab21App{
public static void main(String [] args){
A a1 = new C(64, "Red", "Blue"); }
}
public class A{ protected int i, y;
public A (int i){ this(i, 10);
}
public A (int i, int j){ this.i = i;
y = i / j * j; }
public String showRounded(){ return "i is above " + y);
} }
public class C extends B{ private int x;
private String a;
public C (int x, String a, String s){
this.x = x;
this.a = a;
super(s, x);
s = "Green";
System.out.println(" x is " + x); System.out.println(" a is " + a); System.out.println(" s is " + super.s); System.out.println(" s is " + getS()); System.out.println(" s is " + s); System.out.println(" y is " + y);
System.out.println(showRounded()); }
}
 public class B extends A{ private String s;
public B(String s, int x){ super(x * 2);
this.s = s;
}
public String getS(){
return s; }
}