#include<stdio.h>
int main()
{
  //fill your code
  char a[100];
  gets(a);
  int v=0,c=0,w=0,d=0,s=0;
  for(int i=0; a[i] != '\0'; i++){
  	if((a[i]>='a' && a[i]<='z') || (a[i]>='A' && a[i]<='Z')){
    	if(a[i]=='a'|| a[i]=='e'|| a[i]=='i'|| a[i]=='o'|| a[i]=='u'||
           a[i]=='A'|| a[i]=='E'|| a[i]=='I'|| a[i]=='O'|| a[i]=='U')
          v++;
      else
        c++;
    }
    else if(a[i]>='0' && a[i]<='9')
      d++;
    else if(a[i]==' ')
        w++;
    else
        s++;
  }
  printf("Vowels:%d\nConsonants:%d\nWhite Spaces:%d\nDigits:%d\nSymbols:%d\n",v,c,w,d,s);
}
