#include<stdio.h>
int main()
{
  //fill your code
  int a;
  scanf("%d",&a);
  printf("%d",sum(a));
}
int sum(int n){
  if(n==0)
    return 0;
  if(n==1)
    return 1;
  return n+sum(n-1);
}