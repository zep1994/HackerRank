
function countingValleys(n, s) {
    let steps = s.split('')
    let path = []
    let sea_level = 0
    let valleys = 0

    for (let i of steps) {
        if (i === "D") {
            sea_level = sea_level - 1
            path.push(sea_level)
        } else if (i === "U") {
            sea_level = sea_level + 1
            path.push(sea_level)
        }
    }

    //console.log(path)
    //console.log(sea_level)
    //console.log(n, steps)

    for (let j of path) {
        console.log(j)
    }
}

countingValleys(8, 'UDDDUDUU')