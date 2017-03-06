package com.angkorsuntrix.techtalk001;

import com.angkorsuntrix.techtalk001.login.LoginActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
public class LoginScreenTest {

    @Rule
    public ActivityTestRule<LoginActivity> mTestRule
            = new ActivityTestRule(LoginActivity.class);

    @Test
    public void clickLoginButton() throws Exception {
        onView(withId(R.id.btn_login)).perform(click());
        onView(withId(R.id.txt_username)).perform(typeText(""));
        onView(withId(R.id.txt_password)).perform(typeText("hmm"));
        onView(withText("invalid username")).check(matches(isDisplayed()));

    }

    @Test
    public void clickLoginButton_OpenHomeScreen() throws Exception {
        onView(withId(R.id.txt_username)).perform(typeText("sfsf"));
        onView(withId(R.id.txt_password)).perform(typeText("hmm"));
        onView(withId(R.id.btn_login)).perform(click());
        onView(withId(R.id.btn_login)).check(matches(not(isDisplayed())));

    }

}
