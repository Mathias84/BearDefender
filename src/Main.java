import Bear.Bear.Hunger;
import Bear.Bear.Rank;
import Bear.Bear.Thirst;
import Bear.Doctor;
import Bear.General;
import Bear.Sniper;
import Bear.Soldier;
import Bear.Support;
import Town.Town;

public class Main {

	public static void main(String[] args) {

		Town town1 = new Town("Town1", 120, 200);
		Town town2 = new Town("Town1", 120, 200);
		Town town3 = new Town("Town1", 120, 200);

		General general1 = new General(1, "Yogi");

		Doctor doctor1 = new Doctor(Rank.A, 200, 12.4, 10, Hunger.no, Thirst.no);
		Sniper sniper1 = new Sniper(Rank.A, 200, 12.4, 10, Hunger.no, Thirst.no);
		Support support1 = new Support(Rank.A, 200, 12.4, 10, Hunger.no,
				Thirst.no);
		Soldier soldier1 = new Soldier(Rank.A, 200, 12.4, 10, Hunger.no,
				Thirst.no);

		general1.giveOrder(doctor1, town1);
		general1.giveOrder(sniper1, town1);
		general1.giveOrder(support1, town1);
		general1.giveOrder(soldier1, town1);
	}

}
