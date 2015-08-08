# Access Code 2.1 Final Project Proposal (Draft)

**Project Name: TBD**  
**Team Name: Access Robot**  
**Team Members: Jae Bales, Allison Bojarski, Ramona Harrison, Kadeem Maragh**  

## The Problem 

Our project aims to build an accessible, low-cost experimentation platform for programming and robotics.

Software paragraph. Existing resources:

Scratch - open source graphical programming language (free).
Tynker.com - online programming courses for kids ($50 (single course) - $250 (learning pathway)).

Hardware experimentation, in particular, has a high barrier to entry. Existing resources:

Little Bits (starter kits $99-199). 
Lego Mindstorm robotics kit ($349.99).
Boe-Bot - robot kit commonly used in schools ($159.99).

User paragraph: child learning independently, parent w/ child, teacher w/ class room.

## The Solution 

The platform consists of two parts: hardware (the robot) and software (an Android-based programming environment for controlling the robot).

 * Low cost DIY robot (less than $40) that functions well and looks good. Built from open source, easily acquired components. 
 * Simple enough for a kid to put together in a weekend. The app will include an assembly walkthrough.
 * Both graphical + text-based programming interfaces to control the robot with an Android device. 
 * Designed for learning and growth. No upper limit for 'hackability'.

By building on Android, our platform becomes accessible to the more than 1 billion Android users worldwide.

Ultimately, we want to inspire the learning skills and confidence for our users to engage with the platform, and with technology as a whole, as collaborators and creators.

#### Baseline features

The robot:
 * Built around a widely available open-source microcontroller (likely Arduino).
 * Forward, backward and rotational movement (2x servo motors).
 * Chassis constructed from low-cost and/or recycled materials (e.g. cardboard).
 * Battery powered and controlled via Bluetooth with an Android device.
 * Simple and flexible design encourages user modifications.
 
The app:
 * Android based programming environment.
 * Graphical programming language (think [Scratch](https://scratch.mit.edu/)) with native methods for controlling the robot.
 * Flexibility to modify and expand the language by creating new methods.
 * Option to move to a text based environment.
 * Elegant, enjoyable + easy to use UI/UX.
 * On first launch, the user is presented with a guide on sourcing and building the robot featuring illustration, text and/or video instructions.

#### Bonus features

 * Platform (web based?) for sharing robot patterns + programs.
 * Robot add-ons: lights, sensors, internet connectivity.
 * Translation to other spoken languages (e.g. Spanish).

### Wireframe

## Execution

#### Timeline

| Week | Date | Sprint | 
|----|----|---|
| Week 1 | Aug 7 - 9 | Research: Submit project proposal (8/9). Create wireframes. Research robot design and consolidate resources. Order hardware components for experimentation. |
| Week 2 | Aug 9 - 11 | Research II: Submit revised proposal (8/11). Begin experimenting with hardware and writing code to interface Android with hardware. Research programming environments for children. |
| Week 2 | Aug 11 - 16 | Development I: Build Android -- Hardware interface. Experiment with programming environment / language design. Experiment with robot design.|
| Week 3 | Aug 17 - 23 | Development II: Build out programming environment. Finalize robot design. |
| Week 4 | Aug 24 - 31 | Developement III: Enrich UI/UX. Build robot assembly walkthrough activity. Finalize app. |
| Week 5 | Sep 1, 7pm | First Release + Demo |
| Week 5 | Sep 2 - 8 | Testing I: Write tests and debug. Polish features for the second release. Implement bonuses. |
| Week 6 | Sep 9, 7pm | Second Release + Demo |
| Week 6 | Sep 10 - 14 | Testing II: Final round of testing and debugging. |
| Week 7 | Sep 15, 7pm | Final Demo Day |

#### Team Member Responsibilities

Jae:

UI/UX - Wireframes of screens, storyboards of new user experience, sitemap to show activities that users have access to from each activity, maintaining consistent design feel through the app, working with programming language to decide how the interface is setup.

Allison:

Creating a programming language to control the robot's movements - creating scratch like programming language that is engaging but easy to understand, drag and drop interface on android. Ensuring language is inline with robot's capabilities.

Kadeem:

Communication between android and arduino/robot - Communication between arduino and android device through serial port, ensuring our programming language commands are properly transferred between hardware, possibly use a translator.


Ramona:

Manages the team to ensure work is on track with timeline, rotates between jobs to help where needed, will help with the communication between arduino and anroid, will help with programming language, parts are already ordered and should be here between monday and tuesday.
