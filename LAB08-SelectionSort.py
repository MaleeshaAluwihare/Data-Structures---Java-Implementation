#Pesudo code for selection sort

# SELECTION-SORT(A)
#     n = A.length
#     for j = 1 to n − 1
#         smallest = j
#         for i = j + 1 to n
#             if A[i ] < A[smallest]
#                 smallest = i
#             exchange A[ j ] with A[smallest]


def SelectionSort(A):
    n = len(A)
    for j in range(n - 1):
        smallest = j
        for i in range(j + 1, n):
            if A[i] < A[smallest]:
                smallest = i
        A[j], A[smallest] = A[smallest], A[j]


Array = [20,45,35,100,10,90]
print("Original Array:",Array)

SelectionSort(Array)
print("Array After Sort",Array)



