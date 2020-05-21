#include<stdio.h>
int main()
{
  //fill your code
  int n;
  scanf("%d", &n);
  int a[n][n];
  for(int i=0; i<n; i++)
    for(int j=0; j<n; j++)
      scanf("%d", &a[i][j]);
  int flag =1;
  for(int i=0; i<n; i++)
    for(int j=0; j<n; j++)
      if(i<j)
        if(a[i][j] > 0)
          flag = 0;
  if(flag = 1)
  	printf("Lower triangular matrix");
  return 0;
}