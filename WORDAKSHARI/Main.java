#include<stdio.h>
#include<string.h>
int main()
{
char str[20][20]; // Can store 20 strings, each of length 20
char b[]="####";

//scanf("%d",&n); //how many string

//input each string
int c=1;
int j=-1;
for(int i=0;c!=0;i++)
{
    j++;
   scanf("%s",str[i]);
   c = strcmp(b,str[i]);
}
//display each string
printf("%s\n",str[0]);
int size = strlen(str[0]);
    for(int i=1;i<j;i++){
        char d = str[i-1][size-1];
        if(str[i][0]==d){
            printf("%s\n",str[i]);
        }
        else
            break;
        size = strlen(str[i]);
}
return 0;
}