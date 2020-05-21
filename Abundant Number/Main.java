 #include <iostream> 
#include<math.h>
using namespace std; 
int m(int n) 
{ 
	int sum = 0; 
	for (int i=1; i<=sqrt(n); i++) 
	{ 
		if (n%i==0) 
		{  
		if (n/i == i) 
				sum = sum + i; 
          else 
			{ 
				sum = sum + i; 
				sum = sum + (n / i); 
			} 
		} 
	} 
	sum = sum - n; 
	return sum; 
}
bool t(int n) 
{return (m(n) > n); 
} 
int main() 
{ int x;cin>>x;
	t(x)? cout << "Abundant Number" : cout << "Not Abundant Number";  
} 
