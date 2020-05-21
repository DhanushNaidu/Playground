#include<stdio.h>
int main()
{
 int ndays, year, week, days;
    scanf("%d", &ndays);
    year = ndays / 365;
    week =(ndays % 365) / 7;
    days =(ndays % 365) % 7;
    printf ("%d\n%d\n%d\n",year, week, days); //fill your code
}