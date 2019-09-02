function bucketSort(array, min, max, bucketSize) {
    var bucketNum = Math.floor((max-min)/bucketSize) + 1;
    var buckets = Array(bucketNum);
    for (var i = 0; i < buckets.length; i++) {
        buckets[i] = [];
    }
    for(var i=0; i<array.length; i++) {
        var k = Math.floor((array[i]-min)/bucketSize);
        buckets[k].push(array[i]);
    }

    array = [];
    for (var i = 0; i < buckets.length; i++) {
        insertSort(buckets[i]);                      // 对每个桶进行排序，这里使用了插入排序
        for (var j = 0; j < buckets[i].length; j++) {
            array.push(buckets[i][j]);                      
        }
    }
    return array;
}

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
// var arr = [8, 2, 0, 9, 3];
console.log(arr);
arr = bucketSort(arr, 0, 10, 5);
console.log(arr);