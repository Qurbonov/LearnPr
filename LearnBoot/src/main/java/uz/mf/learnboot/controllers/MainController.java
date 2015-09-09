/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.mf.learnboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author qurbonov
 */
@Controller
public class MainController {

    @RequestMapping("/")

    String home() {
        return "index.html";
    }
}
