package org.pursuit.testing_revisited_creating_tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.pursuit.testing_revisited_creating_tests.translator.SillyTranslator;

public class SillyTranslatorUnitTest {

    // TODO: add setup method

    // TODO: add test for every method with a non-void return type in SillyTranslator.java


    //test for doubleTalk
    //use GIVEN, WHEN, THEN
    @Test
    public void checkDoubleTalk(){
        //Given
        String testString = "pursuit";
        String expectedResult = "Pursuit pursuit";

        //When - save in a string bc the actual method returns a String
        String result = SillyTranslator.getInstance().doubleTalk(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    //failed until I added input == null in the method if statement
    @Test
    public void checkDoubleTalk_WithNullInput(){
        //Given
        String testString = null;
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().doubleTalk(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDoubleTalk_WithNumberInput(){
        //Given
        String testString = "1234";
        String expectedResult = "1234 1234";

        //When
        String result = SillyTranslator.getInstance().doubleTalk(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }


    //failed until I added input.length() == 0 in the method if statement
    @Test
    public void checkDoubleTalk_WithEmptyString(){
        //Given
        String testString = "";
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().doubleTalk(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSnakeSpeak(){
        //Given
        String testString = "silly";
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSnakeSpeak_WithEmptyString(){
        //Given
        String testString = "";
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSnakeSpeak_WithNumberInput(){
        //Given
        String testString = "1234";
        String expectedResult = "1234";

        //When
        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    //failed until I added the if input == null check in my snakeSpeak method
    @Test
    public void checkSnakeSpeak_WithNullInput(){
        //Given
        String testString = null;
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSnakeSpeak_WithUpperCaseSWord(){
        //Given
        String testString = "Stolen";
        String expectedResult = "Stolen";

        //When
        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSarcasticRebuttal(){
        //Given
        String testString = "Stolen";
        String expectedResult = "Stolen shmolen";

        //When
        String result = SillyTranslator.getInstance().sarcasticRebuttal(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void checkSarcasticRebuttal_WithNumbers(){
        //Given
        String testString = "1234";
        String expectedResult = "1234 ";

        //When
        String result = SillyTranslator.getInstance().sarcasticRebuttal(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSarcasticRebuttal_WithNullInput(){
        //Given
        String testString = null;
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().sarcasticRebuttal(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSarcasticRebuttal_WithNumbersAnsLetters(){
        //Given
        String testString = "1234abcd";
        String expectedResult = "1234abcd shmabcd";

        //When
        String result = SillyTranslator.getInstance().sarcasticRebuttal(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypher(){
        //Given
        String testString = "Stolen";
        String expectedResult = "Tupmfo";

        //When
        String result = SillyTranslator.getInstance().caesarCypher(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypher_WithNullInput(){
        //Given
        String testString = null;
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().caesarCypher(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypher_WithNumberInput(){
        //Given
        String testString = "1234";
        String expectedResult = "2345";

        //When
        String result = SillyTranslator.getInstance().caesarCypher(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypher_WithLastCharactersOfAlphabet(){
        //Given
        String testString = "xyz";
        String expectedResult = "yza";

        //When
        String result = SillyTranslator.getInstance().caesarCypher(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypher_WithNumber(){
        //Given
        String testString = "xyz";
        String expectedResult = "yza";

        //When
        String result = SillyTranslator.getInstance().caesarCypher(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypher_WithTildas(){
        //Given
        String testString = "~";
        String expectedResult = " ";

        //When
        String result = SillyTranslator.getInstance().caesarCypher(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypher_WithEmoji(){
        //Given
        String testString = "🙃";
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().caesarCypher(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    //checks the if the instance of 2 dif SillyTranslator are the same
    @Test
    public void SillyTranslator_testGetInstance(){
        SillyTranslator result = SillyTranslator.getInstance();
        SillyTranslator results2 = SillyTranslator.getInstance();

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof SillyTranslator);
        Assert.assertEquals(result, results2);
        Assert.assertSame(result, results2);
    }

    @Test
    public void checkPigKLatin(){
        //Given
        String testString = "tom";
        String expectedResult = "omtay";

        //When
        String result = SillyTranslator.getInstance().pigLatin(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkPigKLatin_WithNumbers(){
        //Given
        String testString = "123";
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().pigLatin(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkPigKLatin_WithNullInput(){
        //Given
        String testString = null;
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().pigLatin(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkPigKLatin_WithNonLettersOrNumbers(){
        //Given
        String testString = "!";
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().pigLatin(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkReverse(){
        //Given
        String testString = "Lola";
        String expectedResult = "aloL";

        //When
        String result = SillyTranslator.getInstance().reverse(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkReverse_WithNumbers(){
        //Given
        String testString = "1234";
        String expectedResult = "4321";

        //When
        String result = SillyTranslator.getInstance().reverse(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkReverse_WithEmptyString(){
        //Given
        String testString = "";
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().reverse(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkReverse_WithNullInput(){
        //Given
        String testString = null;
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().reverse(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkElide(){
        //Given
        String testString = "Lola";
        String expectedResult = "Lola";

        //When
        String result = SillyTranslator.getInstance().elide(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkElide_WithMoreThan6Characters(){
        //Given
        String testString = "LolaAbudu";
        String expectedResult = "Lol...";

        //When
        String result = SillyTranslator.getInstance().elide(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkElide_WithNullInput(){
        //Given
        String testString = null;
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().elide(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkElide_WithMoreThan6Numbers(){
        //Given
        String testString = "1234567";
        String expectedResult = "123...";

        //When
        String result = SillyTranslator.getInstance().elide(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkElide_WithEmptyString(){
        //Given
        String testString = "";
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().elide(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSillyCase(){
        //Given
        String testString = "Mom";
        String expectedResult = "MoM";

        //When
        String result = SillyTranslator.getInstance().sillyCase(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSillyCase_WithEmptyString(){
        //Given
        String testString = "";
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().sillyCase(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSillyCase_WithNullInput(){
        //Given
        String testString = null;
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().sillyCase(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSillyCase_WithNumbers(){
        //Given
        String testString = "1234";
        String expectedResult = "1234";

        //When
        String result = SillyTranslator.getInstance().sillyCase(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDeVowel(){
        //Given
        String testString = "Mommy";
        String expectedResult = "mmmy";

        //When
        String result = SillyTranslator.getInstance().deVowel(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDeVowel_WithNoVowels(){
        //Given
        String testString = "wxyz";
        String expectedResult = "wxyz";

        //When
        String result = SillyTranslator.getInstance().deVowel(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDeVowel_WithOnlyVowels(){
        //Given
        String testString = "aeiou";
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().deVowel(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDeVowel_WithNumbers(){
        //Given
        String testString = "1234";
        String expectedResult = "1234";

        //When
        String result = SillyTranslator.getInstance().deVowel(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDeVowel_WithEmptyString(){
        //Given
        String testString = "";
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().deVowel(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDeVowel_WithAllUpperCase(){
        //Given
        String testString = "MANNY";
        String expectedResult = "mnny";

        //When
        String result = SillyTranslator.getInstance().deVowel(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDeVowel_WithNumbersAndLetters(){
        //Given
        String testString = "MANNY1234";
        String expectedResult = "mnny1234";

        //When
        String result = SillyTranslator.getInstance().deVowel(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDeConsonant(){
        //Given
        String testString = "Mommy";
        String expectedResult = "o";

        //When
        String result = SillyTranslator.getInstance().deConsonant(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDeConsonant_WithNumbersAndLetters(){
        //Given
        String testString = "Mommy123";
        String expectedResult = "o";

        //When
        String result = SillyTranslator.getInstance().deConsonant(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDeConsonant_WithNullInput(){
        //Given
        String testString = null;
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().deConsonant(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDeConsonant_WithNoConsonants(){
        //Given
        String testString = "aeiou";
        String expectedResult = "aeiou";

        //When
        String result = SillyTranslator.getInstance().deConsonant(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDeConsonant_WithOnlyConsonants(){
        //Given
        String testString = "aeiou";
        String expectedResult = "aeiou";

        //When
        String result = SillyTranslator.getInstance().deConsonant(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }
    // TODO: add tear down method

}
