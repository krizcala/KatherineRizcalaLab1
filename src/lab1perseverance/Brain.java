/**
 * 
 */
package lab1perseverance;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author kathe
 *
 */
public class Brain implements SelfCheckCapable {
    String ProcessingSystem;
    int MemoryRam;
    String Version;
    String ModelType;
    /**
     * Start running the Rover
     */
    void start () {
	}
    /**
     * Tells the Rover to run faster
     */
    void Accelerate() {
	}
    /**
     * Tells the Rover to stop
     */
    void Break() {
	}
    /**
     * Checks if the system is running fine
     */
    void Systemcheck() {
	}
    /**
     * Run Commands to operate
     */
    void ExecuteCommands() {
	}
    /**
     * Generates Reports to Nasa
     */
    void CreatesReports() {
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}
