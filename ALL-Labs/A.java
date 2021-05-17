
public class A {
public void speak() {
System.out.println("Hello from A");
}
public void speak(String s) { 
this.speak();
System.out.println(s);
} }
public class B extends A { 
public void speak() {
System.out.println("Hello from B");
} }
public class MyApp {
public static void main(String [] args) {

A alpha;
alpha = new A();
 alpha.speak(); 
 alpha.speak("rhubarb");
alpha = new B(); 
alpha.speak(); 
alpha.speak("rhubarb");
}}


