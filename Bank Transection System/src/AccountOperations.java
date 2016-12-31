import java.sql.SQLException;
import java.util.List;

/**
 * Created by emperor on 12/29/16.
 */
public interface AccountOperations {

    boolean addAccount(AccountDetails accountDetails) throws SQLException;
    int addAccounts(List<AccountDetails> accountDetailsList) throws SQLException;
    boolean removeAccount(int accountNumber) throws SQLException;
    boolean updateAccount(AccountDetails accountDetails) throws SQLException;



}
