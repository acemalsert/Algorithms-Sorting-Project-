/*
	Author : Ahmet Cemal Sert
 */
public	class Person implements Comparable<Person> {

		private String name;
		private String surname;
		private long id;
		
		
		//Constructor
		public Person(String name, String surname, long id) {
			super();
			this.name = name;
			this.surname = surname;
			this.id = id;
		}



		//getters and setters 

		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getSurname() {
			return surname;
		}



		public void setSurname(String surname) {
			this.surname = surname;
		}



		public long getId() {
			return id;
		}



		public void setId(long id) {
			this.id = id;
		}



		@Override
		public int compareTo(Person that) {
			if(this.id>that.id) return +1;
			if(this.id<that.id) return -1;
				
			
			return 0;
		}

		
	}
	