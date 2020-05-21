#include <iostream> 
#include <math.h> 
using namespace std;  
bool e(int x) 
{ 
	int s = sqrt(x); 
	return (s*s == x); 
} 
bool i(int n) 
{ 
	return e(5*n*n + 4) || 
		 e(5*n*n - 4); 
} 


int main() 
{ 
int x;cin>>x;
	i(x)? cout << "Fibonacci Number \n": 
					cout  << "Not Fibonacci Number \n" ; 
return 0; 
} 
