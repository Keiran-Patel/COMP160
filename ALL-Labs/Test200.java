public class Test200{
public static void main (strng [] args){

int [] nums = {4,7,9,11,14,22,24,27,31}
boolean isprime;

for(int n : nums){
isprime = true;
for(int i=2, i<n;i++){
   if(n%i==0){
   isprime = false;
}
}
if(isprime== true){
system.out.println(n+ "is prime");
}
 else{
 system.outprintln(n+"is not a prime");
 }
 }
 }
 public void numbers(int a, String b){

for(int i=1;i<11;i++){
   if(b.equals("*")){
   system.out.print(a*i)
   }
   if(b.equals("/")){
   system.out.print(a/i);
   else{
  system.out.print("invalid operator");
  }

}

}


 
 
 
 
 }