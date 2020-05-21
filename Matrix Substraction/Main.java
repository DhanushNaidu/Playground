#include<stdio.h>
int main()
{
  //fill your code
  int m, n;
  scanf("%d %d", &m, &n);
  int a[m][n], b[m][n];
  for(int i = 0; i<m; i++)
    for(int j = 0; j< n; j++)
      scanf("%d", &a[i][j]);
  for(int i = 0; i<m; i++)
    for(int j = 0; j < n; j++)
      scanf("%d", &b[i][j]);
  for(int i = 0; i<m; i++)
    for(int j = 0; j < n; j++)
      b[i][j] -= a[i][j];
  printf("The Result is:\n");
  for(int i = 0; i<m; i++){
    for(int j = 0; j < n; j++)
      printf("%d ",b[i][j]);
    printf("\n");
  }
}