package exercise_ch4_2;

public class Car {
	int tire;
	double maxSpeed;
	String color;
	
	public Car(){
		tire = 4;
	}
	
	public void Explain() {
		System.out.println("���� ��: " + color + "\t�ִ� �ӵ�: " + maxSpeed + "\tŸ�̾� ��: " + tire);
	}
	
	public static void main(String[] args) {
		Car tesla = new Car();
		Car porche = new Car();
		
		tesla.maxSpeed = 150.4;
		porche.maxSpeed = 220.7;
		
		tesla.color = "White";
		porche.color = "Red";
		
		tesla.Explain();
		porche.Explain();
	}
}
