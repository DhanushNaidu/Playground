#include<stdio.h>
#include<string.h>
int main()
{
  //fill your code
  char a[10], b[10];
  gets(a);
  gets(b);
  printf("The concatenated string is %s",strcat(a,b));
  return 0;
}