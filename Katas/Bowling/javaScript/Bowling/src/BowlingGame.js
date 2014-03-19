/**
 * Bowling Game
 */


/**
 * Constructor
 * @param {String}
 */
function bowlingGame() {

	this.score = 0;
	this.rolls = [];

};

bowlingGame.prototype = {

	scoreBowling: function() {
		for (var roll = 0; roll < this.rolls.length; roll++)
		{
			this.score += this.rolls[roll];
			if (this.rolls[roll -1] + this.rolls[roll - 2] == 10)
			{
				this.score += this.rolls[roll];
			}
		}
		return this.score;
	},

	roll: function(pins) {
		this.rolls.push(pins);
	}
};


