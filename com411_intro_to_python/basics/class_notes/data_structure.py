
x = 10  
y = 11
z = 12
numbers= ... 
#list:
#create an empty list to store the names of the fruits
fruits = []
#add a fruit to the list
fruits.append("apple")
#if there is a duplicate, it will list it as the next one
fruits.append("apple")
#retrieve a fruit from the list
print(fruits[0])
#replace an exsisting fruit in the list
fruits[0] = "orange"


# tuple
data = tuple([1, "hello", 5.4]) # various data type
#can not add or modify it


def some_func():
    return 4, 5
