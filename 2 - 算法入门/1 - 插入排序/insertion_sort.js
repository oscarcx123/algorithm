a = [5, 2, 4, 6, 1, 3];
for (var j = 1; j < a.length; j++) {
    var key = a[j];
    for (var i = j - 1; i >= 0 && a[i] > key; i--) {
        a[i + 1] = a[i];
    }
    a[i + 1] = key;
}
for (var i = 0; i < a.length; i++) {
    console.log(a[i])
}