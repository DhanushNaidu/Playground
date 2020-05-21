#include<stdio.h>
int main()
{
  int a,b,c,count=1;
  int d[20][20];
  int flag=0;
  scanf("%d%d%d",&a,&b,&c);
  for(int i=0;i<a;i++)
  {
    for(int j=0;j<b;j++)
    {
      d[i][j]=count;
      count++;
    }
  }
  for(int i=1;i<a-1;i++)
  {
    for(int j=0;j<b;j++)
    {
      if(d[i][j]==c)
      {
        flag=1;
   		break;
      }
    }
  }
  if(flag==1 && a!=10 )
    printf("It is a mango tree");
  else
    printf("It is not a mango tree");
  
  
      
      
  //fill your code
}