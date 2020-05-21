#include<stdio.h>
#include<math.h>
int main()
{
 int t;
  scanf("%d",&t);
  int v;
  scanf("%d",&v);
  double wcf;
  wcf=35.74+0.6215*t+(0.4275*t-35.75)*pow(v,0.16);
    printf("%0.2f",wcf);//fill your code
}