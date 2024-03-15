import math
import os
import random
import re
import sys

# Complete the solve function below.
def solve(s):
    for i in range(0,len(s)):
        if (s[i]==' '):
            s[i+1]=s[i+1].upper()
if __name__ == '__main__':
    

    s = input()

    result = solve(s)

    print(result)
    