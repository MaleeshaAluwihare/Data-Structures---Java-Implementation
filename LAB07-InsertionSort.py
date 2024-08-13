#Pesudo code for Insertion Sort
# INSERTION-SORT(A)
#      for j = 2 to A.length
#         key = A[j]
#         i = j - 1
#         While i > 0 and A[i] > key
#             A[i+1] = A[i]
#             i = i-1
#         A[i+1] = key


Array = []
i = 1

n = int(input("How many numbers u want to enter:"))

while (i <= n):
    num = int(input("Enter Number between 10-20:"))
    if(10<=num<=20):
        Array.append(num)
        i=i+1
    else:
        print("Please enter valid number")
        continue

print("Original Array:",Array)


def InsertionSort(A):
    for j in range(2,len(A)):
        key = A[j]
        i = j - 1
        while i >= 0 and A[i] > key:
            A[i+1] = A[i]
            i = i - 1
        A[i+1] = key

InsertionSort(Array)

print("Array After Desending Order:", Array)
