import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt
import os


dir_path = os.path.dirname(os.path.realpath(__file__))
csv_file = dir_path + os.sep + 'ucdavis.csv'

students = pd.read_csv(csv_file)
g = sns.FacetGrid(students, hue="gender", palette="Set1", height=6)
g.map(plt.scatter, "gpa", "computer", s=250, linewidth=0.65, edgecolor="white")

g.add_legend()










