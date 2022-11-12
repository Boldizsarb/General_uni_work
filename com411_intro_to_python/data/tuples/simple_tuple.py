def likelihood():
    likelihoods = (50, 38, 27, 99, 4)
    # return the smallest likelihood of falling
    return min(likelihoods)

def run():
    # call the first function and stored the returned value in a local variable
    local_variable = likelihood()
    print(f"Minimum likelihood of falling is {likelihood()}%")
    # display a message in the format: "Minimum likelihood of falling: {value}%" where {value} is the value returned by the previous function call.

if __name__ == "__main__":
    run()