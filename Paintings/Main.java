#include<stdio.h>
int main()
{
  int a,a1,b,b1,c,c1;
  scanf("%d%d%d%d%d%d",&a,&a1,&b,&b1,&c,&c1);
  if(((b+c)<=a) &&((b1+c1)<=a1))
    printf("Raj can fix both painting");
  else
    printf("Raj cannot fix both painting");
  //fill your code
}