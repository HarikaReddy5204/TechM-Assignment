function findSign(num1, num2, num3) {
    let product = num1 * num2 * num3; 

    if (product > 0) {
        alert("The sign is +");
    } else if (product < 0) {
        alert("The sign is -");
    } else {
        alert("The product is 0 (no sign).");
    }
}
findSign(3, -7, 2); 
