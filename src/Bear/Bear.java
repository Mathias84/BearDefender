package Bear;

import Town.Town;

public class Bear {

	// 3 énumérations : le rang, la faim et la soif
	public enum Rank {
		A, B, C, D
	}

	public enum Hunger {
		yes, no
	}

	public enum Thirst {
		yes, no
	}

	public Rank rank;
	protected int lifeMax;
	protected int currentLife;
	protected double strenght;
	protected double defense;
	public Hunger hunger;
	public Thirst thirst;

	public Bear(Rank rank, int lifeMax, double strenght, double defense,
			Hunger hunger, Thirst thirst) {

		this.rank = rank;
		this.lifeMax = lifeMax;
		this.currentLife = lifeMax;
		this.strenght = strenght;
		this.defense = defense;
		this.hunger = hunger;
		this.thirst = thirst;

	}

	public void training() {

	}

	public void gainExperiment() {

	}

	public void attack(Town town) {

	}

}
