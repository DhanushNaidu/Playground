#include<iostream>
using namespace std;
int main()
{
 int r,sum=0,temp;    
  int n;
  cin>>n;
  
  temp=n;    
  while(n>0){    
   r=n%10;  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   cout<<"Same";    
  else    
  cout<<"Not Same";    
}