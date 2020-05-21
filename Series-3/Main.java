#include<iostream>
using namespace std;
int main()
{
int x,a=6;
 cout<<"Enter n value\n";
   cin>>x;
  cout<<a<<" ";
  for(int i=2;i<x*2;i++){
    if((i%2)!=0)
      continue;
  else{a=a+i+1;
    cout<<a<<" ";}
  }
}