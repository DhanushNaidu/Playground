#include<stdio.h>
#include<math.h>
int main()
{
  int x, y;
  scanf("%d%d", &x, &y);
  int x1 = x - 3;
  int y1 = y - 4;
  int dist = sqrt((x1*x1)+(y1*y1));
  printf("%d", dist);
  return 0;
}