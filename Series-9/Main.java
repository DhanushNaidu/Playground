#include<iostream>
using namespace std;
int e(int a) 
{ 
    if (a % 2 == 0)  
        a=a*a;     
    else 
        a=a*a*a;    
    return a; 
} 
 
int main() 
{ 
    int b;
  cin>>b; 
  cout<<"Enter n value";
  for(int i=1;i<=b;i++){
    cout <<e(i) <<" ";
  }
} 