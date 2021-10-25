import java.util.*;

class Student                                               //parent class Student
{
public String name="anu";
public int roll_no=45;
}

class Marks extends Student                                 //Class Marks extending parent class Student
{
public double sub1=90;
public double sub2=80;
public void display()
{
System.out.println("Total Score scored by "+name+" :"+(sub1+sub2));
}
}

class Result extends Student                                //Class Result extending parent class Student
{
public void cal()
{
System.out.println("Name :"+name);
System.out.println("Roll No :"+roll_no);
}
}

class Heirarchy
{
public static void main(String[] args)
{
Result r=new Result();
Marks m=new Marks();
r.cal();
m.display();
}
}