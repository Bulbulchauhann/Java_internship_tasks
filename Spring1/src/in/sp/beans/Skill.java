package in.sp.beans;

public class Skill {
	String web;
	String cloud;
	String ai;
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getCloud() {
		return cloud;
	}
	public void setCloud(String cloud) {
		this.cloud = cloud;
	}
	public String getAi() {
		return ai;
	}
	public void setAi(String ai) {
		this.ai = ai;
	}
	@Override
	public String toString() {
		return "Skill [web=" + web + ", cloud=" + cloud + ", ai=" + ai + "]";
	}

}
