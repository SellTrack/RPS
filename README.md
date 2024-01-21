# :question: What is this project
 Java based expanded rock,paper and scissors game made with my friend Emre Yılmaz for School Project

 # :question: Which language and libraries used for this project
 This project developed using Java language and pygame libraries.

 # :question: What is required for play the game
 Java must be installed to computer

 # :question: How to run the game
 Simply drag the RPS file to vs code and run the tkm_game.java file

 # :video_game: About game
 This game takes your normal rock, paper and scissors game and takes a bit further. each item has his own health to live, power to damage, level to strenghten and xp to level up. each item deal and take damage by relying on calssic rps (rock,paper,scissors) rule. 

 ## :video_game: Game modes
 There is two way to play this game. 
 * Player vs. Computer
 * Computer vs. Computer

 ### :video_game: Player vs. Computer


[![image1](https://github.com/SellTrack/RPS/blob/main/RPS/sprites/readmeimage2.jpg?raw=true)](https://github.com/SellTrack/RPS/blob/main/RPS/sprites/readmeimage2.jpg?raw=true)


 You will need to select rock, paper or scissors 5 times. This game has round based system, so you will need to select one of your items for the round and opponent selects his owns.

 Each item deal and take damage themselves. Next round is no different. As round goes items hp will be deplate and not usable due to damages it took. The card which deal the last damage and eliminates his opponents item, will gain xp. 2 elimination will cause level up for that item and starts to deal damage even more . Game goes like this untill round limit. who has the most hp sum of all of his items wins the game.

[![image2](https://github.com/SellTrack/RPS/blob/main/RPS/sprites/readmeimage1.jpg?raw=true)](https://github.com/SellTrack/RPS/blob/main/RPS/sprites/readmeimage1.jpg?raw=true)



  :sparkles: You select your name and round limit

  :sparkles: You can select up to 3 from same item
 
  :exclamation: You need to select at least one from each item

  ### :video_game: Computer vs. Computer
  In this game mode, 2 sides selects item and plays. You will be just watching it. There is no round limit so one side must loose all of his items.
 
  Next round button starts a new round, finish button exits game before it finishes.

   :exclamation: There is quite a possible chance that game will lock and be in endless loop. Use finish button to exit the loop.


