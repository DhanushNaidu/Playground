#include<stdio.h>
int main()
{
  //fill your code
  char a[10],b[10];
  gets(a);
  gets(b);
  printf("Strings are ");
  strcmp(a,b)?printf("not same"):printf("same");
  return 0; 
}