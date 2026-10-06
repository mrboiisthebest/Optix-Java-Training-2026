# Let's Make Pokemon!

## Rules
1. All classes must be in their own file (Packages)

2. Must use public and private appropriately in all instance variables and methods (Encapsulation!)

3. Must have comments above each method breifly explaining what it is intended to do
  
4. Must have an abstract class “Pokemon” that all individual pokemon inherit from (Abstraction!)

     a. Must have an instance variable for health

     b. Must have an instance variable for name

     c. Must have a non-default constructor taking in parameters for initial health and name values and setting the instance variables to those values

     d. Must have a defined (regular) method “take damage” that intakes an integer parameter and subtracts that value from health

     e. Must have abstract method “attack” that intakes a parameter of a Pokemon object (Abstraction!)

     f. Must have a getter “getIsFainted” that returns true or false for if the pokemon is dead (health <=0)

     g. Must have a getter "getName" that returns the name of the pokemon

5. Must have a child class for individual pokemon (i.e. public class Jigglypuff) that extends (inherits from) Pokemon. Must make 1, it'd be better practice to make 2

     a. Must overload (@override) the "attack" method (method polymorphism!). Call the "take damage" method of that pokemon inside of this method, passing in however much damge the attack is meant to do (subtype polymorphism!). If you want other effect to happen, put them here too!

     b. Must have a default constructor setting the "health" and "name" variables to reasonable default values (i.e.  14, "Jigglypuff")

     c. Must have a non-default constructor that sets "health" and "name" to values given in the parameters (method polymorphism!)

6. Within a main method, make default objects of your pokemon and have them fight!

     a. In a while loop that continues until one or both pokemon have fainted, have them take turns attacking each other, passing the object of the defender into the attack method of the attacker

     b. Print out the name of your winner!

7. Repeat 7, but with non-default objects of your pokemon (different health, different names)


## When you Finish

1. Make sure you commit changes to github

2. Make sure you push your changes (send them to the cloud)

3. Make a Pull Request on your own github repo, see slides for how. In it, have your description/comment for it include the following:
    
     a. Explain why Pokemon should be an abstract class
   
     b. Explain why inheriting from Pokemon is useful
   
     c. Explain an example of method polymorphism in your code
   
     d. Explain an example of subtype polymorphism in your code
   
     e. Explain why you made one of your methods public
   
     f. Explain why you made one of your instance variables private
   
Your explanations should have a bit of detail relating to specific parts of your code, not just citing things I've said or are written in these instructions

3. Send a link to your github pull request to @Noah over discord. 

If you get it to me before Saturday, I will for sure review it before the end of the weekend. If you get it to me before Tuesday, I will review it before the next weekend


## Optional Further Practice
- Include Types (water, fire, grass) with strengths and weaknesses
- Include multiple different attacks on each pokemon
- Include levels that assign health values and change the damage dealt in the attack method
- Make "status conditions" (sleep, paralysis, poison) that have a percent chance to activate after an attack (import java.util.Random;, google how to use it to get random values)
- Give attacks a chance to miss

