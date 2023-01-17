package com.example.exercisesimpledictionarywebapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@org.springframework.stereotype.Controller
public class Controller {
    static HashMap<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("apple","tao");
        dictionary.put("orange","cam");
        dictionary.put("red", "do");
    }

    @RequestMapping(value = "/")
    public ModelAndView showForm() {
        return new ModelAndView("form");
    }

    @RequestMapping("/translate")
    public ModelAndView lookUp(@RequestParam("eng") String eng) {
        String result = null;
        for (String key:
                dictionary.keySet()) {
            if (key.equals(eng)) {
                result = dictionary.get(key);
                break;
            }
        }
        ModelAndView modelAndView = new ModelAndView("result", "result", result);
        return modelAndView;
    }
}
