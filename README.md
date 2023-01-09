# GasStation
solving gas Station problem


PROBLEM DESCRIPTION:

There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.

Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique


SOLUTION DESCRIPTION:

LINE (4) makes sure there is gas at every station, and returns -2 if otherwise.

LINE (7) (D0-WHILE LOOP) checks each station if there is enough gas to move to the next.

LINE (8) if line (7) is true, I fills up tank and move.

LINE (15) it cost "cost[n]" of gas to move to next station.

LINE (17) if at any time we run out of gas before completing the circuit i break out of the for-loop, check if I can start from the next station.

LINE (20-23) if I am not at the starting index continue. otherwise, stop and return my starting index.

LINE (31-35) add available gas at every sation.

LINE (40) if I make a round circuit stop the car. regardless. 


LINE (46-62) CONTAINS TEXT 4 CASES COMMENTED OUT. EACH CAN BE DE-COMMENTED AND RUN.

Thank you for viwing my project. If you think I can improve this algorithm pls let me know. email me at my.mail66@yahoo.com
