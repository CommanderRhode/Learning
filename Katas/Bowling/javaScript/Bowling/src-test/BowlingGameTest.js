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

BowlingGameTest.prototype.testSingleStrike = function() {
	var game = new bowlingGame("SingleStrike");
	game.roll(10);
	game.roll(4);
	game.roll(5);
	assertEquals(28, game.scoreBowling());
}

BowlingGameTest.prototype.testPerfectGame = function() {
	var game = new bowlingGame("PerfectGame");
	for (var rollIndex = 0; rollIndex < 12; rollIndex ++)
	{
		game.roll(10);
	}
	assertEquals(300, game.scoreBowling());
}