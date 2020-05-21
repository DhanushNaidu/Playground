#include<stdio.h>
#include<string.h>
int main()
{
  //fill your code
  char s[10];
  gets(s);
  for (int i = 0; s[i]!='\0'; i++) {
      if(s[i] >= 'a' && s[i] <= 'z') {
         s[i] = s[i] -32;
      }
   }
  printf("String in uppercase is %s",s);
  return 0;
}