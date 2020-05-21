#include<stdio.h>
int main()
{
  //fill your code
  char a[100],b[50];
  gets(a);
  int j=0;
  for(int i=0; a[i]!='\0'; i++){
  	if((a[i] >='a' && a[i]<='z') ||(a[i]>='A' && a[i]<='Z'))
      b[j++]=a[i];
  }
  puts(b);
}