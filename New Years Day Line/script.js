// Complete the minimumBribes function below.
function minimumBribes(q) {
    //define counter for number of moves
    let moves = 0

    //Determine if player has moved more than once 
    for (let i = 0; i < q.length; i++) {
        if (q[i] - (i + 1) > 2) {
            console.log("Too Chaotic")
        }
    }
    //Determine if player has been bribed 

}

minimumBribes([5, 1, 2, 3, 7, 8, 6, 4])