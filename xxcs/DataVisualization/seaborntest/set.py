# coding: utf-8
import matplotlib.pyplot as plt
import seaborn as sns
import numpy as np


"""
函数：sns.set(context="notebook", style="darkgrid", palette="deep",
        font="sans-serif", font_scale=1, color_codes=True, rc=None)
作用：set( )通过设置参数可以用来设置背景，调色板等，更加常用
参数：
"""
sns.set(style="white", palette="muted", color_codes=True)
plt.plot(np.arange(10))
plt.show()