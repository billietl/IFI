package fr.univlille1.tiir.music.web.user;

import javax.servlet.ServletException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;


public class LoginUtilisateurFormController extends SimpleFormController{
	
	/** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    public ModelAndView onSubmit(Object command)
            throws ServletException {

        logger.info("returning from PriceIncreaseForm view to " + getSuccessView());

        return new ModelAndView(new RedirectView(getSuccessView()));
    }
    
}
