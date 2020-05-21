#include<stdio.h>
int main()
{
  //fill your code
  int n;
  scanf("%d", &n);
  int arr[n];
  for(int i = 0; i < n; i++){
    scanf("%d", &arr[i]);
  }
  int arr1[n];
  int arrsize = 0;
    arr1[0] = arr[0];
    arrsize++;
    for(int i = 1; i < n; i++){
            int flag = 1;
        for(int j = 0; j < arrsize; j++){
            if(arr[i] == arr1[j]){
                flag= 0;
                break;
            }
        }
        if(flag == 1){
            arr1[arrsize++] = arr[i];
        }
    }
    for(int i = 0; i < arrsize; i++){
        printf("%d\n", arr1[i]);
    }
    return 0;
}