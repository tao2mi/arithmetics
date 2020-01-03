function quickSort(array, left, right) {
    if (left < right) {
        let pivot = partition(array, left, right);
        quickSort(array, left, pivot-1);
        quickSort(array, pivot+1, right);
    }
}

function partition(array, left, right) {
    let pivot = left;
    let index = i = pivot + 1;

    while (i <= right) {
        if (array[i] < array[pivot]) {
            swap(array, index, i);
            index++;
        }
        i++;
    }
    swap(array, index-1, pivot);
   return index-1;
}

function partition2(array, left, right) {
    
}

function swap(array, a, b) {
    var temp = array[a];
    array[a] = array[b];
    array[b] = temp;
}

var arr = [8, 9, 2, 1, 0, 10, 7, 6, 3, 4];
// var arr = [8, 9, 2, 1, 0];
console.log(arr);
quickSort(arr, 0, 9);
console.log(arr);