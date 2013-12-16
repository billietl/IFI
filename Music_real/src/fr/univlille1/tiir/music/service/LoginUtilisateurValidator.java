package fr.univlille1.tiir.music.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import fr.univlille1.tiir.music.service.dto.Utilisateur;

public class LoginUtilisateurValidator implements Validator {

	/** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

	@Override
	public boolean supports(Class<?> arg0) {
		return Utilisateur.class.equals(arg0);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Utilisateur u = (Utilisateur) obj;
		if (u == null) {
            errors.rejectValue("percentage", "error.not-specified", null, "Value required.");
        }
        else {
            logger.info("Validating with " + u + ": " + u.getPseudo());
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pseudo", "", "Le pseudo ne peut pas etre vide.");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwd", "", "Le mot de passe ne peut pas etre vide.");
        }
	}

}
