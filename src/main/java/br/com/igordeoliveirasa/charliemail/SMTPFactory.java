package br.com.igordeoliveirasa.charliemail;

/**
 *
 * @author igor
 */
public class SMTPFactory {
    public static ISMTP build(String smtpHost, String username, String password) {
        return new SimpleSMTP(smtpHost, username, password);
    }
}
