package Bear;

import Town.Town;

public class Doctor extends Bear implements IAttack {

	public Doctor(Rank rank, int currentLife, double currentStrenght,
			double currentDefense, Hunger hunger, Thirst thirst) {
		super(rank, currentLife, currentStrenght, currentDefense, hunger,
				thirst);
		// TODO Auto-generated constructor stub
	}

	public void heal(Bear bear) {

		if (this.rank == Rank.A) {

			bear.currentLife += 160;

		} else {
			if (this.rank == Rank.B) {

				bear.currentLife += 80;

			} else {
				if (this.rank == Rank.C) {

					bear.currentLife += 40;

				} else {

					bear.currentLife += 20;

				}

			}

		}

	}

	public void attack(Town town) {

	}

}
