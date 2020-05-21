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
 for(int i=0; a[i]!='\0'; i++){
    int c = a[i]-97;
    if(b[c]==1){
      j=1;
      printf("%c",a[i]);
      break;
    }
 }
  if(j==0)
    printf("All characters are repetitive");
}