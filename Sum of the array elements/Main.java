#include<stdio.h>
int sum(int a[], int n);
int main()
{
  //fill your code
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i = 0;i< n;i++){
  	scanf("%d",&a[i]);
  }
  printf("%d",sum(a,n));
}
int sum(int a[], int n){
  if(n==1)
    return a[0];
	return a[n-1]+sum(a,n-1);
}