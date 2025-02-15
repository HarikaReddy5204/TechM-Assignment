function daysUntilChristmas() {
    let today = new Date();
    let year = today.getFullYear();

 
    let christmas = new Date(year, 11, 25); 

    
    if (today > christmas) {
        christmas = new Date(year + 1, 11, 25);
    }

    let diff = Math.ceil((christmas - today) / (1000 * 60 * 60 * 24));

    console.log(`🎄 ${diff} days left until Christmas!`);
}


daysUntilChristmas();
