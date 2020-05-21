#include<stdio.h>
#include<math.h>
int main()
{
  //Fill your code
  int a;
  scanf("%d",&a);
  int b= a;
  int d= sqrt(a);
  for(int c = d; 1 <= c; c=c/d){
   // printf(" b = %d, c = %d\n",b,c);
    b = b + c;
  }
  printf("%d",b);
}