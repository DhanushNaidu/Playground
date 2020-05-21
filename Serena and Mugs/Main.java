#include<stdio.h>
int main()
{
  //fill your code
  int n, s;
  scanf("%d %d", &n, &s);
  int arr[n];
  for(int i = 0; i < n; i++){
  	scanf("%d", &arr[i]);
  }
  int sum = 0;
  for(int i = 0; i < n; i++){
  	sum = sum + arr[i];
  }
  if(sum > s)
    printf("NO");
  else
    printf("YES");
  return 0;
}