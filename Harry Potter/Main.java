#include<stdio.h>
int main()
{
  int a;
  scanf("%d", &a);
  
  int temp1 = a%10;
  int temp2 = a/1000;
  printf("%d", temp1 + temp2);
  return 0;
}