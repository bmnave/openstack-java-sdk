package com.woorea.openstack.nova.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

@JsonRootName("server")
public class ServerForCreate implements Serializable {
	
	public static final class SecurityGroup implements Serializable {
		
		private String name;

		public SecurityGroup() {
		}
		
		public SecurityGroup(String name) {
			this.name = name;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		
	}
	
	public static final class Network implements Serializable { 
		
		private String uuid;
		
		private String fixed_ip;
		
		private String port;

		public Network() {
		}
		
		public Network(String uuid, String fixed_ip, String port) {
			this.uuid = uuid;
			this.fixed_ip = fixed_ip;
			this.port = port;
		}

		/**
		 * @return the network uuid
		 */
		public String getUuid() {
			return uuid;
		}

		/**
		 * @param uuid the network uuid to set
		 */
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		/**
		 * @return the IP address to assign to the interface
		 */
		public String getFixed_ip() {
			return fixed_ip;
		}

		/**
		 * @param name the IP address to set
		 */
		public void setFixed_ip(String fixed_ip) {
			this.fixed_ip = fixed_ip;
		}

		/**
		 * @return the port uuid
		 */
		public String getPort() {
			return port;
		}

		/**
		 * @param port the port uuid to set
		 */
		public void setPort(String port) {
			this.port = port;
		}
		
	}
	
	private String name;
	
	private String adminPass;
	
	private String imageRef;
	
	private String flavorRef;
	
	private String accessIPv4;
	
	private String accessIPv6;
	
	@JsonProperty("min_count")
	private Integer min;
	
	@JsonProperty("max_count")
	private Integer max;
	
	private String diskConfig;
	
	@JsonProperty("key_name")
	private String keyName;
	
	private List<PersonalityFile> personality = new ArrayList<PersonalityFile>();
	
	private Map<String, String> metadata = new HashMap<String, String>();
	
	@JsonProperty("security_groups")
	private List<SecurityGroup> securityGroups;
	
	@JsonProperty("networks")
	private List<Network> networks;
	
	@JsonProperty("user_data")
	private String userData;
	
	@JsonProperty("availability_zone")
	private String availabilityZone;

	@JsonProperty("config_drive")
	private boolean configDrive;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the adminPass
	 */
	public String getAdminPass() {
		return adminPass;
	}

	/**
	 * @param adminPass the adminPass to set
	 */
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}

	/**
	 * @return the imageRef
	 */
	public String getImageRef() {
		return imageRef;
	}

	/**
	 * @param imageRef the imageRef to set
	 */
	public void setImageRef(String imageRef) {
		this.imageRef = imageRef;
	}

	/**
	 * @return the flavorRef
	 */
	public String getFlavorRef() {
		return flavorRef;
	}

	/**
	 * @param flavorRef the flavorRef to set
	 */
	public void setFlavorRef(String flavorRef) {
		this.flavorRef = flavorRef;
	}

	/**
	 * @return the accessIPv4
	 */
	public String getAccessIPv4() {
		return accessIPv4;
	}

	/**
	 * @param accessIPv4 the accessIPv4 to set
	 */
	public void setAccessIPv4(String accessIPv4) {
		this.accessIPv4 = accessIPv4;
	}

	/**
	 * @return the accessIPv6
	 */
	public String getAccessIPv6() {
		return accessIPv6;
	}

	/**
	 * @param accessIPv6 the accessIPv6 to set
	 */
	public void setAccessIPv6(String accessIPv6) {
		this.accessIPv6 = accessIPv6;
	}

	/**
	 * @return the min
	 */
	public Integer getMin() {
		return min;
	}

	/**
	 * @param min the min to set
	 */
	public void setMin(Integer min) {
		this.min = min;
	}

	/**
	 * @return the max
	 */
	public Integer getMax() {
		return max;
	}

	/**
	 * @param max the max to set
	 */
	public void setMax(Integer max) {
		this.max = max;
	}

	/**
	 * @return the diskConfig
	 */
	public String getDiskConfig() {
		return diskConfig;
	}

	/**
	 * @param diskConfig the diskConfig to set
	 */
	public void setDiskConfig(String diskConfig) {
		this.diskConfig = diskConfig;
	}

	/**
	 * @return the keyName
	 */
	public String getKeyName() {
		return keyName;
	}

	/**
	 * @param keyName the keyName to set
	 */
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	/**
	 * @return the personality
	 */
	public List<PersonalityFile> getPersonality() {
		return personality;
	}

	/**
	 * @param personality the personality to set
	 */
	public void setPersonality(List<PersonalityFile> personality) {
		this.personality = personality;
	}

	/**
	 * @return the metadata
	 */
	public Map<String, String> getMetadata() {
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	/**
	 * @return the securityGroups
	 */
	public List<SecurityGroup> getSecurityGroups() {
		if(securityGroups == null) {
			securityGroups = new ArrayList<SecurityGroup>();
		}
		return securityGroups;
	}

	/**
	 * @return the networks
	 */
	public List<Network> getNetworks() {
		if(networks == null) {
			networks = new ArrayList<Network>();
		}
		return networks;
	}
	
	/**
	 * @return the userData
	 */
	public String getUserData() {
		return userData;
	}

	/**
	 * @param userData the userData to set
	 */
	public void setUserData(String userData) {
		this.userData = userData;
	}

	/**
	 * @return the availabilityZone
	 */
	public String getAvailabilityZone() {
		return availabilityZone;
	}

	/**
	 * @param availabilityZone the availabilityZone to set
	 */
	public void setAvailabilityZone(String availabilityZone) {
		this.availabilityZone = availabilityZone;
	}

	public boolean isConfigDrive() {
		return configDrive;
	}

	public void setConfigDrive(boolean configDrive) {
		this.configDrive = configDrive;
	}
}
