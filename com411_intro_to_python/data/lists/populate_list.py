def directions():
    directions = ["Move Forward", "Move Backward", "Turn Left", "Turn Right"]
    return directions  # return the list

def menu():
    print("Plesase select a direction:")
    # call the first function and store the returned list in a local variable
    dirs = directions()
    for index in range(len(dirs)):
        print(f"{index}: {dirs[index]}")
        index = int(input())
        return dirs[index]

def run():
    route =[]
    print("Workin out escapes route...")
    for count in range(5):
        route.append(menu())
    print(f"Escape route: {route}")

if __name__ == "__main__":
  run()