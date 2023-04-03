import time

n = 1
count = 0
while True:
    n *= 2
    count += 1
    print(f"2の{count}乗は、{n}")
    time.sleep(0.2)