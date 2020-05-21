#include<stdio.h>
int main()
{
  int r,h,w,hour;
  scanf("%d%d%d%d",&r,&h,&w,&hour);
  float volume=3.14*3.14*r*h;
  float volume2=w*hour*1.0;
  if(volume2>=volume)
    printf("The tank can be filled within %d.0 hours",hour);
  else
    printf("The tank cannot be filled within %d.0 hours",hour);
  //fill your code
}