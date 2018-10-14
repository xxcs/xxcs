# coding: utf-8

import numpy as np
import matplotlib.pyplot as plt


N = 7
winnersplot = (142.6, 125.3, 62.0, 81.0, 145.6, 319.4, 178.1)
ind = np.arange(N)

# 每个条形的宽度
width = 0.35


# fig = plt.figure()    # 创建一个幕布
# ax = fig.add_subplot(3, 4, 12)    # 截取幕布的一部分,可以在这一部分绘图
fig, ax = plt.subplots()    # 创建一个幕布，并获得一系列分区幕布的截取

# 在ax分区幕布绘制条形图
# ind是底部标注，winnersplot是其对应的高度，width是每个条形对应的宽度，color是颜色
winners = ax.bar(ind, winnersplot, width, color='#ffad00')

# 在刚才绘制的条形图的右侧继续绘制
nomineesplot = (109.4, 94.8, 60.7, 44.6, 116.9, 262.5, 102.0)
nominees = ax.bar(ind + width, nomineesplot, width, color='#9b3c38')

# 控制x轴标签的显示位置
ax.set_xticks(ind+width)

# 控制x轴标签的显示文字
ax.set_xticklabels(("Best Picture","Director", "Best Actor",
                   "Best Actress", "Editing", "Visual Effects",
                   "Cinematography"))

# 对所绘制的图形进行简要的标注
ax.legend((winners[0], nominees[0]), ('Academy Award Winners', "Academy Award Nominess"))

# 标注纵坐标值
def autolabel(rects):
    for rect in rects:
        height = rect.get_height()
        hcap = "$" + str(height) + "M"
        # 在分区幕布中插入一段文本
        # ax.text(x轴位置， y轴位置， 文本内容，ha=“水平分布情况
        #                                      （center, left, right）”,

        #        va=“垂直分布情况('top', 'bottom', 'center', 'baseline')” )
        #        rotation=“文本的角度'horizontal' 'vertical', numeric value orNone’”
        ax.text(rect.get_x() + rect.get_width()/2., height, hcap,
                ha='center', va='bottom', rotation=90)

autolabel(winners)
autolabel(nominees)

plt.show()