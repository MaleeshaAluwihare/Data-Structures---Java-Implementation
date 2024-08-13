# PARTITION(A, p, r)
#     x = A[r]
#     i = p - 1
#         for j = p to r - 1
#             if A[j] ≤ x
#                 then i = i + 1
#                     exchange A[i] wih A[j]
#         exchange A[i + 1] with A[r]
#  return i + 1

# Array = []

# n = int(input("How many numbers u want to enter:"))
# while (i <= n):
#     num = int(input("Enter Number:"))
#     Array.append(num)
#     i=i+1

def Partition(A,p,r):
    x = A[r]
    i = p-1
    for j in range(p,r-1):
        if(A[j] <= x):
            i = i+1
            A[i],A[j] = A[j],A[i]
    A[i+1],A[r] = A[r],A[i+1]
    return i+1

def quickSort(arr, low, high):
   if low < high:
      pi = Partition(arr, low, high)
      quickSort(arr, low, pi - 1)
      quickSort(arr, pi + 1, high)

arr = [2, 5, 3, 8, 6, 5, 4, 7]
n = len(arr)
print("Contents of the array: ")
for i in range(n):
   print(arr[i], end=" ")
quickSort(arr, 0, n - 1)
print("\nContents of the array after sorting: ")
for i in range(n):
   print(arr[i], end=" ")






























   

