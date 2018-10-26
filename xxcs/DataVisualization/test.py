# coding: utf-8


import numpy as np
import matplotlib.pyplot as plt


# fig: Figure(640x480)
fig = plt.figure()

# text_object: Text(0.5,0.98,'\xe8\xbf\x99\xe6\x98\xaf\xe4\xb8\xbb\xe9\xa2\x98')
text_object = fig.suptitle("This is topic")

"""
# fig: Figure(640x480)
# ax_lst: <type 'numpy.ndarray'>
    [[<matplotlib.axes._subplots.AxesSubplot object at 0x0851A490>
      <matplotlib.axes._subplots.AxesSubplot object at 0x085F8650>]
     [<matplotlib.axes._subplots.AxesSubplot object at 0x08649810>
      <matplotlib.axes._subplots.AxesSubplot object at 0x086669D0>]]
"""
fig, ax_lst = plt.subplots(2, 2)

plt.show()