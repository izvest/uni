public class Saha extends Tyokalupakki{
public Saha(){
	private String nimi = new String("Saha");
	tyokalut.add(this);
}
public boolean onTeroitettavissa(){
  return true;
  }
	public boolean onLadattavissa(){
  return false;
  }
	public String aani(){
	return "Krunch";
	}
}

}
