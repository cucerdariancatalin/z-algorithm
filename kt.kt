fun zAlgorithm(s: String): IntArray {
    val Z = IntArray(s.length)
    Z[0] = s.length
    var l = 0
    var r = 0
    for (i in 1 until s.length) {
        if (i > r) {
            l = i
            r = i
            while (r < s.length && s[r - l] == s[r]) {
                r++
            }
            Z[i] = r - l
            r--
        } else {
            val k = i - l
            if (Z[k] < r - i + 1) {
                Z[i] = Z[k]
            } else {
                l = i
                while (r < s.length && s[r - l] == s[r]) {
                    r++
                }
                Z[i] = r - l
                r--
            }
        }
    }
    return Z
}
