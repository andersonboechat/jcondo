package br.com.abware.jcondo.core.model;

public class Flat extends Domain {

	private int block;
	
	private int number;
	
	public Flat() {
		// TODO Auto-generated constructor stub
	}

	public Flat(long id, int block, int number) {
		this();
		this.id = id;
		this.block = block;
		this.number = number;
	}

	public boolean equals(Object obj) {
		return super.equals(obj) || (block == ((Flat) obj).getBlock() && number == ((Flat) obj).getNumber());
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("{id: ").append(id).append(", block:").append(block).append(", number:").append(number).append("}");
		return sb.toString();
	}
	
	public int getBlock() {
		return block;
	}

	public void setBlock(int block) {
		this.block = block;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	

}
