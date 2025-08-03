/** Write a Program to accept two integers as command line arguments and print the sum of the two numbers

Example1)
C:\>java Sample 10 20
O/P Expected : The sum of 10 and 20 is 30**/
class main{
public static void main(String[] args){
if(args.length>1){
int tot=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
System.out.println("the sum of "+args[0]+" and "+args[1]+" is "+tot);}
else{
System.out.println("not found");}
}}
