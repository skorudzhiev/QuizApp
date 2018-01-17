# QuizApp
**Version 1.0 2017/04/02**

Educational app that quizzes a user with a few questions and returns feedback with the overall results. The app consists of different layouts used for the question's styling and input methods

![](https://github.com/skorudzhiev/QuizApp/blob/master/readme/quizApp1%20-%20Nexus_5X_API_24_5554.png) _______ ![](https://github.com/skorudzhiev/QuizApp/blob/master/readme/quizApp2%20-%20Nexus_5X_API_24_5554.png)
  
![alt text](https://github.com/skorudzhiev/QuizApp/blob/master/readme/quizApp3%20-%20Nexus_5X_API_24_5554.png)

### Device permissions
*This app doesn't need any specific permissions to provide the featured functionality*

### Tests
> * Tested on 
>   * Nexus 5X API 24(Android 7.0, API 24) 
>   * 10.1 WXGA (Tablet) API 24

## General Usage Notes

```Gradle
defaultConfig {
        minSdkVersion 15
        targetSdkVersion 25
    }
```
* User is presented with a list of questions on a variety of topics
* All answers needs to be answered, marked, filled properly and carefully
* Submit button is pressed at the end of the quiz to check the results

## Features

* The app has a single layout and a single activity
* Within the activity there is a single implemented method called *Submit* which consists of the following logic: 
  * stores the answer's values
  * checks the user's answers compared to correct quiz answers stored in the method 
  
> Reference of the validation logic for the answers at the method's anchor
```Java
if (a10c.isChecked() && a10d.isChecked() && a10f.isChecked() && a10i.isChecked()
                && a10j.isChecked() && !a10a.isChecked() && !a10b.isChecked() && !a10e.isChecked() && !a10g.isChecked()
                && !a10h.isChecked() && !a10k.isChecked() && !a10l.isChecked()) {
            qa10 = "10. Your answer is correct!";
        } else {
            qa10 = "10. Incorrect answer; Please try again";
        }

        String results = "RESULTS: " + "\n" + qa1 + "\n" + qa2 + "\n" + qa3 + "\n" + qa4
                + "\n" + qa5 + "\n" + qa6 + "\n" + qa7 + "\n" + qa8 + "\n" + qa9 + "\n" + qa10;
        Toast.makeText(getApplicationContext(), results, Toast.LENGTH_LONG).show();
```
> This was my first Java if statement :bowtie: :smiley:

### Future direction
The goal is to extend the features of the initially created educational app in course of following actions 
* Create a library which can populate the app with more questions 
* Splitting the quiz content on different topics
* Make the app entertaining
