#include<stdio.h>
int main()
{
  //fill your code
  int m,n;
  scanf("%d %d",&m,&n);
  int a[m][n],b[n];
  for(int i=0; i<m; i++)
    for(int j=0; j<n; j++)
      scanf("%d",&a[i][j]);
  for(int i=0; i<n; i++){
    b[i] =a[0][i];
    for(int j=0; j<m; j++){
      if(a[j][i] > b[i])
        b[i] = a[j][i];
    }
  }
   for(int i = 0; i<m; i++)
     printf("%d\n",b[i]);
}