#include <stdio.h>
void main()
{
	int co1,co2;
	scanf("%d %d",&co1,&co2);

	if( co1 > 0 && co2 > 0)
	  printf("Ist Quadrant\n");
	else if( co1 < 0 && co2 > 0)
	  printf("IInd Quadrant\n");
	else if( co1 < 0 && co2 < 0)
	  printf("IIIrd Quadrant\n");
	else if ( co1 > 0 && co2 < 0)
	  printf("IIIIth Quadrant\n");

}