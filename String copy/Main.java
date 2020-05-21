#include<stdio.h>
#include<string.h>
int main()
{
  //fill your code
  char a[10], b[10];
  gets(a);
  strcpy(b,a);
  printf("The copied string is %s.",b);
  return 0;
}