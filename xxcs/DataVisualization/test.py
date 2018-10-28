# coding: utf-8


import numpy as np
import matplotlib.pyplot as plt

# 1.
# fig: Figure(640x480)
# fig = plt.figure()


# 图像对象
fig = plt.figure(num='xxcs', figsize=(6, 3), dpi=100, facecolor='#02FFFF', frameon=True, edgecolor='#FF11B9')

# 给图像对象添加主题
# text_object: Text(0.5,0.98,'\xe8\xbf\x99\xe6\x98\xaf\xe4\xb8\xbb\xe9\xa2\x98')
text_object = fig.suptitle("My topic", x='0.9', y='1.0')

# 关闭某个figure
# None
plt.close('xxcs')


"""
# fig: Figure(640x480)
# ax_lst: <type 'numpy.ndarray'>
    [[<matplotlib.axes._subplots.AxesSubplot object at 0x0851A490>
      <matplotlib.axes._subplots.AxesSubplot object at 0x085F8650>]
     [<matplotlib.axes._subplots.AxesSubplot object at 0x08649810>
      <matplotlib.axes._subplots.AxesSubplot object at 0x086669D0>]]
"""
fig1, ax_lst = plt.subplots(2, 2)

plt.show()