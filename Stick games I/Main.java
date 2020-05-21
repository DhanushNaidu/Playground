#include<stdio.h>
int main()
{
  //fill your code
  int m, n;
  scanf("%d %d", &m, &n);
  int sum = m + n;
  int r = sum/2;
  if(r%2 == 0){
  	printf("Mani Iyer");
  }
  else
    printf("Arun Gupta");
  return 0;
}