package com.spring.mvc.controller;

import com.spring.mvc.controller01.KeyboardDTO;
import org.junit.jupiter.api.Test;

public class KeyboardDTOTest {

    @Test
    public void keyboardDTOTest(){
        KeyboardDTO keyboard = new KeyboardDTO();
        keyboard.getColor();
        keyboard.setModelName("키크론 K8 Retro");
        System.out.println("setter 확인 : " + keyboard);
    }
}
