#include<stdio.h>
int main()
{
  //fill your code
  int m,n;
  scanf("%d %d", &m,&n);
  int a[m][n],b[n];
  for(int i=0; i<n; i++)
    for(int j=0; j<n; j++)
      scanf("%d", &a[i][j]);
  for(int i=0; i<n; i++){
    b[i]=0;
    for(int j=0; j<m; j++)
      b[i]+=a[j][i];
  }
  for(int i=0; i<n; i++)
  	printf("The sum of column %d: %d\n",i+1,b[i]);
  return 0;
}