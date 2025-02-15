function sortNumbers(a, b, c) {
    let sortedNumbers;

    if (a >= b && a >= c) {
        if (b >= c) {
            sortedNumbers = [a, b, c];
        } else {
            sortedNumbers = [a, c, b];
        }
    } else if (b >= a && b >= c) {
        if (a >= c) {
            sortedNumbers = [b, a, c];
        } else {
            sortedNumbers = [b, c, a];
        }
    } else {
        if (a >= b) {
            sortedNumbers = [c, a, b];
        } else {
            sortedNumbers = [c, b, a];
        }
    }

    alert(`Sorted order: ${sortedNumbers.join(", ")}`);
}

sortNumbers(0, -1, 4); 
