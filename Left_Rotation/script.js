function rotLeft(a, d) {
    const headIndex = d % a.length 
    const head = a.splice(0, headIndex) 
    a.push(...head)
    console.log(a)
}

rotLeft([1,2,3,4,5], 4)