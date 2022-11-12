def observed():
    #  populate the list with 7 values read in from the user.  There should be some duplicate values.
    observations = []
    for count in range(7):
        print("Please enter an observation:")
        observations.append(input())
    return observations

def run():
    print("Counting observations...")
    local_variable = observed()
    empty_set = set()
    # For each value in the list, the function should populate the set as follows:
    #  create a tuple that contains the value from the list along with a count for how many times that value appears in the list e.g.. ("Skyscraper", 2).
    for observation in local_variable:
        data = (observation, local_variable.count(observation))
        empty_set.add(data)

    for data in empty_set:
        print(f"{data[0]} observed {data[1]} times")

run()