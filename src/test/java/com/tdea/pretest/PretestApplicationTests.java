package com.tdea.pretest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PretestApplicationTests {

    @Test
    void idPasswordEquals() {
        String dbPasword = "Hola";
        String Pasword = "Hola";

        boolean result = UserUtils.isPasswordEqual(dbPasword, Pasword);

        assertTrue(result);

    }

}
