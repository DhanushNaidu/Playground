#include<stdio.h>
int main()
{
  //fill your code
  int n;
  scanf("%d", &n);
  int a[n][n],b[n][n];
  for(int i=0; i < n; i++)
    for(int j = 0; j < n; j++)
      scanf("%d", &a[i][j]);
  for(int i=0; i < n; i++){
    for(int j = 0; j < n; j++)
      printf("%d ", a[i][j]);
  	printf("\n");
  }
  for(int i=0; i < n; i++)
    for(int j = 0; j < n; j++)
  		b[j][i] = a[i][j];
  printf("Transpose matrix is :\n");
  for(int i=0; i < n; i++){
    for(int j = 0; j < n; j++)
      printf("%d ", b[i][j]);
  	printf("\n");
  }
}