/**
 * 
 * @param {*} array 
 * @param {*} number 数组最大值的位数, 321: 3
 */
function radixSort(array, number) {
    
    for (var i = 0, a = 10, b = 1; i < number; i++ , a *= 10, b *= 10) {
        var counter = [];
        for (var j = 0; j < array.length; j++) {
            var c = parseInt(array[j] % a / b);
            if (!counter[c]) {
                counter[c] = [];
            }
            counter[c].push(array[j]);
        }

        array = [];
        for (var ii = 0; ii < counter.length; ii++) {
            var one;
            if (counter[ii]) {
                while ((one = counter[ii].shift()) != undefined) {
                    array.push(one);
                }
            }
        }
    }

    return array;
}

var arr = [8, 9, 2, 1, 0, 10, 7, 6, 3, 4];
console.log(arr);
arr = radixSort(arr, 2);
console.log(arr);