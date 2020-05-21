#include<stdio.h>
int main()
{
  int a=0,b=0;
  int c=0,d=0,e=0;
  for(;c!=-1;){
    scanf("%d",&c);
    if(c%2==0){
      d+=c;
      a++;
    } else if(c%2==1){
       b++;
      e+=c;
    }
  }
  printf("%d\n",d);
  printf("%d\n",e);
  printf("%0.2f\n",(float)(d/a));
  printf("%0.2f\n",(float)((float)e/b));
  
  //fill your code
}