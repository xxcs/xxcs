# coding: utf-8

"""
核密度估计（Kernel Density Estimation, KDE）是一种用来估计概率密度函数的非参数方法
概率密度函数（Probability Density Function, PDF）的核是PDF的形式
"""

from numpy.random import randn
import matplotlib as mpl
import seaborn as sns
import matplotlib.pyplot as plt

# 改变maplotlib的配色，使所有绘图使用同一绘色，其参数与color_palette()相同
# seaborn的调色板功能，sns.color_palette()，
# 通过sns.color_palette()函数设置或查看调色板（palette）,
# 函数返回值是rgb元组的列表
# 调用sns.palplot()画出palette的每种颜色
sns.set_palette("hls")

# 定义figure的规格为1000*600
mpl.rc("figure", figsize=(10, 6))
data = randn(250)

# 定义绘图的标题，字体大小
plt.title("KDE Demonstration using Seaborn and Matplotlib",
          fontsize=20)

# seaborn的displot集合了matplotlib的hist()与核函数估计kdeplot得功能
sns.distplot(data, color="#ff8000")

plt.show()