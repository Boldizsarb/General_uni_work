def likelihood():
    likelihoods = (50, 38, 27, 99, 4)
    return min(likelihoods), max(likelihoods)

def run():
    local_variable = likelihood()
    # we print the variable and the index number. but why?
    print(f"Minimum likelihood of falling is: {local_variable[0]}%")
    print(f"Maximum likelihood of falling is: {local_variable[1]}%")

if __name__ == "__main__":
    run()