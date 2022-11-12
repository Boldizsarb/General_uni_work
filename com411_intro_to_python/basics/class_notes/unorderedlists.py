# reminder
# [] - list
# () - tuple
# {} - set/dictionary
# create a set
data = set()
print(type(data))

# create a pre populated set
#pop_data = set(("chrome", "Firefox", "Edge")) # tuple inside because it is inmutable.
set_a = set()
set_a.add("z")
set_a.add("x")

set_b = set()
set_b.add("y")
set_b.add("z")

# union
print(set_a.union(set_b))

# intersection:
print(set_a.intersection(set_b))

# difference:
print(set_a.difference(set_b))

# dictionary:
data = dict() # or data = {}
# prepopulated dict: and nested dictionary
data = {"First name": "Prins", "Last name": "Butt", "Hobbies": ["games", "Swimming"]}

