function insertSort(array) {
    for (let i = 1; i < array.length; i++) {
        const current = array[i];
        let pre = i - 1;
        while (pre >= 0 && array[pre] > current) {
            array[pre+1] = array[pre];
            pre --;
        }
        array[pre+1] = current;
    }
}

// var arr = [8, 9, 2, 1, 0, 10, 7, 6, 3, 4];
var arr = [8, 2, 0, 9, 3];
console.log(arr);
insertSort(arr);
console.log(arr);