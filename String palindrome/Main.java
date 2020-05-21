#include<stdio.h>
#include<string.h>
int main()
{
  //fill your code
  char a[10];
  gets(a);
  int b= strlen(a)-1;
  int c=1;
  for (int i = 0; i<=b; i++) {
      if(a[i]!=a[b--])
        c=0;
   }
  (c==0)?printf("Not a Palindrome"):printf("Palindrome");
  return 0;
}