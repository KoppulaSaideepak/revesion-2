import java.util.Scanner;
class switch_pattern{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int x,y,i,j,coef = 1;

System.out.print("Enter choice:");
y=sc.nextInt();
switch (y){
case 1:
    try{
       System.out.print("Enter the number:");
        x=sc.nextInt();
        for(i=0;i<x;i++){
        for(j=0;j<i+1;j++){
        System.out.print(i+1);

}
System.out.print("\n");

}
}
catch(Exception e)
{
System.out.print("Enter valid input");
}
break;
case 2:
try{
    System.out.print("Enter the number:");
    x=sc.nextInt();
    System.out.println("1");
    System.out.println("4   9");
    System.out.println("16  25  36");
    System.out.println("49  64 81");
    System.out.println("100");

}
catch(Exception e)
{
System.out.print("Enter valid input");
}
break;
case 3:
try{
     System.out.print("Enter the number:");
     x=sc.nextInt();
     for(i = 0; i < x; i++) {
     for(int space = 1; space < x - i; ++space) {
        System.out.print("  ");
      }

      for( j = 0; j <= i; j++) {
        if (j == 0 || i == 0)
          coef = 1;
        else
          coef = coef * (i - j + 1) / j;

        System.out.printf("%4d", coef);
      }

      System.out.println();
    }
}
catch(Exception e)
{
System.out.print("Enter valid input");
}
break;
case 4:
try{
    System.out.print("Enter the number:");
    x=sc.nextInt();
    for (i= 0; i<= x-1; i++)  
   {  
   for (j=0; j<=i; j++)   
   {  
   System.out.print("1"+ " ");  
   }   
   System.out.println("");   
   }   
   for (i=x-1; i>=0; i--)  
   {  
   for(j=0; j <= i-1;j++)  
   {  
   System.out.print("1"+ " ");  
   }  
   System.out.println("");  
    }}
catch(Exception e)
{
System.out.print("Enter valid input");
}
break;
    
default:
      System.out.println("Invalid");
}
}



}
