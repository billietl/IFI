package fr.univlille1.tiir.music.web.music;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.univlille1.tiir.music.service.dto.Music;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListMusicController implements Controller {

    protected final Log logger = LogFactory.getLog(getClass());

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        logger.info("Returning list_music view");
        
        List<Music> l = new ArrayList<Music>();
        
        Music m = new Music();
        m.setId(1);
        m.setArtiste("Justin Bieber");
        m.setTitre("Baby");
        m.setMoyenne(0);
        l.add(m);
        m = new Music();
        m.setId(2);
        m.setArtiste("Red Hot Chili Peppers");
        m.setTitre("Scar Tissue");
        m.setMoyenne(5);
        l.add(m);
        m = new Music();
        m.setId(3);
        m.setArtiste("Soul Grind");
        m.setTitre("Farewell to misery");
        m.setMoyenne(4);
        l.add(m);
        
        return new ModelAndView("music/list", "list", l);
    }

}