
function countingValleys(n, s) {
    let sea_level = 0, valleys = 0

    for (let i = 0; i < s.length;  i++) {
        sea_level = (s[i] === "U") ? sea_level + 1 : sea_level - 1
        valleys = ((sea_level === 0) && (s[i] === "U")) ? valleys += 1 : valleys
    }

    console.log(valleys)
}

countingValleys(8, 'UDDDUDUU')