
public class Score {

	private int points = 0;
	private int money = 0;
	
	
	//score system
	public void addPoints(int point){
		this.points=this.points+point;
	}
	
	
	public int getPoints() {
		return points;
	}



	public void setPoints(int points) {
		this.points = points;
	}



	public int getMoney() {
		return money;
	}



	public void setMoney(int money) {
		this.money = money;
	}



	Score(){
		
	}


	public void addMoney(int money) {
		this.money=this.money+money;
		
	}
		
}
