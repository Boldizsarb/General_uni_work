import matplotlib.pyplot as plt
import matplotlib.animation as animation

fig, ax = plt.subplots()

def animate(frame):
    global ax

    ax.set_xlim(0, 10)
    ax.set_ylim(0, 10)
    ax.plot(frame, frame, "ro")



    #print(f"The current frame number is: {frame}")




def run():

    global fig
    some_animation = animation.FuncAnimation(fig, animate, frames = 10, interval = 100)


    plt.show()
run()