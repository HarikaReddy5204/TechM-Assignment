function findSundays() {
    for (let year = 2014; year <= 2050; year++) {
        let firstDay = new Date(year, 0, 1).getDay(); 
        if (firstDay === 0) { 
            console.log(`January 1st is a Sunday in ${year}`);
        }
    }
}


findSundays();
