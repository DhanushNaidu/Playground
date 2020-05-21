#include<iostream>
using namespace std;
int main()
{
 int i, n, t1 = 1, t2 = 2, nextTerm;
  cin>>n;
  cout<<"Enter n value\n";
   for (i = 1; i <= n; ++i)
    {
        cout<<t1<<" ";
        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
    }
  }
  
