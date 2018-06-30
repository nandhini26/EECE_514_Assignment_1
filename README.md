# EECE_514_Assignment_1
Assignment 1
Automated Test generation

RANDOOP


Randoop-is an automated unit test case tool for java application

Regression test: new changes are impacting the existing test case

Randoop- Jpacman-class files tested:

nl.tudelft.jpacman.game.Game
nl.tudelft.jpacman.level.Player
nl.tudelft.jpacman.sprite.PacManSprites
nl.tudelft.jpacman.board.Square
nl.tudelft.jpacman.level.Level
nl.tudelft.jpacman.board.Board
nl.tudelft.jpacman.sprite.AnimatedSprite
nl.tudelft.jpacman.sprite.Sprite

Performance Monitoring:
Since the time taken to generate the test cases was high, I have used the following format multi-threaded option.

Nandhinis-Air:randoop-4.0.4 nandhini$ java -classpath .:./jpacman-framework.jar:./randoop-all-4.0.4.jar    randoop.main.Main gentests   --classlist=pacmanclasses-bak.txt --flaky-test-behavior=DISCARD    --usethreads


Active-MQ

Randoop-ActiveMQ-class files tested 

nl.tudelft.jpacman.game.Game
nl.tudelft.jpacman.level.Player
nl.tudelft.jpacman.sprite.PacManSprites
nl.tudelft.jpacman.board.Square
nl.tudelft.jpacman.level.Level
nl.tudelft.jpacman.board.Board
nl.tudelft.jpacman.sprite.AnimatedSprite
nl.tudelft.jpacman.sprite.Sprite                             


Performance Monitoring:
Since the time taken to generate the test cases was high, I have used the following format multi-threaded option.

java -classpath .:./activemq-all-5.15.4.jar:./randoop-all-4.0.4.jar    randoop.main.Main gentests   --classlist=activemqclasses.txt --flaky-test-behavior=DISCARD    --time-limit=60 --usethreads

Testing Method

1. Randoop was run with two option settings:

•	Time limit of 60 sec to generate the test cases
•	Without any time limit to generate the test cases

Details for each option is available in the folders names as follows:

Test_60sec-Activemq
Test_60sec-jpacman
Test_no time limit-Activemq
Test_no time limit-Activemq

Each folder contains:

Generated error revealing test files and Regression test files

Regression test cases were compiled and run and all of them passed. The output is available in the file” CommandsExecuted.docx”.

Error revealing test cases were compiled and run and the output of the test results are also given in the folder.
Jpacman:

1. jpacmanerrorrevealingtest
2. jpacmanerrorrevealingtest-nolimit

ActiveMQ:

1.activemqerrorrevealingtest
2.activemqerrorrevealingtest-nolimit 
Monkey

 (a) MovieGuide 
API key was received from movie guide site.
tmdb_api_key=7e58927f3c0c994fa720453614109035
Multiple runs were tested using Monkey-movie guide application.

(b) LeafPic
Multiple runs were tested using Monkey-Leaf pic application.

Details are available under the monkey  folders
