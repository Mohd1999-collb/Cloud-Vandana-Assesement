let arr = [5, 3, 15, 8, 1, 9];

// Bubble sort algorithm

// For no. of passes
for(let i = 0; i < arr.length; i++){
    // For comparison each pass
    for(let j = 0; j < arr.length-1-i; j++){
        if (arr[j+1] > arr[j]) {
            let temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp; 
        }
    }
}

console.log(arr);

       /*
       * Time complexity = O(n^2){using for loop}
       * Space complexity = O(1){no need extra space}
       * where n = arr length
       */