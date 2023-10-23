let str = "This is a sunny day";
let temp = "";
let arr = [];
let j = 0;

for (let i = 0; i < str.length; i++) {
    if (str[i] != " ") {
        temp += str[i];
    } else {
        let t = temp.split("");
        reverseWord(t);
        arr[j++] = convertStr(t);
        t = [];
        temp = "";
    }
}

// for last word
let t = temp.split("");
reverseWord(t);
arr[j++] = convertStr(t);

console.log(arr.join(" "));


function convertStr(t) {
    let s = "";
    for (let val of t) {
        s += val;
    }
    return s;
}

// Reverse word function 
function reverseWord(str) {
    let i = 0, j = str.length - 1;
    while (i <= j) {
        let temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        i++;
        j--;
    }
}

       /*
       * Time complexity = O(n){using for loop}
       * Space complexity = O(n){using auxilary array}
       * where n = string length
       */