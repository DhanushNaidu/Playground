#include<stdio.h>
int isPrime(int n, int i) ;
int main()
{
  //fill your code
  int a;
  scanf("%d",&a);
  if(isPrime(a,2)== 1)
    printf("%d is a prime number",a);
  else
    printf("%d is not a prime number",a);
}
int isPrime(int n,int i) 
{ 
    // Base cases
  //int i = 2;
  int flag=1;
    if (n <= 2) 
        return (n == 2) ? 1 : 0; 
    if (n % i == 0) 
        return 0; 
    if (i * i > n) 
        return 1; 
  
    // Check for next divisor 
    return isPrime(n, i + 1); 
} 