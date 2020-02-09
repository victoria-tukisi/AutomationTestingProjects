# Android Appium Project
# APK Used: ApiDemos-debug.apk
Create your virtual device using Android studio 
Goto tools and select "AVD Manager"
Add a phone hardware e.g: Nexus 6P
Select system image e.g: Oreo Android 8.1
Set AVD Name e.g: DemoEmulator8.1
Click Finish
Start your emulator device
Start appium server via CMD : type appium + enter_key
Run the tests on Eclipse:
To run the "basicNavigation" class, right-click and select Run As Java Application
To run the "basicFunctionality" class, right-click and select Run As Java Application

To use a real device:
Install teamviewer on your machice
Install TeamViewer QuickSupport on your real device
Connect your real device on your machine using a USB cable

Configure your real device:
Goto your Phone settings and navigate to Aboutphone or Software Information option
Tab the Build Number Option Seven times to set the developer mode
Go back to settings and you should see an item called "Developer options"
Select "Developer options"
Enable USB debugging 

Connect your real device via TeamViewer on your machine using the USB cable
Verify that your real device is connected: On CMD : type adb devices + enter
Your device should display as an attached device

Next, Start appium server via CMD : type appium + enter_key
Run the tests on Eclipse:
To run the "basicNavigation" class, right-click and select Run As Java Application
To run the "basicFunctionality" class, right-click and select Run As Java Application
