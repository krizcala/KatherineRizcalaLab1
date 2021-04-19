/**
 * 
 */
package lab3interaction;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author kathe
 *
 */
public class Antenna implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Antenna";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.35);

	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Antenna myantenna = new Antenna();
		myantenna.Listens();

	}
	/**
	 * The Antenna listens for information from NASA
	 */
	private void Listens() {
		// TODO Auto-generated method stub
				System.out.println("Antenna Listened");
				Brain mybrain = new Brain();
				mybrain.DefineDestination();

	}
	/**
	 * The Antenna confirms video was sent to NASA
	 */
	public void Confirmed() {
		// TODO Auto-generated method stub
		System.out.println("Data Confirmed");
	}

}
