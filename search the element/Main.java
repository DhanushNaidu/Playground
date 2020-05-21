#include<stdio.h>
int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 
  
    // Driver method to test above 
int main() 
    {	
        int n;
  scanf("%d",&n);
  		int arr[n]; 
        for(int i = 0; i < n;i++){
        	scanf("%d",&arr[i]);
        }
        int x;
  scanf("%d",&x);
        int result = binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            printf("Element not present"); 
        else
            printf("%d",result+1); 
	return 0;    
} 