package Bear;

import Town.Town;

public class General {

	private int id;
	private String nom;

	public General(int id, String nom) {

		this.id = id;
		this.nom = nom;

	}

	public void giveOrder(Bear bear, Town town) {

		bear.attack(town);

	}

}
