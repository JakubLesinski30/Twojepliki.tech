package aplikacja.logowanie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RepozytoriumLogowania extends JpaRepository<Uzytkownik, Long> {
	
	@Query("SELECT u FROM Uzytkownik u WHERE u.email = ?1")
	public Uzytkownik znajdzPoEmail(String email);

	@Query("SELECT u FROM Uzytkownik u WHERE u.kod_weryfikacyjny = ?1")
	public Uzytkownik znajdzPoKodzieWeryfikacyjnym(String code);
	
	@Query("SELECT u FROM Uzytkownik u WHERE u.username = ?1")
    public Uzytkownik znajdzPoUsername(String username);
	
	@Query("SELECT u FROM Uzytkownik u WHERE u.resetToken = ?1")
	public Uzytkownik znajdzPoTokenieResetowania(String token);
	
}
