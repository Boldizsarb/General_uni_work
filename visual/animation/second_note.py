import matplotlib.pyplot as plt
import matplotlib.animation as animation
from time import sleep # delaying things

def init():
    print("empty frame")




def animate(frame):
    global axs

    # data:
    x = [1, 2, 3, 4, 5, 6, 7]
    y = [1, 4, 9, 16, 25, 36, 49]

    # draw markers, first out of 4
    if frame <= 7:
        axs[0, 0].cla() # clearing the previous frames
        axs[0, 0].plot(x[:frame], y[:frame], "ro--") #
        axs[0, 0].set_xlim(min(x), max(x)) # it will set the limit of the collection X
        axs[0, 0].set_ylim(min(y), max(y)) # starts from the smallest to the biggest

    # draw a bar plot, second out of 4
    elif frame < 14: # if frame is at 14 it will start drawing this
        axs[0, 1].cla()
        axs[0, 1].bar(x[:frame % 7], y[:frame %7])
        axs[0, 1].set_xlim(min(x), max(x)) # same limits
        axs[0, 1].set_ylim(min(y), max(y))

    # draw a pie chart
    slices = [10, 20, 50, 20] # different data
    axs[1, 0].cla()
    axs[1, 0].pie(slices[:frame])
    # pie does not have x and y axes so there is no limit required.

    # draw a growing bar
    axs[1, 1].cla()
    axs[1, 1].bar([1, 2], [1, 2+frame]) # the x and y values are within the this line not like the others
    axs[1, 1].set_xlim(min(x), max(x))
    axs[1, 1].set_ylim(min(y), max(y))

""" axs[1, 1].cla()
    if frame % 10 == 0: 
    axs[1, 1].bar([x[:frame], y[:frame]) the y axes is going to grow in this case
    axs[1, 1].set_xlim(min(x), max(x))
    axs[1, 1].set_ylim(min(y), max(y))
    
    """


# 2 by 2 subplot (4 altogether!)
fig, axs = plt.subplots(2, 2)
some_animation = animation.FuncAnimation(fig, animate, frames = 14, interval = 1000, repeat=False)

plt.show()