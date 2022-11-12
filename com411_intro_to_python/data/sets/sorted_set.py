def observed():
    observations = []
    for count in range(5):
        print("Please enter your observation")
        observations.append(input())
    return observations

def remove_observations(list_observation):
    is_running = True
    #  While the user wishes to remove observations, the function should
    #     Prompt the user to enter a string representing the observation (e.g. "Skyscraper") to be removed
    while(is_running):
        print("Do you want to remove observations (yes/no)?")
        response = input()
        if (response == "yes"):
            print("Please enter the observation you wish to remove")
            observation = input()
            list_observation.remove(observation)
        else:
            is_running = False


def run():
    #  call the first function and store the returned list in a local variable.
    local_variable = observed()
    #   call the second function with the previously retrieved list.
    remove_observations(local_variable)
    # display a sorted set of the observations and how many times each observation has been made.
    observations_set = set() # populating the set
    for observation in local_variable:
        data = (observation, local_variable.count(observation))
        observations_set.add(data)

    for data in sorted(observations_set):
        print(f"{data[0]} observed {data[1]} times.")

run()
