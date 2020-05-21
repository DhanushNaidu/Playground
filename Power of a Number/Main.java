#include<stdio.h>
int main()
{
  //fill your code
  int a,b;
  scanf("%d %d",&a,&b);
  printf("%d",pop(a,b));
  
}
int pop(int a,int b){
  if(b==0)
    return 1;
  return a*pow(a,b-1);
}