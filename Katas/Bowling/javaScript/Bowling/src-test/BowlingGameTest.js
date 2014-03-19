/**
 * JS Test Driver unit tests for Bowling Game.
 */
BowlingGameTest = TestCase("BowlingGameTest");

BowlingGameTest.prototype.testGutterGame = function() {
	var game = new bowlingGame("GutterGame");
	assertEquals(0, game.scoreBowling());
};

BowlingGameTest.prototype.testOnePerThrowGame = function() {
	var game = new bowlingGame("OnePerThrowGame");
	for (var rollIndex = 0; rollIndex < 20; rollIndex ++)
	{
		game.roll(1);
	}
	assertEquals(20, game.scoreBowling());
}

BowlingGameTest.prototype.testSingleSpare = function() {
	var game = new bowlingGame("SingleSpare");
	game.roll(4);
	game.roll(6);
	game.roll(3);
	assertEquals(16, game.scoreBowling());
}