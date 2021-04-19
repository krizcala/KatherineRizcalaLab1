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
public class Camera implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Camera";
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
	 * The Camera starts recording video
	 */
	public void RecordsVideo() {
		// TODO Auto-generated method stub
		System.out.println("Video Recorded");
		Antenna myantenna = new Antenna();
		myantenna.Confirmed();
	}




}
