#include<stdio.h>
int main()
{
  //fill your code
  int m,n;
  scanf("%d %d", &m,&n);
  int a[m][n],sum=0;
  for(int i=0; i<m; i++)
    for(int j=0; j<n; j++)
      scanf("%d",&a[i][j]);
  
   for(int i=0; i<m; i++){
    for(int j=0; j<n; j++){
    	if(i==0 || (i+1 == m))
          sum += a[i][j];
      	else if(j+i+1 == n)
          sum += a[i][j];
          
    }
   }
   printf("Sum of Zig-Zag pattern is %d\n", sum);
}