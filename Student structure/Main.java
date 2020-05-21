#include<stdio.h>
struct student
{
int rn,grade,a[5];
float avg;
}s[2];
int main()
{
int i,j,sum,n;
float avg;
printf("STUDENT MARKSHEET USING STRUCTURES\n");
printf("Enter the no of students\n");
scanf("%d",&n);
for(i=0;i<n;i++)
{
scanf("%d",&s[i].rn);
for(j=0;j<5;j++)
{
scanf("%d",&s[i].a[j]);
}
}
for(i=0;i<n;i++)
{
sum=0;
for(j=0;j<5;j++)
{
sum=sum+s[i].a[j];
s[i].avg=(float)(sum/5);
if(s[i].avg>=60)
s[i].grade=1;
else
{
if(s[i].avg>50 && s[i].avg<60)
s[i].grade=2;
else
s[i].grade=3;
}
}
}printf("\nrn s1 s2 s3 s4 s5 avg grade\n");
printf("\n");
for(i=0;i<n;i++)
{
printf("%d ",s[i].rn);
for(j=0;j<5;j++)
{
printf("%d ",s[i].a[j]);
}
printf("%.2f %d\n",s[i].avg,s[i].grade);
}
return 0;
}