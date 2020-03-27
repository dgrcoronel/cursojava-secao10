package entities;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {

	}

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return name;
	}
	
	public void setNome(String nome) {
		this.name = nome;
	}
	
	public Double getSalario() {
		return salary;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
	public void increaseSalary(double percentage) {
		salary *= 1 + percentage / 100;
	}
	
	
	
}
