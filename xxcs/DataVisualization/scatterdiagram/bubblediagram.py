# coding: utf-8

import os
import numpy as np
import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt


dir_path = os.path.dirname(os.path.realpath(__file__))
csv_file = dir_path + os.sep + 'ucdavis.csv'

# 读取csv文件
students = pd.read_csv(csv_file)
father_height = students.dadheight
mother_height = students.momheight
self_height = students.height
print self_height
sns.set(style='whitegrid')

cm = plt.cm.get_cmap(name='RdYlBu')
fig, ax = plt.subplots(figsize=(12, 10))

sc = ax.scatter(father_height, mother_height, s=(self_height - 50) * 10,
                c=self_height, cmap=cm, linewidth=0.2, alpha=0.5)

ax.grid()
# 右侧的颜色刻度
fig.colorbar(sc)

ax.set_xlabel("Father height", fontsize=14)
ax.set_ylabel("Mother height", fontsize=14)

plt.show()