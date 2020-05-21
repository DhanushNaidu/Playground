#include<bits/stdc++.h>
using namespace std;
int main()
{
int x,y;cin>>x>>y;
  for(int i=x;i<=y;i++){
    if(i==x)
      continue;
    else{
    x=x+i;}
}cout<<x;
}