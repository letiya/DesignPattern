package chapter7;

public class HomeTheaterFacade {
	
	Amplifier amp;
	Dvd dvd;
	
	public HomeTheaterFacade(Amplifier amp, Dvd dvd) {
		this.amp = amp;
		this.dvd = dvd;
	}
	
	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie..." + movie);
		amp.on();
		dvd.on();
	}
	
	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		amp.off();
		dvd.stop();
	}

}
