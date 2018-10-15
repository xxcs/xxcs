# coding: utf-8
"""
箱线图也叫作箱须图，这是一种基于最小值、上四位数、中位数，下四位数和最大值5个数值特征展示数据分布的标准方式
箱线图占用较少的空间，在同一时间定义五种特征
离群点：一组数据中与其它值有异常距离的观测值
"""

import pandas as pd
import matplotlib.pyplot as plt

# 设置图形的显示风格
plt.style.use('ggplot')

# 设置中文和负号正常显示
plt.rcParams['font.sans-serif'] = 'Microsoft YaHei'
plt.rcParams['axes.unicode_minus'] = False

age = [1, 10, 1, 3, 4, 5, 6, 7]

"""
x：指定要绘制箱线图的数据；
notch：是否是凹口的形式展现箱线图，默认非凹口；
sym：指定异常点的形状，默认为+号显示；
vert：是否需要将箱线图垂直摆放，默认垂直摆放；
whis：指定上下须与上下四分位的距离，默认为1.5倍的四分位差；
positions：指定箱线图的位置，默认为[0,1,2…]；
widths：指定箱线图的宽度，默认为0.5；
patch_artist：是否填充箱体的颜色；
meanline：是否用线的形式表示均值，默认用点来表示；
showmeans：是否显示均值，默认不显示；
showcaps：是否显示箱线图顶端和末端的两条线，默认显示
showbox：是否显示箱线图的箱体，默认显示；
showfliers：是否显示异常值，默认显示；
boxprops：设置箱体的属性，如边框色，填充色等；
labels：为箱线图添加标签，类似于图例的作用；
filerprops：设置异常值的属性，如异常点的形状、大小、填充色等；
medianprops：设置中位数的属性，如线的类型、粗细等；
meanprops：设置均值的属性，如点的大小、颜色等；
capprops：设置箱线图顶端和末端线条的属性，如颜色、粗细等；
whiskerprops：设置须的属性，如颜色、粗细、线的类型等；
"""

plt.boxplot(x=age,
            patch_artist=True,
            showmeans=True,
            boxprops={'color': 'black', 'facecolor': '#9999ff'},
            flierprops={'marker': 'o', 'markerfacecolor': 'red',
                        'color':'balck'},
            meanprops={'marker': 'D', 'markerfacecolor': 'indianred'},
            medianprops={'linestyle': '--', 'color': 'orange'})
# 设置y轴的范围
plt.ylim(0, 85)

# 去除箱线图的上边框和右边框的刻度标签
plt.tick_params(top='off', right='off')

# 显示图形
plt.show()


