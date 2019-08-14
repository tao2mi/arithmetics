function insertSort(array) {
    for (var i=1; i<array.length; i++) {
        var pre = i - 1;
        var current = array[i];
        while (pre >=0 && current < array[pre]) {
            array[pre+1] = array[pre];
            pre--;
        }
        array[pre+1] = current;
    }
}

var arr = [8, 9, 2, 1, 0, 10, 7, 6, 3, 4];
console.log(arr);
insertSort(arr);
console.log(arr);