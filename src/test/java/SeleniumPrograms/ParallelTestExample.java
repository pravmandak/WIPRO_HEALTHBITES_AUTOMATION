package SeleniumPrograms;

import org.testng.annotations.Test;

public class ParallelTestExample {
	
	
@Test
public void LaunchChrome() {
	System.out.println("Chrome Browser Launched");
}

@Test
public void LaunchEdge() {
	System.out.println("Edge Browser Launched");
}

@Test
public void LaunchSafari() {
	System.out.println("Safari Browser Launched");
}

}
