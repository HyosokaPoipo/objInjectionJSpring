package hisokaSpring;

public class Hisoka {

	private Jutsu mainJutsu;
	private Jutsu secretJutsu;
	private Jutsu favoriteJutsu;
	
	public Jutsu getMainJutsu() {
		return mainJutsu;
	}
	public void setMainJutsu(Jutsu mainJutsu) {
		this.mainJutsu = mainJutsu;
	}
	public Jutsu getSecretJutsu() {
		return secretJutsu;
	}
	public void setSecretJutsu(Jutsu secretJutsu) {
		this.secretJutsu = secretJutsu;
	}
	public Jutsu getFavoriteJutsu() {
		return favoriteJutsu;
	}
	public void setFavoriteJutsu(Jutsu favoriteJutsu) {
		this.favoriteJutsu = favoriteJutsu;
	}
	
	public void showDetails()
	{
		System.out.println("Detail Info of Hisoka :");
		System.out.println("Main Jutsu : "+mainJutsu.getJutsuName()+", "+mainJutsu.getValue());
		System.out.println("Secret Jutsu : "+secretJutsu.getJutsuName()+", "+secretJutsu.getValue());
		System.out.println("Secret Jutsu : "+favoriteJutsu.getJutsuName()+", "+favoriteJutsu.getValue());		
	}
	
}
