
Java 2D Platformer Game
This is a university-level project: a complete 2D platformer game developed in Java , design patterns, and SOLID architecture. Built as an individual assignment for the "Design Patterns" subject.

Project Overview
The project implements a 2D platformer where the player controls a character, fights enemies, collects items, and completes levels. The logic is implemented using modular architecture and clean OOP practices.

Design Patterns Used
Pattern	Where It's Used	Description
Singleton	Game.java	The Game class manages the game's lifecycle and is instantiated once.
State	gamestates/ (Menu, Playing, Options, GameOver)	Switches between states like Menu, Gameplay, Pause, and End.
Strategy	entities/Enemy.java and subclasses (Crabby, Shark, etc.)	Different enemy behaviors are implemented via inheritance.
Observer	GamestateManager + AudioPlayer	AudioPlayer listens for game state changes to play different sounds.
Command	inputs/commands/*.java (MoveLeftCommand, JumpCommand, etc.)	Each user action is wrapped in a command class.
Factory Method	ObjectManager, LevelManager	Generates level objects based on type (potions, spikes, trees).
Facade	ResourceManager.java	Centralized resource loading interface.



Key Classes Description
Class	Purpose
Game	Main singleton game class.
GamePanel	JPanel that renders the game.
GameWindow	JFrame window handler.
GamestateManager	Manages current game state (Observer).
Playing	Main gameplay state (State).
AudioPlayer	Handles background music and SFX.
Player	Main controllable character.
Enemy / Crabby	Enemy hierarchy with different behaviors.
ObjectManager	Manages all in-game objects.
LevelManager	Loads and parses level maps.
InputCommand	Handles key input actions (Command).
ResourceManager	Loads and caches sprites and assets.
Conclusion
This game demonstrates a modular and scalable design using core object-oriented principles and modern design patterns. It's well-suited for showcasing knowledge in Java architecture, SOLID principles, and clean code.
