#include<stdio.h>
int main()
{
  int year,m;
  scanf("%d%d",&m,&year);
  switch(m)
  {
    case 1:
      		printf("Number of days is 31");
      break;
      case 2:if(year%400==0 || (year%4==0 && year%100==0))
      		printf("Number of days is 29");
      else
        printf("Number of days is 28");
      break;
      case 3:
      		printf("Number of days is 31");
      break;
      case 4:
      		printf("Number of days is 30");
      break;
      case 5:
      		printf("Number of days is 31");
      break;
      case 6:
      		printf("Number of days is 30");
      break;
      case 7:
      		printf("Number of days is 31");
      break;
      case 8:
      		printf("Number of days is 31");
      break;
      case 9:
      		printf("Number of days is 30");
      break;
      case 10:
      		printf("Number of days is 31");
      break;
      case 11:
      		printf("Number of days is 30");
      break;
      case 12:
      		printf("Number of days is 31");
      break;
  }
  //fill your code
}