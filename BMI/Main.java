#include<stdio.h>
int main()
{
  int w,h;
  scanf("%d%d",&w,&h);
  float m=(h*h)/10000.0;
  float bmi=w/m;
  if(bmi<18.5)
    printf("You are underweight. Have an apple daily.");
  else if(bmi>=18.5 && bmi<25)
    printf("You are normal. Go walking daily and maintain it.");
    else if(bmi>=25)
      printf("You are obese. Go to doctor");
  //fill your code
}