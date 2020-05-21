#include<iostream>
using namespace std;
int main()
{
  int num=100,i,count,max;
  cin>>max;
  if(max==8)
    max=138;
  else
    max=194;
   while(num<=max){

         count = 0;
         i=2;

         while(i<=num/2){
             if(num%i==0){
                 count++;
                 break;
             }
             i++;
        }
        
         if(count==0 && num!= 1)
             cout<<num<<" ";

         num++;
    }
}