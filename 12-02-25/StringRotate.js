function rotateStringRight(str) {
    let arr = str.split(""); 

    setInterval(() => {
        let lastChar = arr.pop(); 
        arr.unshift(lastChar); 
        console.log(arr.join("")); 
    }, 500);
}


rotateStringRight("digiterati");
