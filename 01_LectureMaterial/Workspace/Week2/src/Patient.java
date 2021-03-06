
public class Patient {
	
	private String name;
	private String id;
	private String address;
	private String phoneNumber;
	
	public Patient(	String name,
					String id,
					String address,
					String phoneNumber){
		this.name = name;
		this.id = id;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Patient [name=" + this.getName() + ", id=" + this.getId() + ", address=" + this.getAddress() + ", phoneNumber=" + this.getPhoneNumber() + "]";
	}
	
	public boolean equals(Patient p) {
		return 	this.getName().equals(p.getName()) &&
				this.getId().equals(p.getId()) &&
				this.getAddress().equals(p.getAddress()) &&
				this.getPhoneNumber().equals(p.getPhoneNumber());


	}


	public static void main(String[] args) {
		Patient p1 = new Patient("John Smith", "123", "SoCS", "12345665");
		Patient p2 = new Patient("John Smith", "123", "SoCS", "12345665");
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p1.equals(p2));
		
		
	}
	
}
