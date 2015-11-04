<<<<<<< HEAD
package NPC;

public class NPC {

	private boolean dead;
	private String trade;
	private String NPC;

	public NPC(boolean dead, String trade, String nPC) {
		this.dead = dead;
		this.trade = trade;
		NPC = nPC;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
	}

	public String getNPC() {
		return NPC;
	}

	public void setNPC(String nPC) {
		NPC = nPC;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}

	public boolean isDead()
	{
		return dead;
	}

	public void attack() {

		//this should bring down health points of the main player
	}

	public void die() {
		

	}

}
=======
package NPC;

public class NPC
{

	private boolean dead;
	private String trade;
	private String NPC;

	public boolean isDead()
	{
		return dead;
	}

	public void attack()
	{

		//this should bring down health points of the main player
	}

	public void die()
	{

	}

}
>>>>>>> branch 'master' of https://github.com/keanthony/SD1-Project.git
