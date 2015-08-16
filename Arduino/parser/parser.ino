#include <avr/pgmspace.h>
#include <Servo.h>

int MAX_BYTES = 16000;
const prog_char program[MAX_BYTES] PROGMEM;
char incomingByte;  // incoming serial data
char lastByte;
char* myStrings[]={"This is string 1", "This is string 2", "This is string 3",
"This is string 4", "This is string 5","This is string 6"};

Servo leftMotor;
Servo rightMotor;
int speed = 10; // higher number == slower robot
int leftLED = 3;
int rightLED = 5;
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

  if (Serial.available()) {
    /* read the most recent byte */
    incomingByte = Serial.read();
    
    /*Listen for a comma */
    if(incomingByte == 44){
      
      Serial.println();
      
    }else{
      
      /*ECHO the value that was read, back to the serial port. */
      Serial.write(byteRead);
      
    }
    
  }
  
  {
  char str[] ="- This, a sample string.";
  char * pch;
  printf ("Splitting string \"%s\" into tokens:\n",str);
  pch = strtok (str," ,.-");
  while (pch != NULL)
  {
    printf ("%s\n",pch);
    pch = strtok (NULL, " ,.-");
  }
  return 0;
}
}
