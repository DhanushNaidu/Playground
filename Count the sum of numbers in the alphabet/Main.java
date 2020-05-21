#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main()
{
  //fill the code
  char a[10];
  gets(a);
  int b=strlen(a);
  int sum=0;
  for(int i =0; i<b;){
    char b[10];
    int j=0,numfo=0,x=0;
  	while(a[i]>='0' && a[i] <= '9'){
    	b[j++] = a[i++];
      numfo = 1;
    }
    if(numfo==1){
      numfo=0;
    	x = atoi(b);
    	sum += x;
    	j=0;
    }
    i++;
  }
  printf("%d",sum);
  return 0;
}