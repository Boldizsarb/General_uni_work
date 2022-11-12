import matplotlib.pyplot as plt

def small():
    x = [3, 3, 4, 4, 3]
    y = [3, 4, 4, 3, 3]
    plt.plot(x, y, "s:r")
    plt.show()

#small()

# darren notes:
awesome_people = ["Darren", "Meh", "Bleh"]

print(awesome_people[0])
# how can I print the whole list withouth the brackets?
for person in awesome_people:
    print(person) # prints it out without bracket in list

# dictioneries
lecturers = {
    "Darren": "Web technologies",
    "prins": "problem solving through...",
    "Martin": "data structures....."
}

#meh = ("item 1", "item 2")
#print(meh)
print(lecturers["Darren"]) # it will give the associated value :
# how to loop this method?
for item in lecturers.item():
    print(item[0])
# important: check for duplicates!!!
meh = ["meh", "bleh", "lalala", "yay", "yay", "meh"]
tally = {}
for thing in meh:
    if tally[thing] in tally.keys():
        tally[thing] += 1
    else:
        tally[thing] = 1

# if there is a key in the dictionary then create a value one
# this loop will populate the tally, and assigns values ot it, 1 for each duplicate