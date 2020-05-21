#include<stdio.h>
int main()
{
  char name[20];
  int q;
  int a;
  int r;
  scanf("%s%d%d%d",name,&q,&a,&r);
  if(q>=r)
  {
    printf("The amount of %d %s is %d\n",r,name,(a*r));
  printf("Remaining number of %ss present in the stock:%d",name,(q-r));
  }
  else
    printf("Out of stock");
}