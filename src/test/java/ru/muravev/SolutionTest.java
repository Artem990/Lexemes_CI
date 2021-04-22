package ru.muravev;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void multipleInt() {
        Assert.assertEquals(5, solution.multipleInt(1,4));
    }

    @Test
    public void multiDivTest(){
        String twoPlusTwo = "2 + 2";
        List<Solution.Lexeme> lexemes = Solution.Lexeme.lexAnalyze(twoPlusTwo);
        Solution.Lexeme.LexemeBuffer lexemeBuffer = new Solution.Lexeme.LexemeBuffer(lexemes);
        int result = Solution.Lexeme.expr(lexemeBuffer);
        Assert.assertEquals(4, result);
    }
}