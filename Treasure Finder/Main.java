#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  int max,smax;
  if(a>b && a>c)
  {
    max=a;
    if(b >= c)
        {
    
            smax=b;
        }
        else
        {
            smax=c;
        }
  }
  else if(b>c && b>a)
  {
    max=b;
    if(a >= c)
        {
            smax=a;
        }
        else
        {
           smax=c;
        }
  }
  else
  {
    max=c;
    if(a >= b)
    {
        smax=a;
    }
    else
    {
        smax=b;
    }

  }
  int gcd;
    for(gcd=max; gcd>=1; gcd--){
        if(a%gcd==0 && b%gcd==0 && c%gcd==0){
            break;
        }
    }
  printf("The treasure is in the box which has number %d.\n",smax);
    printf("The code to open the box is %d.",gcd);
  //fill your code
}