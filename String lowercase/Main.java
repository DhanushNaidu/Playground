#include<stdio.h>
#include<string.h>
int main()
{
  //fill your code
  char s[10];
  gets(s);
  for (int i = 0; s[i]!='\0'; i++) {
      if(s[i] >= 'A' && s[i] <= 'Z') {
         s[i] = s[i] +32;
      }
   }
  printf("String with lowercase is %s",s);
  return 0;
}