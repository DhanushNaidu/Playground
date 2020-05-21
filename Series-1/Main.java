#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int b = 7, c=5;
  for(int i=0; i<a; i++){
    
    if(i%2==1)
      printf("%d ",(c++));
    else
      printf("%d ",(b++));
    }
  //fill your code
}