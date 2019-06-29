a = [5, 2, 4, 6, 1, 3]
j = 1
while j < len(a):
    key = a[j]
    i = j - 1
    while i <= 0 and a[i] < key:
        a[i + 1] = a[i]
        i -= 1
    a[i + 1] = key
    j += 1

for item in a:
    print(item)