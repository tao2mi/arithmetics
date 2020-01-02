var curLen = 0;

function buildMaxHeap(array) {
    
    for (var i=Math.floor(curLen/2); i>=0; i--) {
        heapify(array, i);
    }
}

function heapify(array, i) {
    var current = i;
    var left = 2 * i + 1;
    var right = 2 * i + 2;
    var max = current;
    if (left < curLen && array[max] < array[left]) {
        max = left;
    }
    if (right < curLen && array[max] < array[right]) {
        max = right;
    }
    if (current != max) {
        swap(array, current, max);
    }
}

function swap(array, a, b) {
    var temp = array[a];
    array[a] = array[b];
    array[b] = temp;
}

function heapSort(array) {
    curLen = array.length;
   
    for (var i=0; i<array.length; i++) {
        buildMaxHeap(array);
        swap(array, 0, curLen-1);
        curLen--;
    }
}

var arr = [8, 9, 2, 1, 0, 10, 7, 6, 3, 4];
console.log(arr);
heapSort(arr);
console.log(arr);