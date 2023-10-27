package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import org.junit.runner.RunWith;
import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.tests.BaseTest;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class MainMenuSteps extends BaseTest {

    public static void enterMainMenuButton(){
        Allure.step("Нажатие на кнопку главного меню");
        ViewInteraction enterMainMenuButton = onView(withId(R.id.main_menu_image_button));
        enterMainMenuButton.perform(click());
    }
}

