#include<stdio.h>
int main()
{
  //fill your code
  char a[100],b[26]={};
  gets(a);
  int j=0;
  for(int i=0; a[i]!='\0'; i++){
  	int c = a[i]-97;
    b[c]++;
  }
  for(int i = 0; i<26;i++){
  	if(b[i] >0)
    	printf("%c %d\n",'a'+i,b[i]);
  }
}