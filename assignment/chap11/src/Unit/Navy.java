package Unit;


	public class Navy extends Unit{
	
		public Navy(String name) {

			super(name);

		}

		@Override
		public void attack() {

			System.out.println(super.getName()+" >> "+"��� �߻�");

			System.out.println(super.getName()+" >> "+"���� ���");

			this.inceus();

		}		

		public void inceus() {
			
			System.out.println(super.getName()+" >> "+"����� �⵿");
			
		}
	}


