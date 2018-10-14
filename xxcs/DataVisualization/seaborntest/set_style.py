# coding: utf-8
import matplotlib.pyplot as plt
import seaborn as sns
import numpy as np

"""
函数：sns.set_style(style=None, rc=None)
作用：set_style( )是用来设置主题的，
参数：Seaborn有五个预设好的主题： darkgrid , whitegrid , dark , white ,和 ticks  默认： darkgrid
"""
sns.set_style("ticks", {"xtick.major.size": 16, "ytick.major.size": 16})

plt.plot(np.arange(10))
plt.show()