import matplotlib.pyplot as plt

def coordinate():
    print("Please enter the value of x")
    x = int(input())
    print("Please enter the value of y")
    y = int(input())
    return (x , y)

def path():
    print("Retrieving path...")
    x_values = []
    y_values = []

    for count in range(4):
        data = coordinate()
        x_values.append(data[0])
        y_values.append(data[1])

    return (x_values, y_values)
# mine:
def run():
    values = path()
    x = (values[0])
    y = (values[1])
    plt.plot(x, y, "r--o")
    plt.show()

# prins's:
  # values = path()
  # plt.plot(values[0], values[1], "r--o")
  # plt.xlabel("x values")
  # plt.ylabel("y values")
  # plt.show()

run()
