import java.util.List;

/**
 * TODO create Account class to extend this class to Account in order to retrieve account infos
 * {@code @Account}
 * @author Tommaso
 */
public class CharacterSystemManaging {
	private List<Character> charactersList;

	/**
	 * Constructor
	 * @param charactersList
	 */
	public CharacterSystemManaging(List<Character> charactersList){
		this.charactersList=charactersList;
	}
	//setter&getter
	public List<Character> getCharactersList(){
		return charactersList;
	}
	public void setCharactersList(List<Character> charactersList) {
		this.charactersList = charactersList;
	}

}
