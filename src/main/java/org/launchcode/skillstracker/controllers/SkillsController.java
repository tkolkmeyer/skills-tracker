package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skillTracker() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1> Skills Tracker </h1>" +
                        "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                        "<ol>" +
                            "<li>JavaScript</li>" +
                            "<li>Java</li>" +
                            "<li>C#</li>" +
                        "</ol>" +
                        "</body>" +
                "</html>";
        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String form() {

        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post'>" +
                        "<label for = 'name'> Name: </label>" +
                        "<input type= 'text' id = 'name' name = 'name'>" +

                        "<p> My Favorite Language </p>" +
                        "<select name = 'firstFavorite' id = 'firstFavorite'>" +
                        "<option value = 'Java'>Java</option>" +
                        "<option value = 'JavaScript'>JavaScript</option>" +
                        "<option value = 'Python'>Python</option>" +
                        "</select>" +

                        "<p> My Second Favorite Language </p>" +
                        "<select name = 'secondFavorite' id = 'secondFavorite'>" +
                        "<option value = 'Java'>Java</option>" +
                        "<option value = 'JavaScript'>JavaScript</option>" +
                        "<option value = 'Python'>Python</option>" +
                        "</select>" +

                        "<p> My Third Favorite Language </p>" +
                        "<select name = 'thirdFavorite' id = 'thirdFavorite'>" +
                        "<option value = 'Java'>Java</option>" +
                        "<option value = 'JavaScript'>JavaScript</option>" +
                        "<option value = 'Python'>Python</option>" +
                        "</select>" +
                        "<br>" +
                        "<input type = 'submit'></input>" +
                        "</form>" +
                        "</body>" +
                "</html>";
        return html;

    }

    @PostMapping("form")
    @ResponseBody
    public String returnForm(@RequestParam String name, @RequestParam String firstFavorite, @RequestParam String secondFavorite, @RequestParam String thirdFavorite) {
        String html =
                "<html>" +
                        "<body>" +
                            "<h1>" + name + "</h1>" +
                            "<ol> 1. " + firstFavorite + "</ol>" +
                            "<ol> 2. " + secondFavorite + "</ol>" +
                            "<ol> 3. " + thirdFavorite + "</ol>" +
                        "</body>" +
                "</html>";
        return html;
    }
}
