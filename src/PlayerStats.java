
public class PlayerStats {
	/**
	 * This is documentation for my new method/function. For our purposes, just
	 * comment about what the method does.
	 *
	 * This method finds the largest number in an array of Doubles
	 */

	public static Double findMax(double[] playerPointsPerGame) {
//Create a variable to hold the max number
		double maxPoints = playerPointsPerGame[0];
//Find the max number
		for (int i = 0; i < playerPointsPerGame.length; i++) {
			if (maxPoints < playerPointsPerGame[i]) {
				maxPoints = playerPointsPerGame[i];
			}
		}
//Return the max number
		return maxPoints;
		
	}
//Below is where the normal "Main" for our program goes.

	

	//Below is where the normal "Main" for our program goes.
	
		public static void main(String[] args) {
	//Create our two arrays for each team:
			double[] GSWStats = { 27.8, 27, 22.4, 15.8, 7.0, 6.5, 6.1 };
	//Create the OKCStats array below:
			double[] OKCStats = { 28.2, 23.1, 15.5, 14.1, 13.3, 6.7, 6.5 };
	//Find out which team has the member who makes the most points per game:
			double gswBestPlayer = findMax(GSWStats);
	//Find the most points per game made by a player on the OKC team
			double okcBestPlayer = findMax(OKCStats);
	//Finish the conditionals below:
	
			if (gswBestPlayer > okcBestPlayer) {
				System.out.println("Golden State has a player that makes the most points per game.");
			} else if (okcBestPlayer > gswBestPlayer) {
				System.out.println("Oklahoma City has a player that makes the most points per game.");
	
			} else {
				System.out.println("The best player of both teams averages the same points per game!");
			}
		}
}