#include <Servo.h>

char incomingByte;  // incoming serial data

Servo leftMotor;
Servo rightMotor;
int leftLED = 9;
int rightLED = 10;
 
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
    
    if(incomingByte == '0') {
       digitalWrite(leftLED, LOW);  // if 1, switch LED Off
       digitalWrite(rightLED, HIGH); // if 0, switch LED on
       
    }
    
    if(incomingByte == '1') {
       digitalWrite(leftLED, HIGH); // if 0, switch LED on
       digitalWrite(rightLED, LOW); // if 0, switch LED on
    }
    
    if(incomingByte == 'w') {
       // go forward
       rightMotor.write(180);
       leftMotor.write(0);
       
    }
    
    if(incomingByte == 'z') {
       // go backward
       rightMotor.write(0);
       leftMotor.write(180);
    }
    
    if(incomingByte == 'a') {
       // turn left
       rightMotor.write(180);
       leftMotor.write(180);
    }
    
    if(incomingByte == 's') {
       // turn right
       rightMotor.write(0);
       leftMotor.write(0);
    }
    
    if(incomingByte == 'x') {
       // stop
       rightMotor.write(90);
       leftMotor.write(90);
    }
    
  }
}
