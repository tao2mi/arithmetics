function shellSort(array) {
    var len = array.length;
    for (var gap=Math.floor(len/2); gap>0; gap=Math.floor(gap/2)) {
        for (var i=gap; i<len; i++) {
            var pre = i - gap;
            var current = array[i];
            while (pre >= 0 && current < array[pre]) {
                array[pre+gap] = array[pre];
                pre = pre - gap;
            }
            array[pre+gap] = current;
        }
        // console.log(array);
    }
}

var arr = [8, 9, 2, 1, 0, 10, 7, 6, 3, 4];
// var arr = [8, 2, 0, 9, 3];

console.log(arr);
shellSort(arr);
console.log(arr);