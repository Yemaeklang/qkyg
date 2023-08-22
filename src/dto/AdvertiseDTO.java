package dto;

public class AdvertiseDTO {
	private String title;
	private String media_url;
	private String ori_prc;
	private double dc_rate;
	private String dc_prc;
	
	public AdvertiseDTO(String title, String media_url, String ori_prc, double dc_rate, String dc_prc) {
		super();
		this.title = title;
		this.media_url = media_url;
		this.ori_prc = ori_prc;
		this.dc_rate = dc_rate;
		this.dc_prc = dc_prc;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMedia_url() {
		return media_url;
	}

	public void setMedia_url(String media_url) {
		this.media_url = media_url;
	}

	public String getOri_prc() {
		return ori_prc;
	}

	public void setOri_prc(String ori_prc) {
		this.ori_prc = ori_prc;
	}

	public double getDc_rate() {
		return dc_rate;
	}

	public void setDc_rate(double dc_rate) {
		this.dc_rate = dc_rate;
	}

	public String getDc_prc() {
		return dc_prc;
	}

	public void setDc_prc(String dc_prc) {
		this.dc_prc = dc_prc;
	}
	
	

}
