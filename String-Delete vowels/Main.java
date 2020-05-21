#include<stdio.h>
#include<string.h>
int main()
{
  //fill your code
  char a[10],b[10];
  int j=0;
  gets(a);
  for(int i = 0; a[i] != '\0' ; i++){
  	if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' ||
       a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U')
      continue;
    b[j++] = a[i];
  }
  printf("%s",b);
  return 0;
}