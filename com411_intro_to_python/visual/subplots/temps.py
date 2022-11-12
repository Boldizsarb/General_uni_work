import matplotlib.pyplot as plt

def read_data(path_and_name):
    temp_list = []
    with open(path_and_name) as file:

        for line in file:
            temp_list.append(float(line.strip()))
    return temp_list

def run():
    data = read_data('temps.txt')
    fig, (ax1, ax2) = plt.subplots(1, 2)
    ax1.plot(range(len(data)), data)
    ax2.bar(range(len(data)), data)
    plt.show()

run()