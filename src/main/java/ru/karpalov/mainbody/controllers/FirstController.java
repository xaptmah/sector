package ru.karpalov.mainbody.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.karpalov.mainbody.components.SearchR;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;

@Controller

public class FirstController {

    @GetMapping
    public String helloPage(@RequestParam(value = "surname",required = false) String surname,
                            Model model, HttpServletResponse response) throws IOException {
        model.addAttribute("message",new SearchR().returnRamp(surname));

        return "first/hello";
    }


}
