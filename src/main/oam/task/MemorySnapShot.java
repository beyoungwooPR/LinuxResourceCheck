package task;

public class MemorySnapShot {
	
	    private long memTotal;
	    private long memFree;
	    private long memBuffers;
	    private long memCached;

	    public long getMemTotal() {
	        return memTotal;
	    }

	    public void setMemTotal(long memTotal) {
	        this.memTotal = memTotal;
	    }

	    public long getMemFree() {
	        return memFree;
	    }

	    public void setMemFree(long memFree) {
	        this.memFree = memFree;
	    }

	    public long getBuffers() {
	        return memBuffers;
	    }

	    public void setBuffers(long memBuffers) {
	        this.memBuffers = memBuffers;
	    }

	    public long getCached() {
	        return memCached;
	    }

	    public void setCached(long memCached) {
	        this.memCached = memCached;
	    }
}
