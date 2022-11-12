import matplotlib.pyplot as plt

def display(x, y):
# The function should display a line plot using
# the arguments supplied for the parameters.
    plt.plot(x, y)
    plt.show()

def run():
    print("Running....")
    x_values= [1, 2, 3, 4, 5]
    y_values = [1, 4, 9, 16, 25]
 # The function should then call the first
# #function passing x_values and y_values as arguments.
    display(x_values, y_values)
run()