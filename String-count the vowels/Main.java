#include<stdio.h>
#include<string.h>
int main()
{
  //fill your code
  char a[10];
  gets(a);
  int vowel =0;
  for(int i =0; a[i]!='\0'; i++){
  	if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' ||
       a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U')
      vowel++;
  }
  printf("Number of vowels: %d",vowel);
  return 0;
}