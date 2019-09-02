function bubbleSort(array) {
    for (var i=0; i<array.length-1; i++) {
        for (var j=0; j<(array.length-i); j++) {
            if (array[j] > array[j+1]) {
                swap(array, j, j+1);
            }
        }
    }
}


function swap(array, a, b) {
    var temp = array[a];
    array[a] = array[b];
    array[b] = temp;
}

var arr = [8, 9, 2, 1, 0, 10, 7, 6, 3, 4];
console.log(arr);
bubbleSort(arr);
console.log(arr);