#include<stdio.h>
int main()
{
	int amt, interest, time;
  	scanf("%d%d%d", &amt, &interest, &time);
  	float dis;
  	float i = (amt*interest*time)/100.0;
  	printf("%0.2f\n", i);
  	printf("%0.2f\n", amt+i);
  	dis = (2.0*i)/100.0;
  	printf("%0.2f\n", dis);
  	printf("%0.2f", amt+i-dis);
  	return 0;
}