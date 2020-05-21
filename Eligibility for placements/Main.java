#include<stdio.h>
int main()
{
  char name[20];
  int roll,arr;
  float cgpa;
  scanf("%s%d%f%d",name,&roll,&cgpa,&arr);
  if((cgpa>=7.0 && cgpa<7.5 &&(arr==0)) || (cgpa>=7.5 &&(arr<=2)))
    printf("%s\n%d\nEligible to attend placement",name,roll);
  else
    printf("%s\n%d\nNot Eligible to attend placement",name,roll);
  //fill your code
}