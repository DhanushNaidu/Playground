#include<stdio.h>
int main()
{
int n, a[100], b[100], count = 0, c,j,o,i, d;

  for (c = 0; c < 4; c++)
    scanf("%d", &a[c]);
 
  for (c = 0; c < 4; c++)
  {
    for (d = 0; d < count; d++)
    {
      if(a[c] == b[d])
        break;
    }
    if (d == count)
    {
      b[count] = a[c];
      count++;
    }
  }
 for (i = 0; i < 4; ++i) 
        {
 
            for (j = i + 1; j < 4; ++j)
            {
 
                if (b[i] > b[j]) 
                {
 
                    o =  b[i];
                    b[i] = b[j];
                    b[j] = o;
 
                }
 
            }
 
        }
 
  for (c = 0; c < count; c++)
    printf("%d\n", c+1);
 
}