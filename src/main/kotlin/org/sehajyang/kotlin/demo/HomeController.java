package org.sehajyang.kotlin.demo;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author seha
 * @date 2019-03-05
 */
@RestController
public class HomeController {
    @GetMapping("/java")
    public ModelMap java(){
        ModelMap modelmap = new ModelMap();
        modelmap.addAttribute("test","1");

        return modelmap;
    }
}
