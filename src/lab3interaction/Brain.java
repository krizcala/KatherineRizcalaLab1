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
public class Brain implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Brain" ;
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
	 * The Brain calculates route
	 */
	public void DefineDestination() {
		// TODO Auto-generated method stub
		System.out.println("Destination Determined");
		Brain mybrain = new Brain();
		mybrain.ExecuteCommand();
	}
	/**
	 * Brain executes command sent by NASA
	 */
	private void ExecuteCommand() {
		// TODO Auto-generated method stub
		System.out.println("Command Executed");
		Body mybody = new Body();
		mybody.NavigatesTerrain();
	}

}
