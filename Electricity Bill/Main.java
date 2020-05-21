#include<stdio.h>
int main()
{
  int a,sum=0;
  scanf("%d",&a);
  if(a>=0 && a<=200)
   sum=0.5*a;
  else if(a<=400)
  	sum=ceil((0.65*a)+100);
  else if(a<=600)
    sum=200+(0.8*a);
  else
    sum=400+(a*1.25);
  printf("Rs.%d",sum);
  //fill your code
}