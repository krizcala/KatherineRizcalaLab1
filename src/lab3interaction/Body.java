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
public class Body implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Brain";
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
	 * The Body navigates area previously routed
	 */
	public void NavigatesTerrain() {
		// TODO Auto-generated method stub
		System.out.println("Terrain Navigated");
		Camera mycamera = new Camera();
		mycamera.RecordsVideo();
	}

}
