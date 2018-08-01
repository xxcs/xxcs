#!/usr/bin/python3.6
# coding: utf-8

import os
import pandas as pd
import pandas as pd
import seaborn as sns
import seaborn as sns
import matplotlib.pyplot as plt
import matplotlib.pyplot as plt

pwd = os.getcwd()
csv_file = pwd + os.sep + "ucdavis.csv"
print(csv_file)
students = pd.read_csv(csv_file)
g = sns.FacetGrid(students, hue="gender", palette="Set1", height=6)
g.map(plt.scatter, "gpa", "computer", s=250, linewidth=0.65, edgecolor="white")

g.add_legend()
