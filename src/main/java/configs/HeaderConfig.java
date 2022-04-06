package configs;

import java.util.ArrayList;
import java.util.List;

import entities.Link;

public class HeaderConfig {
	List<Link> links;

	public HeaderConfig(List<Link> links) {
		super();
		this.links = links;
	}
	
	public HeaderConfig() {
		this.links = new ArrayList<Link>();
		this.links.add(new Link("Home", "/home"));
		this.links.add(new Link("About", "/about"));
		this.links.add(new Link("Contact", "/contact"));
		this.links.add(new Link("Pricing", "/pricing"));
		this.links.add(new Link("Services", "/services"));
		this.links.add(new Link("Services", "/services"));
		this.links.add(new Link("Services", "/services"));
		this.links.add(new Link("Services", "/services"));
		this.links.add(new Link("Services", "/services"));
		this.links.add(new Link("Services", "/services"));
		this.links.add(new Link("Services", "/services"));
		this.links.add(new Link("Services", "/services"));
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
	
}
