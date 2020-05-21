#include<stdio.h>
int main()
{
  int balls,runs,scored,in;
  scanf("%d%d%d%d",&balls,&runs,&scored,&in);
  int overs=balls/6;
  int a=in%6;
  float o=(in/6)+(a*.1);
  float rr=scored/o;
  float r=runs/(overs*1.0);
  if(r>o)
  printf("%d\n%0.1f\n%0.1f\n%0.1f\nEligible to Win",overs,o,rr,r);
  else
    printf("%d\n%0.1f\n%0.1f\n%0.1f\nNot Eligible to Win",overs,o,rr,r);
  //Fill your code
}