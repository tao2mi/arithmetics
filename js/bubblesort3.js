function bubbleSort(array) {
    for (let i = 0; i < array.length-1; i++) {
       for (let j = 0; j < array.length - i-1; j++) {
           if (array[j] > array[j+1]) {
               let temp = array[j];
               array[j] = array[j+1];
               array[j+1] = temp;
           } 
        }
    }
}

var arr = [8, 9, 2, 1, 0, 10, 7, 6, 3, 4];
console.log(arr);
bubbleSort(arr);
console.log(arr);