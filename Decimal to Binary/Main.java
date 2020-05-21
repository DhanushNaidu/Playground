#include<stdio.h>
int conv(int);
int main()
{
  //fill your code
  int a;
  scanf("%d",&a);
  printf("%d",conv(a));
}
int conv(int n){
  int res=0;
 while((n/2)>=0.5){
   if(n%2==0)
     res= 10*res+1;
   else
     res=10*res;
   n/=2;
 }
  if(n==0)
    res=10*res+1;
  else
    res=10*res;
  return res;
}