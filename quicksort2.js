function quickSort(array, left, right) {
    if (left < right) {
        var pivot = partition(array, left, right);
        quickSort(array, left, pivot-1);
        quickSort(array, pivot+1, right);
    }
}

function partition(array, left, right) {
    var pivot = left;
    var minMax = pivot + 1;
    for (var i = minMax; i <= right; i++) {
        if (array[pivot] > array[i]) {
            swap(array, i, minMax);
            minMax++;
        }
    }
    swap(array, pivot, minMax - 1);
    return minMax - 1;
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