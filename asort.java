import java.util.Scanner;
import java.util.Arrays;
class asort
{

static void userdif(String str[], int length)
{
int i,j;
String temp;
for (i=0;i<length;i++)
for (j=i+1;j<length;j++)
if (str[i].compareTo(str[j]) > 0)
{
temp=str[i];
str[i]=str[j];
str[j]=temp;
}
}

public static void main(String args[]){

int i,opt;

System.out.println("enter length of string:");
Scanner sc=new Scanner(System.in);
int length = sc.nextInt();
System.out.println("enter the string:");
String[] str=new String[length];

for(i=0;i<length;i++)
str[i]=sc.next();


while(true)
{
System.out.println("\n1.user defined sort \n 2.built-in sort \n 3.display \n 4.exit");
System.out.println("enter your choice:");
opt=sc.nextInt();
switch(opt)
{
case 1: userdif(str,length);
        break;
        
case 2: Arrays.sort(str);
        break;
        
case 3: for(i=0;i<length;i++)
        System.out.print(str[i]+"\t");
        break;
        
case 4: System.exit(0);
}

}
}
}

