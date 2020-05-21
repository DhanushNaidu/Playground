#include<iostream>
int main()
{int x,y=2;
 std::cin>>x;
 std::cout<<y;
for(int i=2;i<=x;i++){
  y=y+1;
  y=y*2;
  y=y-i;
  std::cout<<" "<<y;
}
}