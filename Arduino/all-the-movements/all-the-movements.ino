#include <Servo.h>

char incomingByte;  // incoming serial data
char lastByte;

Servo leftMotor;
Servo rightMotor;
int leftLED = 3;
int rightLED = 5;
int speed = 10; // higher number == slower robot
int brightness = 0; 
int fadeAmount = 5;
 
void setup() {
  
  Serial.begin(9600); // initialization
  
  leftMotor.attach(13);
  rightMotor.attach(12);
  
  pinMode(rightLED, OUTPUT);
  pinMode(leftLED, OUTPUT);
  
}
 
void loop() {
  
  if (Serial.available() > 0) {  // if the data came
    incomingByte = Serial.read(); // read byte
  }
  
    if(incomingByte == 'g') {
       fade();
    }
    
    if(incomingByte == 'p') {
       rightLight();
    }
    
    if(incomingByte == 'q') {
       leftLight();
    }
    
    if(incomingByte == 'f') {
       moveForward();   
    }
    
    if(incomingByte == 'b') {
       moveBackward();
    }
    
    if(incomingByte == 'l') {
      if (lastByte != 'l') {
        for (int i = 0; i < 1750; i++) { 
         turnLeft();
        }
      } else {
        moveForward();
      }
    }
    
    if(incomingByte == 'r') {
      if (lastByte != 'r') {
        for (int i = 0; i < 1750; i++) { 
         turnRight();
        }
      } else {
        moveForward();
      }
    }
    
    if(incomingByte == 'x') {
      stopMoving();
    }
    
    if(incomingByte == 'u') {
      lookCute();
    }
    
    lastByte = incomingByte;
     delay (speed);
  
}

void leftLight() {
   digitalWrite(leftLED, HIGH); // if 0, switch LED on
   digitalWrite(rightLED, LOW); // if 0, switch LED on
}

void rightLight() {
   digitalWrite(leftLED, LOW);  // if 1, switch LED Off
   digitalWrite(rightLED, HIGH); // if 0, switch LED on
}

void moveForward() {
   rightMotor.write(180);
   leftMotor.write(0);
}

void moveBackward() {
   rightMotor.write(0);
   leftMotor.write(180);
}

void turnRight() {
   rightMotor.write(0);
   leftMotor.write(0);
}

void turnLeft() {
   rightMotor.write(180);
   leftMotor.write(180);
}

void stopMoving() {
   rightMotor.write(90);
   leftMotor.write(90);
}

void lookCute() {
  
  for (int i = 0; i < 100; i++) { 
     if (i % 2 == 0) {
       turnLeft();
       rightLight();
     } else {
       turnRight();
       leftLight();
     }
     delay(10);
  }
  
  incomingByte = 'x';
}

void fade() {
  analogWrite(rightLED, brightness);
  analogWrite(leftLED, brightness);   
  brightness = brightness + fadeAmount;
  if (brightness == 0 || brightness == 255) {
    fadeAmount = -fadeAmount ; 
  }      
  delay(30);      
}
