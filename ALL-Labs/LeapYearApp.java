public class LeapYearApp{
public static void main (String[]args){

//call the years five times
leapYear(2019);
leapYear(2020);
leapYear(1900);
leapYear(2000);
leapYear(1565);

}

public static void leapYear (int y){

if (y > 1582){

if (y%4==0 && y%400==0 && y%100==0){

System.out.println(y+": is a leap year");
}
else if (y%4== 0 && y % 100 == 0 && y % 400 != 0 || y % 4 != 0) 
System.out.println(y+": is not a leap year");

}

else if (y%4== 0){

System.out.println(y+": is a leap year");
}


else {
System.out.println(y+": predates the Gregorian calendar");
}
}
}





