package Unit;


	public class Navy extends Unit{
	
		public Navy(String name) {

			super(name);

		}

		@Override
		public void attack() {

			System.out.println(super.getName()+" >> "+"어뢰 발사");

			System.out.println(super.getName()+" >> "+"지상 상륙");

			this.inceus();

		}		

		public void inceus() {
			
			System.out.println(super.getName()+" >> "+"잠수정 출동");
			
		}
	}


