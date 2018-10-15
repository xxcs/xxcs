# coding:utf-8

"""
散点图：是一种用来展示两个变量之间二维关系的可视化方法，
        这种交叉数对的模式能从图像上展示不同变量间的关系，
        散点图是同一组研究对象的两个变量间关系的可视化
气泡图：展示了数据的三个维度（a, b, c）,xy轴的坐标表示两个维度变量，
        气泡的大小表示第三个维度的定量测度结果

"""

"""
散点图最适用于研究不同变量间的关系，比较著名的案列如下：
    1.男性与女性中不同年龄阶段得皮肤病的可能性
    2.IQ测试得分与GPA之间的相关性
此外：还有些辅助操作，比如：
    1.增减一条趋势线或最佳拟合线（如果关系是线性的）
    2.使用信息标记类型：信息标记类型适用于通过形状和颜色提高视觉效果来解读数据的情况
    
"""

"""
气泡图：气泡图最适用于展示沿两个坐标轴的数据信息，以及第三个显著测度的数据元素
比较著名的案例：
    1.电影的制作成本和毛利润，以及沿递增标尺的显著性测度
此外，还有些辅助性操作：
    1.增加颜色和形状的显著性：通过比较大小和颜色，数据点可以转换为问题答案的可视化结果
    2.变为交互式：如果数据点过多，则气泡图会变得复杂，因此需要在时间轴或类别上，对这些数据进行分组，完成交互式的可视化
    
"""

import os
import numpy as np
import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

dir_path = os.path.dirname(os.path.realpath(__file__))
csv_file = dir_path + os.sep + 'ucdavis.csv'

# 读取csv文件
students = pd.read_csv(csv_file)

#
g = sns.FacetGrid(students, palette='Set1', size=7)

# plt.scatter指定绘制散点图
# momheight：指定x轴是哪一个字段
# height:指定y轴是哪一个字段
# s:圆圈的半径
# linewidth: 圆圈的线宽
# edgecolor:圆圈的边缘的颜色
# color:圆圈的颜色
g.map(plt.scatter, "momheight", "height", s=140, linewidth=0.7,
      edgecolor="#ffad40", color="#ff8000")

# 设置x轴和y轴的标签
g.set_axis_labels("Mother Height", "Students Height")

plt.show()