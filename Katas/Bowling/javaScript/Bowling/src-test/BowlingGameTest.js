/**
 * JS Test Driver unit tests for Bowling Game.
 */
BowlingGameTest = TestCase("BowlingGame");

BowlingGameTest.prototype.testGutterGame = function() {
	var game = new bowlingGame("GutterGame");
	assertEquals(0, game.scoreBowling());
};