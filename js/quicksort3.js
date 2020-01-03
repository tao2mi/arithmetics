function quickSort(array, left, right) {
    if (left < right) {
        let pivot = partition(array, left, right);
        quickSort(array, 0, pivot);
        quickSort(array, pivot, right);
    }
}

function partition(array, left, right) {
    let pivot = left;
    let index = pivot + 1;
    while (index < right) {
        if (array[index] < array[pivot]) {
            swap(array, pivot, index);
            pivot = index;
        }
        index++;
    }
   return pivot;
}

function swap(array, a, b) {
    var temp = array[a];
    array[a] = array[b];
    array[b] = temp;
}

var arr = [8, 9, 2, 1, 0, 10, 7, 6, 3, 4];
console.log(arr);
quickSort(arr, 0, 9);
console.log(arr);