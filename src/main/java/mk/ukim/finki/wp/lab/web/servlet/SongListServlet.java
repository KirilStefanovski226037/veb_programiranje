package mk.ukim.finki.wp.lab.web.servlet;

import mk.ukim.finki.wp.lab.model.Song;
import mk.ukim.finki.wp.lab.service.SongService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.web.IWebExchange;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "songList-servlet", urlPatterns = "/listSongs")
public class SongListServlet extends HttpServlet {
    private final SongService songService;
    private final SpringTemplateEngine springTemplateEngine;
    public List<Song> songList = null;


    public SongListServlet(SongService songService, SpringTemplateEngine springTemplateEngine) {
        this.songService = songService;
        this.springTemplateEngine = springTemplateEngine;
        this.songList = songService.listSongs();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IWebExchange webExchange = JakartaServletWebApplication
                .buildApplication(getServletContext())
                .buildExchange(req, resp);
// <!-- Display radio buttons for each song,
//                        the value should be the trackId
//                        and the displayed text should be Title: <songTitle>, Genre:<genre>, Release Year: <releaseYear> -->
        WebContext context = new WebContext(webExchange);
        context.setVariable("songs",songList);
        springTemplateEngine.process("listSongs.html", context, resp.getWriter());
    }
}
