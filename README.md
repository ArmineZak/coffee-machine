# Coffee-machine
This program gives instruction how to make coffee and calculates the amount of ingredients needed to make a certain amount of coffee.


# Calculation of ingredients 
This part of the program calculates the amount of ingredients needed to make a certain amount of coffee.
It asks user to input necessary amount of ingredients.


# Enough coffee
This part calculates whether the machine will be able to make the required amount of coffee from the specified amount of ingredients.
It uses input to fill the amount of ingredients, calculates the minimum amount of cups that can be made for each variety of coffee and gives information if it is possible to make asked cups of coffee and offers more cups if possible to make.


# Machine in Action
This part of the program offers to buy one cup of coffee or to fill the ingredients or to take it's money. At the same time, the program calculates how many ingredients it has left. And also displays the number of ingredients before and after purchase.


# Coffee loop
This part of the program works endlessly to make coffee until the shutdown signal is given.
It uses several methods. Each is responsibel for spicific function that coffee machine does  - buy, fill, take, remain, back and exit. Machine loops over and over again asking whitch achtion to choose and stops when is choosen exit option.


# Coffee Machine Power
Coffee machine has several states. Every time the user inputs something and a program passes that line to the method, the program determines how to interpret this line using the information about the current state. After processing this line, the state of the coffee machine can be changed or can stay the same.