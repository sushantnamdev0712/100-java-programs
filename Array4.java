class Testarray2
{  
static void min(int x[])
{  
int min=x[0];  
for(int i=1;i<x.length;i++)  
 if(min>x[i])  
  min=x[i];  
  
System.out.println(min);  
}  
  
public static void main(String... s){  
int a[]={33,3,4,5};
min(a);
}}  

