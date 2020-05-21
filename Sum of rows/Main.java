#include<stdio.h>
int main()
{
  //fill your code
  int m,n;
  scanf("%d %d", &m,&n);
  int a[m][n],b[m];
  for(int i=0; i<n; i++)
    for(int j=0; j<n; j++)
      scanf("%d", &a[i][j]);
  for(int i=0; i<m; i++){
    b[i]=0;
    for(int j=0; j<n; j++)
      b[i]+=a[i][j];
  }
  for(int i=0; i<m; i++)
  	printf("The sum of row %d: %d\n",i+1,b[i]);
  return 0;
}