package com.example.lab6_3

import android.os.SystemClock
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.lab6_3.EspressoTestsMatchers.existDrawable


import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule



/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    val rule = activityScenarioRule<MainActivity>()


    @Test
    fun checkImageView() {
        SystemClock.sleep(5000)
        Espresso.onView(ViewMatchers.withId(R.id.our_image))
            .check(ViewAssertions.matches(existDrawable()))
    }

//    @Test
//    fun checkImageView() {
        //val name = "D:/Downloads/android-lectures-master/android-lectures-master/labs/04/lab6_3/app/src/main/res/drawable-v24/n.png"
        //val namepath = "D:\\Downloads\\android-lectures-master\\android-lectures-master\\labs\\04\\lab6_3\\app\\src\\main\\res\\drawable-v24"
        //val name = "D:\\Android\\min.png"

//        val namepath = mainRule.activity.filesDir.path
//        val name = (namepath+"min.png")
//        val file = File(name)
//          val uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
//        SystemClock.sleep(2000)
//        uiDevice.takeScreenshot(file)

        // val context = InstrumentationRegistry.getInstrumentation().targetContext.applicationContext
//        //val e = getFilesDirectory(context, Locale.getDefault())
//        val namepath = mainRule.activity.filesDir.path
//        Log.d("path", namepath)
//        val screenshotFileName = namepath +
//            System.currentTimeMillis().toString() + "_" + "new" + ".png"
//        val screenshotFile = File(screenshotFileName)
//
//        UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
//            .takeScreenshot(screenshotFile)

//        mainRule.activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
//        SystemClock.sleep(5000)
//        Espresso.onView(ViewMatchers.withId(R.id.our_image))
//            .check(matches(existDrawable()))

//        val path = File(
//            //Environment.getDataDirectory().absolutePath
//            "D:/Downloads/android-lectures-master/android-lectures-master/labs/04/lab6_3/app/src/main/res/drawable-v24"
//        )
//        if (!path.exists()) {
//            path.mkdirs()
//            Log.d("path", "STUPID")
//        }
//        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
//        val filename = "new" + "-sos" + ".png"
//        device.takeScreenshot(File(path, filename))

    } //контент резолвер
