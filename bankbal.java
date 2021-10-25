abstract class Bank{                                   //abstract class
public abstract void getbalance();                           //abstract method
}
class BankA extends Bank{                          //BankA is a subclass of class Bank
public void getbalance(){
System.out.println(" Balance of Bank A = 100");             //Body of abstract method
}
}
class BankB extends Bank{                             //BankB is a subclass of class Bank
public void getbalance(){
System.out.println(" Balance of Bank B= 150");                 //Body of abstract method
}
}
class BankC extends Bank{                                            //BankC is a subclass ofclass Bank
public void getbalance(){
System.out.println(" Balance of Bank C= 200");                //Body of abstract method
}
}
public class bankbal{
public static void main (String[ ] args){
BankA a=new BankA();
BankB b=new BankB();                                     //objects of inherited class
BankC c=new BankC();
a.getbalance();
b.getbalance();
c.getbalance();
}
}