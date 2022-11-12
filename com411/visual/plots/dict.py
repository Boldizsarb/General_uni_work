import matplotlib.pyplot as plt
import random as rnd

def data ():
    paths = {}
    print("Please enter what type of line you would like? (:, -- or -)")
    line = input()
    print("Please enter what colour would you like (r,g or b)")
    colour = input()
    print("Please enter what the style of the marker should be (o,s or ^)")
    marker = input()
    # store the line style, colour, marker style in the dictionary as key-value pairs
    paths["line_style"] = line
    paths["colour"] = colour
    paths["marker_style"] = marker
    return paths

def generate():
    print("How many lines would like to display?")
    number_lines = int(input())
    for count in range(number_lines):
        values = data()
        x = rnd.sample(range(1, 10), 5)
        y = rnd.sample(range(1, 10), 5)
        format = f"{values['colour']}{values['line_style']}{values['marker_style']}"
        plt.plot(x, y, format)
    plt.show()

def run():
    print("Running")
    generate()
    print("Done!")

run()




