input = open("../../input/day3").readlines()

width = len(input[0])
xpos = 0
ctr = 0

for line in input:
    if line[xpos] == '#':
        ctr = ctr + 1
    xpos = (xpos + 3) % width

print(ctr)
