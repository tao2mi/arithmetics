function countingSort(array, max) {
    var bucket = new Array(max+1);
    for (var i=0; i<array.length; i++) {
        if (!bucket[array[i]]) {
            bucket[array[i]] = 0;
        }
        bucket[array[i]] += 1;
    }

    var index = 0;
    for (var i=0; i<bucket.length; i++) {
        while (bucket[i]) {
            array[index++] = i;
            bucket[i]--;
        }
    }
    return array;
}

var arr = [8, 9, 2, 1, 0, 10, 7, 6, 3, 4];
console.log(arr);
arr = countingSort(arr, 10);
console.log(arr);