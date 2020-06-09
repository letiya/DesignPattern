package chapter7;

public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(new Amplifier(), new Dvd());
		homeTheater.watchMovie("Titanic");
		homeTheater.endMovie();
	}

}
