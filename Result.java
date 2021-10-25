import java.util.*;
class Student
{
public String name="anu";
public int roll_no=45;
}
class Marks extends Student
{
public double sub1=90;
public double sub2=80;
}
class Result extends Student
{
public void cal()
{
System.out.println("Name :"+name);
System.out.println("Roll No :"+roll_no);
//System.out.println("Total Score :"+sub1+sub2);
}
}
class Heirarchy
{
public static void main(String[] args)
{
Result r=new Result();
r.cal();
}
}