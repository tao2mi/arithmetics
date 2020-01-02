function swap(array, a, b) {
    var temp = array[a];
    array[a] = array[b];
    array[b] = temp;
}

function selectionSort(array) {
    for (let i = 0; i < array.length - 1; i++) {
        let min = i;
        for (let j = i + 1; j < array.length; j++) {
            if (array[min] > array[j]) {
                min = j;
            }
        }
        swap(array, i, min);
    }
}

var arr = [8, 9, 2, 1, 0, 10, 7, 6, 3, 4];
console.log(arr);
selectionSort(arr);
console.log(arr);