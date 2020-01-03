function mergeSort(arr) {
    if (arr.length == 1) {
        return arr;
    }
    var mid = arr.length / 2;
    var left = arr.slice(0, mid);
    var right = arr.slice(mid, arr.length);
    return merge(mergeSort(left), mergeSort(right));
}
 
function merge(left, right) {
   var arr = [];
   var leftIndex = 0;
   var rightIndex = 0;
   while (leftIndex <= left.length-1 && rightIndex <= right.length-1) {
        if (left[leftIndex] < right[rightIndex]) {
            arr.push(left[leftIndex]);
            leftIndex++;
        } else {
            arr.push(right[rightIndex]);
            rightIndex++;
        }
   }
    while (rightIndex <= right.length-1) {
        arr.push(right[rightIndex]);
        rightIndex++;
    }
    while (leftIndex <= left.length-1) {
        arr.push(left[leftIndex]);
        leftIndex++;
    }
   return arr;
}


var arr = [8, 9, 2, 1, 0, 10, 7, 6, 3, 4];
console.log(arr);
arr = mergeSort(arr);
console.log(arr);