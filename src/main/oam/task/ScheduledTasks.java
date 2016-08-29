package task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	@Scheduled(fixedRate = 5000)
	public void LinuxResourceCheck() {

		MemoryGetCurrentValue mem = new MemoryGetCurrentValue();
		mem.CurrentMemoryStatus();
		System.out.println("mem usage: " + mem.getUsage() + "%, " 
				+ mem.getMemFree() + "/" + mem.getMemTotal());
	}

}
