var curLen = 0;

function buildMaxHeap(array) {
    for (let i=parseInt(curLen/2)-1; i>=0; i--) {
        heapify(array, i);
    }
}

function heapify(array, i) {
    let left = i * 2 + 1;
    let right = i * 2 + 2;
    let largest = i;
    if (array[left] > array[i]) {
        largest = left;
    }
    if (right < curLen && array[right] > array[i]) {
        largest = right;
    }
    swap(array, largest, i);
}

function swap(array, a, b) {
    var temp = array[a];
    array[a] = array[b];
    array[b] = temp;
}

function heapSort(array) {
    curLen = array.length;

    while (curLen > 1) {
        buildMaxHeap(array);
        swap(array, 0, curLen - 1);
        curLen--;
    }
}

var arr = [8, 9, 2, 1, 0, 10, 7, 6, 3, 4];
console.log(arr);
heapSort(arr);
console.log(arr);