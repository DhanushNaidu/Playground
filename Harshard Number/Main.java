#include<iostream>
using namespace std;
bool e(int n) 
{ 
     
    int s= 0; 
    for (int a= n; a> 0; a/= 10) 
        s+= a% 10; 
    return (n%s== 0); 
} 
  
 
int main() 
{ int x;cin>>x;
    e(x) ? cout << "Harshard Number" : cout << "Not Harshard Number";  
  
    return 0; 
} 