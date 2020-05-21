#include<stdio.h>
int max(int a[],int n);
int main()
{
  //fill your code
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i =0; i<n;i++)
    scanf("%d",&a[i]);
  printf("%d",max(a,n));
}
int max(int a[],int n){
  int res= a[0];
  for(int i = 0; i<n;i++){
    res = (res>a[i])?res:a[i];
  }
  return res;
}