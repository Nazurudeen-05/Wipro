/** Write a Program to accept a String as a command line argument and print a Welcome message as given below.

Example1)
C:\> java Sample John
O/P Expected : Welcome John**/
class main{
public static void main(String[] args){
if(args.length>0){

System.out.println("WELCOME"+args[0]);}
else{
System.out.println("not found");}
}}
