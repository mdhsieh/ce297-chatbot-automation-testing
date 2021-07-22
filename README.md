# ce297-chatbot-automation-testing
AI automation testing of the English with Andy chatbot app.

Selenium and Appium were used to generate test scripts.
Each test script focuses on an AI test parameter.
These scripts run test cases automatically on the Android version of the app
in an emulator.

### Run
Start Appium server and start an Android emulator which has
the app installed. Open the app in the emulator.

Test scripts are in `app/src/test` folder. Right click and select run to run the test.
Screenshots of test case results are in `app/output` folder.

Subfolders contain the output of a particular parameter.
For example `app/output/subject` has all screenshots from `SubjectTest` script.
