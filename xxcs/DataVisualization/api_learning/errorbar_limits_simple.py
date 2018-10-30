# _^^_coding: utf-8 _^^_


"""
误差棒：在散布图上，使用误差棒（error bar）注明所测量数据的不确定度的大小
Errorbar Limits
误差棒界限
Illustration of upper and lower limit symbols on errorbars
误差棒上下限符号的插图
"""


import numpy as np
import matplotlib.pyplot as plt


fig = plt.figure(0)
# x: [0. 1. 2. 3. 4. 5. 6. 7. 8. 9.]
x = np.arange(10.0)

# y: [0. 0.15643447 0.30901699 0.4539905  0.58778525 0.70710678
# 0.80901699 0.89100652 0.95105652 0.98768834]
y = np.sin(np.arange(10.0) / 20.0 * np.pi)

plt.errorbar(x, y, yerr=0.1)

y = np.sin(np.arange(10.0) / 20.0 * np.pi) + 1
plt.errorbar(x, y, yerr=0.1, uplims=True)

y = np.sin(np.arange(10.0) / 20.0 * np.pi) + 2
# upperlimits: [1 0 1 0 1 0 1 0 1 0]
upperlimits = np.array([1, 0] * 5)
# lowerlimits = [0 1 0 1 0 1 0 1 0 1]
lowerlimits = np.array([0, 1] * 5)
plt.errorbar(x, y, yerr=0.1, uplims=upperlimits, lolims=lowerlimits)

plt.xlim(-1, 10)

fig = plt.figure(1)
x = np.arange(10.0) / 10.0
y = (x + 0.1)**2

plt.errorbar(x, y, xerr=0.1, xuplims=upperlimits, xlolims=lowerlimits)

y = (x + 0.1)**3
plt.errorbar(x + 0.6, y, xerr=0.1, xuplims=upperlimits, xlolims=lowerlimits)

y = (x + 0.1)**4
plt.errorbar(x + 1.2, y, xerr=0.1, xuplims=True)

plt.xlim(-0.2, 2.4)
plt.ylim(-0.1, 1.3)

figure2 = plt.figure(2)
x = np.arange(10.0) / 10.0
y = x + 1

plt.errorbar(x, y, xerr=0.05, yerr=0.05, ecolor='#FF1D06', elinewidth=1, errorevery=1)

plt.show()


