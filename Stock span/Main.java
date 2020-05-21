#include<stdio.h>
int main()
{
  //fill your code
  int n;
  scanf("%d", &n);
  int a[n];
  for(int i = 0 ; i < n; i++)
  	scanf("%d", &a[i]);
  int b[n];
  for(int i= 0; i < n; i++){
    int k =0;
  	for(int j = 0; j <= i; j++){
    	if(a[i] >= a[j]){
        	k++;
        } 
      else if(a[i] < a[j])
        k=0;
    }
    b[i] = k;
  }
  for(int i = 0; i < n; i++){
  	printf("%d\n", b[i]);
  }
  return 0;
}