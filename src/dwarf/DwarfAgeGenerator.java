/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwarf;

import interfaces.AgeGenerator;
import interfaces.Randomizer;

/**
 *
 * @author Greatmelons
 */
public class DwarfAgeGenerator implements AgeGenerator {

    Randomizer randomizer;

    public DwarfAgeGenerator(Randomizer randomizer) {
        this.randomizer = randomizer;
    }
    /**
     *
     * @return
     */
    @Override
    public int generateAge() {
        int age = randomizer.getRandomNumber(300-25) + 25;
        return age;
    }
    
}