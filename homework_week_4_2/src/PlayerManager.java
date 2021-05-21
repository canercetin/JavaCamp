
public class PlayerManager implements PlayerService {
	
	private PlayerCheckManager playerCheckManager = new PlayerCheckManager();
	
	public PlayerManager(PlayerCheckManager playerCheckManager) {
		this.playerCheckManager = playerCheckManager;
	}
	
	public void addPlayer(Player player) {
		if(playerCheckManager.checkPlayerInfo(player))
		{
			System.out.println("Player Added: "+player.getName()+" "+player.getSurname());
		}else { System.out.println("Invalid Person!"); }
	}
	public void deletePlayer(Player player) {
		System.out.println("Player deleted: "+player.getName()+" "+player.getSurname());
	}
	public void updatePlayerInfo(Player player, String tcNo, String name, String surname, String birthYear) {

		if(playerCheckManager.checkPlayerInfo(player))
		{
			player.setTcNo(tcNo);
			player.setName(name);
			player.setSurname(surname);
			player.setBirthYear(birthYear);	
			
			System.out.println("Information Updated: "+player.getName()+" "+player.getSurname());
			
		}else { System.out.println("Invalid Person!"); }
	}

}
