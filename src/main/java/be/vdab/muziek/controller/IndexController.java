package be.vdab.muziek.controller;


import be.vdab.muziek.domain.Tracks;
import be.vdab.muziek.services.AlbumService;
import be.vdab.muziek.services.TrackService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    final AlbumService albumService;
    final TrackService trackService;

    public IndexController(AlbumService albumService, TrackService trackService) {
        this.albumService = albumService;
        this.trackService = trackService;
    }

    @GetMapping
    public ModelAndView mavMain(){
        ModelAndView mav = new ModelAndView("index");

        mav.addObject("albumsLijst",  albumService.findAll());


        return mav;
    }




    @GetMapping("/{idPathvariable}")
    public ModelAndView albumMav(@PathVariable int idPathvariable) {
        ModelAndView mav = new ModelAndView("album");
        mav.addObject("tracks",  trackService.findById(idPathvariable));
        mav.addObject("album", albumService.findById(idPathvariable).get());


        List<Tracks> t = trackService.findById(idPathvariable);
        for (Tracks temp : t){
            System.out.println(temp.getAlbumId() + temp.getNaam());
        }



        return mav;
    }
}
