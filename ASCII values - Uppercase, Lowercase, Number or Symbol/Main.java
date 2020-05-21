#include<stdio.h>
int main()
{
  char a;
  scanf("%c",&a);
  if((a>='A' && a<='Z'))
    printf("Upper");
  else if((a>='a' && a<='z'))
    printf("Lower");
  else
    printf("Symbol");
  //Fill your code
}