#include <stdio.h>
#include <string.h>
void swap(char *a, char *b ){
    char temp = *a;
    *a = *b;
    *b = temp;
}
void sort(char *word){
    for (unsigned int i = 0; i < strlen(word) - 1; i++)
        for (unsigned int j = i + 1; j < strlen(word); j++)
            if (word[i] > word[j])
                swap(&word[i], &word[j]); // simply swap the characters
}
int main(){
    char a[10];
  gets(a);
    sort(a);
    printf("The sorted string is %s", a);
    return 0;
}