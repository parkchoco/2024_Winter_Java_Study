package exercise_01;

class TV {
	String company;
	int year;
	int size;
	
	public TV(String company, int year, int size) {
		this.company = company;
		this.year = year;
		this.size = size;
	}
	
	public void show() {
		System.out.println(company + "���� ���� " + year + "���� " + size + "��ġ TV");
	}
}
