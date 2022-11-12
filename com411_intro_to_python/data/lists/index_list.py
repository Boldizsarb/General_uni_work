def movements():
    path = ["Move Forward", 10, "Move Backward", 5, "Move left", 3, "Move Right", 1]
    return path
def run():
    print("Mooving...")
    movements()
    # call the first function and store the return list in a local variable
    path = movements()
    # display the values in the list in the following format: "{direction} for {steps} steps" where {direction} is the direction of movement and {steps} is the number of steps to move.
    print(f"{path[0]} for {path[1]} steps")
    print(f"{path[2]} for {path[3]} steps")
    print(f"{path[4]} for {path[5]} steps")
    print(f"{path[6]} for {path[7]} steps")

if __name__ == "__main__":
  run()