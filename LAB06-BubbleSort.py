
#Pesudo code for bubbleSort

# Initialize n = Length of Array

# BubbleSort(Array, n){

#     for i = 0 to n-2
#     {
#         for j = 0 to n-2
#         {
#             if Array[j] > Array[j+1]
#             {
#                 swap(Array[j], Array[j+1])
#             }
#         }
#     }
# }

def BubbleSort(Array,n):

    for i in range(n-1):

        for j in range(n-1):

            if(Array[j] > Array[j+1]):

                temp = Array[j+1]
                Array[j+1] = Array[j]
                Array[j] = temp

                # another way to Swap elements
                #arr[j], arr[j+1] = arr[j+1], arr[j]


my_Array = [64,76,88,87,56,21,10,100,]
n = len(my_Array)

print("Original Array:",my_Array)

BubbleSort(my_Array,n)

print("Sorted Array:", my_Array)

    
