package Unit;

public class UnitExample {

	public static void main(String[] args) {
		
		Unit[] units = new Unit[5];

		units[0] = new AirForce("제1전투비행단");

		if (units[0] instanceof Unit) {

			units[0].setName("제1전투비행단");

			units[0].attack();

		}

		System.out.println();

		units[1] = new AirForce("제38전투비행전단 ");

		if (units[1] instanceof Unit) {

			units[1].setName("제38전투비행전단 ");

			units[1].attack();

		}

		System.out.println();

		units[2] = new Navy("서애 류성용함");

		if (units[2] instanceof Unit) {

			units[2].setName("서애 류성용함");

			units[2].attack();

		}

		System.out.println();

		units[3] = new Army("맹호부대 ");

		if (units[3] instanceof Unit) {

			units[3].setName("맹호부대 ");

			units[3].attack();

		}

		System.out.println();

		units[4] = new Army("무적태풍부대");

		if (units[4] instanceof Unit) {

			units[4].setName("무적태풍부대 ");

			units[4].attack();

		}

	}
}
