package handeling;

public class Event {
	private int  eid;
	private String title;
	private int  cusid;
	private String type;
	private String location;
	private String date;
	private String stime;
	private String etime;
	private String pid;
	
	public Event(int eid, String title, int cusid, String type, String location, String date, String stime, String etime, String pid) {
		super();
		this.eid = eid;
		this.title = title;
		this.cusid = cusid;
		this.type = type;
		this.location = location;
		this.date = date;
		this.stime = stime;
		this.etime = etime;
		this.pid = pid;
	}

	public int getEid() {
		return eid;
	}

	public String getTitle() {
		return title;
	}

	public int getCusid() {
		return cusid;
	}

	public String getType() {
		return type;
	}

	public String getLocation() {
		return location;
	}

	public String getDate() {
		return date;
	}

	public String getStime() {
		return stime;
	}

	public String getEtime() {
		return etime;
	}

	public String getPid() {
		return pid;
	}
}
