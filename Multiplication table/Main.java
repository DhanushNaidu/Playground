#include<iostream>
int main()
{int x,y;
  std::cin>>x>>y;
  for(int i=1;i<=y;i++){
    std::cout<<x<<" * "<<i<<" = "<<i*x<<"\n";
  }
}