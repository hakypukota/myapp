import libardrone
from time import sleep
print """
DRONE
"""
print """
T-Takeoff
L - Land
ML - move left
MR - right
MD
MU
MF
MB
TL
TR
TIL
TIR"""

decision = str(input())
duration = int(input())

drone = libardrone.ARDrone()

if decision == t :
    print("I'm taking off")
    print("For",duration,"seconds")
    drone.takeoff()
elif decision == l :
    print("I'm landing")
    print("For",duration,"seconds")
    drone.land()
elif decision == ml :
    print("moving left")
    print("For",duration,"seconds")
    drone.move_left()
elif decision == mr :
    print("moving right")
    print("For",duration,"seconds")
    drone.move_right()
elif decision == md :
    print("Moving down")
    print("For",duration,"seconds")
    drone.move_down()
elif decision == mu:
    print("Moving up")
    print("For",duration,"seconds")
    drone.move_up()
elif decision == mf :
    print("Moving forward")
    print("For",duration,"seconds")
    drone.move_forward()
elif decision = mb :
    print("Moving back")
    print("For",duration,"seconds")
    drone.move_backward()
elif decision = tl :
    print("Turning left")
    print("For",duration,"seconds")
    drone.turn_left()
elif decision = tr :
    print("Turning right")
    print("For",duration,"seconds")
    drone.turn_right()
elif decision = til :
    print("Tilting left")
    print("For",duration,"seconds")
    drone.tilt_left()
elif decision = tir
    print("Tilting right")
    print("For",duration,"seconds")
    drone.tilt_right()

        
