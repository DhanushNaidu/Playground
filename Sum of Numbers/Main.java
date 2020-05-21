#include<stdio.h>
int main()
{int x,s;
  do{scanf("%d",&x);
    s=x+s;
  }while(x!=-1);
 printf("%d",s+1);
}