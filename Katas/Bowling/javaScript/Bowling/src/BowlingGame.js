/**
 * Bowling Game
 */


/**
 * Constructor
 * @param {String}
 */
function bowlingGame() {

	this.score = 0;

};

bowlingGame.prototype = {

	scoreBowling: function() {
		return this.score;
	},

	roll: function() {
		this.score += 1;
	}
};


