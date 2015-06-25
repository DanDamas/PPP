package pack4_Set_de_Computere_cu_HashCode;

public class Computer {

	private String marca;
	private int ram;
	private double frecventa;
	
	public Computer(String marca, int ram, double frecventa) {
		super();
		this.marca = marca;
		this.ram = ram;
		this.frecventa = frecventa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getFrecventa() {
		return frecventa;
	}

	public void setFrecventa(double frecventa) {
		this.frecventa = frecventa;
	}

	@Override
	public String toString() {
		return "Computer [marca=" + marca + ", ram=" + ram + ", frecventa="
				+ frecventa + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(frecventa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ram;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (Double.doubleToLongBits(frecventa) != Double
				.doubleToLongBits(other.frecventa))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (ram != other.ram)
			return false;
		return true;
	}
	
	
	
	
	
	
}
