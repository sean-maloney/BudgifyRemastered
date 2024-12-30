package ie.atu.songservice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/songs")
@CrossOrigin(origins = "http://127.0.0.1:8082")
public class SongController {

}