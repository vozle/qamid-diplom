package ru.iteco.fmhandroid.ui.tests;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

import androidx.test.filters.LargeTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import io.qameta.allure.kotlin.Description;
import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ui.screenElements.MainScreen;
import ru.iteco.fmhandroid.ui.steps.AuthScreenSteps;
import ru.iteco.fmhandroid.ui.steps.MainMenuSteps;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class MainMenuTests  extends BaseTest {

    @Test
    @DisplayName("Отображение экрана - Главное меню")
    @Description("Проверка кнопки main - Главное меню")
    public void shouldMainMenuView(){
        AuthScreenSteps.ValidDataEnter();
        MainMenuSteps.enterMainMenuButton();
        MainScreen.aboutOfMenu.check(matches(isDisplayed()));
    }

    @Test
    @DisplayName("Нажатие на кнопку - News")
    @Description("В главном меню открыть вкладку news и убедиться что новости в ленте присутствуют")
    public void shouldNewsListOpen(){
        AuthScreenSteps.ValidDataEnter();
        MainScreen.buttonToExpandOrHideNewsPart.perform(click());
        MainScreen.containerListForNews.check(matches(isDisplayed()));
    }
}
