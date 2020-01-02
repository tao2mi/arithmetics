function shellSort(array) {
    let len = array.length;
   for (let gap = Math.floor(len / 2); gap > 0; gap = Math.floor(gap / 2)) {
        for (let i = 1 + gap; i < array.length; i++) {
            const current = array[i];
            let pre = i - gap;
            while (pre >= 0 && array[pre] > current) {
                array[pre+gap] = array[pre];
                pre -= gap;
            }
            array[pre+gap] = current;
        }
   }
}

var arr = [8, 9, 2, 1, 0, 10, 7, 6, 3, 4];
// var arr = [8, 2, 0, 9, 3];

console.log(arr);
shellSort(arr);
console.log(arr);