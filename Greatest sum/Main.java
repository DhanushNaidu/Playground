#include<stdio.h>
int main()
{
  //fill your code
  int m,n;
  scanf("%d %d", &m,&n);
  int a[m][n],b[m],c[n];
  for(int i=0; i<n; i++)
    for(int j=0; j<n; j++)
      scanf("%d", &a[i][j]);
  for(int i=0; i<m; i++){
    b[i]=0;
    for(int j=0; j<n; j++)
      b[i]+=a[i][j];
  }
  printf("Sum of rows is ");
  for(int i=0; i<m; i++)
  	printf("%d ",b[i]);
 int maxr,maxc,posr,posc;
  maxr = b[0];
  posr =1;
  for(int i=0; i<m; i++){
    if(b[i]>maxr){
    	maxr = b[i];
      posr = i+1;
    }
  }
  printf("\nRow %d has maximum sum \n",posr);
  for(int i=0; i<n; i++){
    c[i]=0;
    for(int j=0; j<m; j++)
      c[i]+=a[j][i];
  }
  printf("Sum of columns is ");
  for(int i=0; i<n; i++)
  	printf("%d ",c[i]);
  maxc = c[0];
  posc =1;
  for(int i=0; i<n; i++){
    if(c[i]>maxc){
      posc = i+1;
    	maxc = c[i];
    }
  }
  printf("\nColumn %d has maximum sum\n",posc);
  return 0;
}