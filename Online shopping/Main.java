#include<stdio.h>
int main()
{
  int a1,d1,s1,a2,d2,s2,a3,d3,s3;
  scanf("%d%d%d%d%d%d%d%d%d",&a1,&d1,&s1,&a2,&d2,&s2,&a3,&d3,&s3);
  int p1=a1-(a1*d1*0.01)+s1;
   int p2=a2-(a2*d2*0.01)+s2;
   int p3=a3-(a3*d3*0.01)+s3;
   printf("In Flipkart: Rs.%d\n",p1);
         printf("In Snapdeal: Rs.%d\n",p2);
                printf("In Amazon: Rs.%d\n",p3);
  if(p1<p2 && p1<p3)
    printf("He will prefer Flipkart");
  else if(p2<p3 && p2<p1)
    printf("He will prefer Snapdeal");
  else
    printf("He will prefer Amazon");
  //fill your code
}