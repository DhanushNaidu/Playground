#include<stdio.h>
int main()
{
  int m;
  float a;
  scanf("%f%d",&a,&m);
  switch(m)
  {
    case 1:
      printf("Chris father needs to pay Rs.%.2f.",(a-(0.2*a)));
      break;
      case 2:
      printf("Chris father needs to pay Rs.%.2f.",(a));
      break;
      case 3:
      printf("Chris father needs to pay Rs.%.2f.",(a-(0.1*a)));
      break;
      case 4:
      printf("Chris father needs to pay Rs.%.2f.",(a-(0.1*a)));
      break;
      case 5:
      printf("Chris father needs to pay Rs.%.2f.",a);
      break;
      case 6:
      printf("Chris father needs to pay Rs.%.2f.",(a-(0.75*a)));
      break;
      case 7:
      printf("Chris father needs to pay Rs.%.2f.",(a-(0.75*a)));
      break;
      case 8:
      printf("Chris father needs to pay Rs.%.2f.",a);
      break;
      case 9:
      printf("Chris father needs to pay Rs.%d.00.",(a));
      break;
      case 10:
      printf("Chris father needs to pay Rs.%d.00.",(a-(0.3*a)));
      break;
      case 11:
      printf("Chris father needs to pay Rs.%d.00.",(a-(0.3*a)));
      break;
      case 12:
      printf("Chris father needs to pay Rs.%d.00.",(a-(0.35*a)));
      break;
             
  }
  
}