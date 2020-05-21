#include<stdio.h>
int main()
{
  //fill your code
  int m,n;
  scanf("%d %d",&m,&n);
  int a[m][n],b[m];
  for(int i=0; i<m; i++)
    for(int j=0; j<n; j++)
      scanf("%d",&a[i][j]);
  for(int i=0; i<m; i++){
    b[i] =a[i][0];
    for(int j=0; j<n; j++){
      if(a[i][j] > b[i])
        b[i] = a[i][j];
    }
  }
   for(int i = 0; i<m; i++)
     printf("%d\n",b[i]);
}