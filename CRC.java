import java.io.*;
class CRC
{
public static void main(String args[]) throws IOException
{
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 System.out.print("Enter the number of data bits : "); 
 int n = Integer.parseInt(br.readLine());
 System.out.print("Enter the data bits : ");
 String data = br.readLine();
 String code = data;
 System.out.println();

 System.out.print("Enter the number of generator bits : "); 
 int g = Integer.parseInt(br.readLine());
 System.out.print("Enter the generator bits : ");
 String gen = br.readLine();
 System.out.println();
 
 while(code.length() < (data.length() + gen.length() - 1))
 code = code + "0";
 System.out.println("The Appended data word is : " + code);
 System.out.println();

 String Remainder=div(code,gen);
 System.out.println("The remainder after division of appended dataword by generator bits is : " + Remainder);
 System.out.println();
 code = data + Remainder;
 System.out.println("Transmitted Code word is: " + code);
 System.out.println();

 System.out.println("At Receiver side,");
 System.out.println();
 System.out.print("Enter the code word : ");
 String rec = br.readLine();
 System.out.println();
 String rec_rem = div(rec,gen);
 System.out.println("The remainder after dividing received codeword by generator bits is : " + rec_rem);
 System.out.println();

 if(Integer.parseInt(rec_rem) == 0)
 System.out.println("As remainder is zero, received code word has no errors.");
 else
 System.out.println("As remainder is non zero, the received code word has errors.");
}

static String div(String num1,String num2)
{
 int pointer = num2.length();
 String result = num1.substring(0, pointer);
 String remainder = "";
 for(int i = 0; i < num2.length(); i++)
 {
 if(result.charAt(i) == num2.charAt(i))
 remainder += "0";
 else
 remainder += "1";
 }
 while(pointer < num1.length())
{
 if(remainder.charAt(0) == '0')
 {
 remainder = remainder.substring(1, remainder.length());
 remainder = remainder + String.valueOf(num1.charAt(pointer));
 pointer++;
 }
 result = remainder;
 remainder = "";
 if(result.charAt(0)=='0')
 {
 for(int i = 0; i < num2.length(); i++)
 {
 if(result.charAt(i) =='1')
 remainder += "1";
 else
 remainder += "0";
 }
 }
 else 
 {
 for (int i = 0; i < num2.length(); i++) {
 if (result.charAt(i) == num2.charAt(i)) {
 remainder += "0";
 } 
 else {
 remainder += "1";
 }
 }
 }
 }
 return remainder.substring(1,remainder.length());
}
}