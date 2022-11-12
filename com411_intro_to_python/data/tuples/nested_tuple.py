def steps():
    likelihoods = [("step 1", 50), ("step 2", 38), ("step 3", 27), ("step 4", 99), ("step 5", 4)]
    return likelihoods
def run():
    local_variable = steps()
    good_steps = []
    bad_steps = []
    # loop through the list of steps retrieved previously and do the following for each step:
    #  if the likelihood of the step falling is 50 or more then add the tuple to bad_steps
    #     otherwise add the tuple to good_steps
    for step in local_variable:
        if (step[1] >= 50):
            bad_steps.append(step)
        else:
            good_steps.append(step)
    # Finally, the function should display a message "Good steps: {good}, Bad steps: {bad}" where {good} is the number of good steps and {bad} is the number of bad step
    print(f"Good steps: {len(good_steps)}, Bad steps: {len(bad_steps)}")

if __name__ == "__main__":
  run()