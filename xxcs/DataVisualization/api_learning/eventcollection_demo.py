# _^^_coding: utf-8 _^^_

"""
EventCollection Demo
EventCollection 演示
例子：绘制两条曲线，然后使用EventCollections标记每条曲线的相应轴上的x和y数据点的位置
"""

import matplotlib.pyplot as plt
from matplotlib.collections import EventCollection
import numpy as np

np.random.seed(19680801)

xdata = np.random.random([2, 10])

xdata1 = xdata[0, :]
xdata2 = xdata[1, :]

xdata1.sort()
xdata2.sort()

ydata1 = xdata1 ** 2
ydata2 = 1 - xdata2 ** 3

fig = plt.figure()
fig.suptitle("line plot with data points")

ax = fig.add_subplot(1, 1, 1)
ax.plot(xdata1, ydata2, 'r', xdata2, ydata2, 'b')

xevents1 = EventCollection(xdata1, color=[1, 0, 0], linelength=0.05)
xevents2 = EventCollection(xdata2, color=[0, 0, 1], linelength=0.05)

yevents1 = EventCollection(ydata1, color=[1, 0, 0], linelength=0.05,
                           orientation='vertical')
yevents2 = EventCollection(ydata2, color=[0, 0, 1], linelength=0.05,
                           orientation='vertical')

ax.add_collection(xevents1)
ax.add_collection(xevents2)
ax.add_collection(yevents1)
ax.add_collection(yevents2)

ax.set_xlim([0, 1])
ax.set_ylim([0, 1])
ax.set_title("xxcs")

plt.show()

