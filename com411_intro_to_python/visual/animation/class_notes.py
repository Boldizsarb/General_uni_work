import matplotlib.pyplot as plt
import matplotlib.animation as animation
# user defined function
def animate(frame):
    x = [1, 2, 3, 4, 5]
    y = [2, 4, 6, 8, 10]
    ax.plot(x[:frame], y[:frame])
    ax.set_xlim(0, 5) # by setting limits, the axes are not changing!
    ax.set_ylim(0, 10)
   #print(frame)

# our figure
fig, ax = plt.subplots(1, 1)
# create an animation using FuncAnimation
some_animation = animation.FuncAnimation(fig, animate, frames = 5, interval = 100,repeat=False)
 # the some_animation is a random named variable
# the animation need to be assinged to a variable
plt.show()
#animate(frame)
