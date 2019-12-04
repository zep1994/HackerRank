function sockMerchant(n, ar) {
    const colors = {} 
    let pairs = 0
    for (let i = 0; i < ar.length; i++) {
        if (colors[ar[i]]) {
            pairs++
            colors[ar[i]] = 0
        } else {
            colors[ar[i]] = 1
        }
    }
    return pairs
}


sockMerchant(9, [10,20,20,10,10,30,50,10,20])