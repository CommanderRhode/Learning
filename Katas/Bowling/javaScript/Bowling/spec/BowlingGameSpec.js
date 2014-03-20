describe("BowlingGame", function(){
	var game;

	beforeEach(function() {
		game = new bowlingGame();
	});


	it("should score 0 in a gutter game", function(){
		expect(game.scoreBowling()).toEqual(0);
	});

	it("should score 20 when each roll scores 1", function(){
		for (var rollIndex = 0; rollIndex < 20; ++ rollIndex)
		{
			game.roll(1);
		}
		expect(game.scoreBowling()).toEqual(20);
	});

	it("should know how to score a spare", function(){
		game.roll(4);
		game.roll(6);
		game.roll(3);
		expect(game.scoreBowling()).toEqual(16);
	});

	it("should know how to score a strike", function(){
		game.roll(10);
		game.roll(4);
		game.roll(5);
		expect(game.scoreBowling()).toEqual(28);
	});

	it("should score 300 when a perfect game is played", function(){
		for (var rollIndex = 0; rollIndex < 12; ++ rollIndex)
		{
			game.roll(10);
		}
		expect(game.scoreBowling()).toEqual(300);
	})
});