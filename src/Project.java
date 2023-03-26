import modules.repositories.ConnectionDatabase;
public class Project {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		ConnectionDatabase teste = new ConnectionDatabase();
		teste.getConnection();
	}

}
