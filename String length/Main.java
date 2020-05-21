#include<stdio.h>
#include<string.h>
int main()
{
  //fill your code
  char a[10];
  gets(a);
  int b = strlen(a);
  printf("The length of %s is %d",a,b);
  return 0;
}