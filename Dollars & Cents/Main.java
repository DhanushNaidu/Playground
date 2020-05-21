#include<iostream>
using namespace std;
int main()
{
  int d1,d2,c1,c2;
  cin>>d1>>c1>>d2>>c2;
  c1=c1+c2;c2=0;
  while(c1>=100){
    c1=c1-100;
    c2++;}
    cout<<d1+d2+c2<<"\n"<<c1;
  }
